public class Main {
    public static void main(String[] args) {
        new Thread(new CodeToRun()).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from the second runnable");
            }
        }).start();
    }
}

class CodeToRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from the runnable");
    }
}
