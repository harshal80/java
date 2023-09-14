class mythread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 30) {
            System.out.println("Thread is Runnings");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class mythread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 30) {
            System.out.println("second Thread is Runnings");
            System.out.println("I am also happy!");
            i++;
        }
    }
}

public class thread {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();

    }
}
