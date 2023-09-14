interface A {
    public static void call() {
        add(10, 20);
    }

    private static void add(int x, int y) {
        System.out.println("Sum of two numbers : " + (x + y));
    }
}

class B implements A {
    public void sub(int x, int y) {
        System.out.println("sub of two numbers: " + (x - y));
    }
}

public class interface_private {
    public static void main(String[] args) {
        B b = new B();
        A.call();
        b.sub(199, 99);
    }
}
