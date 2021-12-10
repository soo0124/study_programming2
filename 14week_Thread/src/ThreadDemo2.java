public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread task1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i=1; i<=10; i++) {
                            System.out.println("THREAD RUNNING");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
        );
        task1.start(); //run을 실행하겠다.

        for (int i=1; i<=10; i++) {
            System.out.println("MAIN FOR문");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
