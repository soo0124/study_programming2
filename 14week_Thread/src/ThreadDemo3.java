public class ThreadDemo3 {
    public static void main(String[] args) {
        new Thread( () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("THREAD RUNNING");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        ).start();  //람다식

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
