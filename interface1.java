interface bike {
    int bike1 = 5;

    void ktm();
}

class tata implements bike {
    public void ktm() {
        System.out.println("this is ktm bike");

    }
}

public class interface1 {
    public static void main(String[] args) {
        tata t = new tata();
        t.ktm();
    }
}
