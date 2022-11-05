public class Main {
    public static void main(String[] args) {
//        new Thread(new CodeToRun()).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the second runnable");
//            }
//        }).start();

        new Thread(() -> {
            System.out.println("Printing from the lambda runnable");
            System.out.println("Line 2");
            System.out.format("This is line %d\n", 3);
        }).start();
    }
}

class CodeToRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from the runnable");
    }
}
