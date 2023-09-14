import java.util.Scanner;

public class rectursion {
    static int fact(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * fact(x - 1);
        }

    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(fact(num));

    }
}
