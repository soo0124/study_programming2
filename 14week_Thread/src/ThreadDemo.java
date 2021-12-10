public class ThreadDemo {
    public static void main(String[] args) {
        Thread task1 = new Thread(new MyRunnable());

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
//메인문과 작업 쓰레드의 순서는 OS 프로세스가 결정.
class MyRunnable implements Runnable{

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
