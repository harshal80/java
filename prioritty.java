class mythr extends Thread {
    public mythr(String name) {
        super(name);
    }

    public void run() {
        int i = 1;
        while (i < 10) {
            // System.out.println("I am a Thread");
            System.out.println("Thank You : " + this.getName());
            i++;
        }
    }
}

public class prioritty {
    public static void main(String[] args) {

        mythr t1 = new mythr("harshal1");
        mythr t2 = new mythr("harshal2");
        mythr t3 = new mythr("harshal3");
        mythr t4 = new mythr("harshal4");
        mythr t5 = new mythr("harshal5 (most Important)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
