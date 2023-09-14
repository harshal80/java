class mythr1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Thank You: ");
            try {
                Thread.sleep(455);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class mythr2 extends Thread {
    public void run() {
        int i = 1;
        while (i < 10) {
            System.out.println("My Thank you: ");
            i++;
        }
    }
}

public class thread_methods {
    public static void main(String[] args) {
        mythr1 t1 = new mythr1();
        mythr2 t2 = new mythr2();
        t1.start();
        t2.start();

    }
}
