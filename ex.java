import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        int rollNum = 118;
        // Scanner st = new Scanner(System.in);
        float marks1 = 99.8f;
        float marks2 = 88.99f + marks1;
        float marks3 = 88.99f + marks2;
        float marks4 = 88.99f + marks3;
        float marks5 = 88.99f + marks4;
        System.out.println("roll number : " + rollNum + " Prasentege is: " + marks5 / 5);
    }
}
