public class Main {
    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        System.out.println(Math.PI);
////        Math m = new Math();
//
//        int pw = 674312;
//        Password password = new Password(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(523266);
//        password.letMeIn(9773);
//        password.letMeIn(0);
//        password.letMeIn(-1);
//        password.letMeIn(674312);
//
//        Password epw = new ExtendedPassword(pw);
//        epw.storePassword();
//
//        epw.letMeIn(1);
//        epw.letMeIn(523266);
//        epw.letMeIn(9773);
//        epw.letMeIn(0);
//        epw.letMeIn(-1);
//        epw.letMeIn(674312);
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}