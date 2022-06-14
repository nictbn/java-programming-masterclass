import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContract();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone!");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to print contacts");
        System.out.println("2 - to add a contact");
        System.out.println("3 - to update an existing contact");
        System.out.println("4 - to remove an existing contact");
        System.out.println("5 - to query if an existing contact exists");
        System.out.println("6 - to print a list of available actions");
        System.out.println("Choose your action");
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String contactName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact contact = Contact.createContact(contactName, phoneNumber);
        if (mobilePhone.addNEwContact(contact)) {
            System.out.println("New contact added: " + contactName + ", phone = " + phoneNumber);
        } else {
            System.out.println("Cannot add, " + contactName + " already on file.");
        }
    }

    private static void updateContract() {
        System.out.println("Enter existing contact name: ");
        String contactName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(contactName);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNumber);
        if (mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String contactName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(contactName);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String contactName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(contactName);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + " phone number is " + existingContact.getPhoneNumber());
    }
}
