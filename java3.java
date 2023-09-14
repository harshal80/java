
class sum {
    public int a;
    int b;

    int setvalue(int num1, int num2) {
        num1 = a;
        num2 = b;
        return a + b;
    }

    void dispalay() {
        System.out.println(a + b);
    }
}

public class java3 {
    public static void main(String[] args) {
        sum add = new sum();
        int num1 = 20;
        int num2 = 30;
        add.setvalue(num1, num2);
        add.dispalay();

    }
}
