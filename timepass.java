import java.util.*;

class c extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("this is Thread in java");
        }
    }
}

public class timepass {
    public static void main(String[] args) {
        Thread b = new c();
        b.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("this is mean ");
        }
    }
}
