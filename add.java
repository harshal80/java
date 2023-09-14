class sum {
    private int a;
    private int b;

    void addition(int c, int d) {
        a = c;
        b = d;
    }

    void print() {
        System.out.println("the addion of: " + (a + b));
    }
}

public class add {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 20;
        sum a = new sum();
        a.addition(num, num2);
        a.print();
    }
}
