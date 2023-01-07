public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", 7701, "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
    }
}
