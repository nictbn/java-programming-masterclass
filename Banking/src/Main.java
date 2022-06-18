public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("CEC");
        if (bank.addBranch("Bucuresti")) {
            System.out.println("Bucuresti Branch created");
        }
        bank.addCustomer("Bucuresti", "Tim", 50.05);
        bank.addCustomer("Bucuresti", "Mike", 175.34);
        bank.addCustomer("Bucuresti", "Percy", 220.12);

        bank.addBranch("Brasov");
        bank.addCustomer("Brasov", "Bob", 150.54);

        bank.addCustomerTransaction("Bucuresti", "Tim", 44.22);
        bank.addCustomerTransaction("Bucuresti", "Tim", 12.44);
        bank.addCustomerTransaction("Bucuresti", "Mike", 1.65);

        bank.listCustomers("Bucuresti", true);
        bank.listCustomers("Brasov", true);

        bank.addBranch("Sinaia");
        if (!bank.addCustomer("Sinaia", "Brian", 5.53)) {
            System.out.println("Error Sinaia branch does not exist");
        }

        if (!bank.addBranch("Bucuresti")) {
            System.out.println("Bucuresti branch already exists");
        }

        if (!bank.addCustomerTransaction("Bucuresti", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch Bucuresti");
        }

        if (!bank.addCustomer("Bucuresti", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }
    }
}
