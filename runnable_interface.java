class t1 implements Runnable {
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("Thread is Running");
        }
    }
}

class t2 implements Runnable {
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(" Second Thread is also Running");
        }
    }
}

public class runnable_interface {
    public static void main(String[] args) {
        t1 obj1 = new t1();
        t2 obj2 = new t2();
        Thread t = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t.start();
        t2.start();

    }
}
