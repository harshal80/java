interface a {
    void a1();

    void a2();

    default void a3() {
        System.out.println("may or may not Override in implementing classes");
    }
}

class B implements a {
    public void a1() {
        System.out.println("class B a1");
    }

    public void a2() {
        System.out.println("class B a2");
    }
}

public class inteface_default {
    public static void main(String[] args) {
        B b = new B();
        b.a1();
        b.a2();
        b.a3();
    }
}
