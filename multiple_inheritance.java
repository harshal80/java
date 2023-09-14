interface a {
    void show(); // public + abstract

    // default void show() {
    // System.out.println("default method in intefaces");
    // }

    // static void show() {
    // System.out.println("default method in intefaces");
    // }
}

interface b {
    void show(); // public + abstract
}

class Multiple implements a, b {
    public void show() {
        System.out.println("Interface a & b");
    }

}

public class multiple_inheritance {
    public static void main(String[] args) {
        Multiple m = new Multiple();
        // a.show();
        m.show();
    }
}
