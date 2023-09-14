class mythr extends Thread {
    public mythr(String name) {
        super(name);

    }

    public void run() {
        int i = 34;
        System.out.println("Thank you");

    }
}

public class constructorsFrom_thread {
    public static void main(String[] args) {
        mythr t1 = new mythr("Harshal");
        mythr t2 = new mythr("Ramcarn");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of thread t is " + t1.getName());
        System.out.println("The id of the thread t2 is " + t2.getId());
        System.out.println("The name of thread t2 is " + t2.getName());

    }
}
