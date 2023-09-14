class Practice13 extends Thread {
    public void run() {
        int i = 1;
        while (i < 10) {
            System.out.println("Good Morning!");
            i++;
        }
    }
}

class Practice13b extends Thread {
    public void run() {
        // while(false){
        // try {
        // Thread.sleep(200);
        // }
        // catch (Exception e){
        // System.out.println(e);
        // }
        // System.out.println("Welcome");
        // }
    }
}

public class pra_set13 {
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        // p1.setPriority(6);
        // p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        // p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
