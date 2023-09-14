import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        int num;
        Scanner ac = new Scanner(System.in);
        System.out.print("Enetr the number: ");
        num = ac.nextInt();
        // int i = 1;
        // while (i <= 10) {
        // System.out.println(num * i);
        // i++;
        // }

        // do {

        // System.out.println(num * i);
        // i++;
        // } while (i <= 10);
        for (int i = 1; i <= 10; i++) {

            System.out.println(num * i);

        }
    }
}
