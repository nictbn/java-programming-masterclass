public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello from the main thread.");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another THread == ");
        anotherThread.run();

        new Thread() {
            public void run() {
                System.out.println(ThreadColor.ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();
        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();
        Thread mySecondRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED + "Hello from the anonymous class's implementation of run");
            }
        });
        mySecondRunnableThread.start();
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello again from the main thread.");
//        anotherThread.start(); Starting the thread a second time will throw an exception
    }
}
