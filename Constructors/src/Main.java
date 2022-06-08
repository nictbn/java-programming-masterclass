public class Main {
    public static void main(String[] args) {
//        Account bobsAccount = new Account();
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.deposit(50);
//        bobsAccount.withdrawal(100);
//
//        bobsAccount.deposit(51);
//        bobsAccount.withdrawal(100);
//
//        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
//        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
