public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello from the main thread.");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread == ");
        anotherThread.start();

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
                try {
                    anotherThread.join();
                    System.out.println(ThreadColor.ANSI_RED + "AnotherThread terminated or timed out so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ThreadColor.ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        });
        mySecondRunnableThread.start();
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello again from the main thread.");
//        anotherThread.start(); Starting the thread a second time will throw an exception
    }
}
