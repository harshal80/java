import java.util.Scanner;

public class types_of_errors {
    public static void main(String[] args) {
        // Syntax Error Demo
        // int a=0 //Error : no semicolon!
        // b=8; //Error: b not declared datatype

        // Logical error demo
        // Write a program to print all prime numbers between 1 to 10
        // System.out.println(2);
        // for (int i = 1; i < 5; i++) {
        // System.out.println(2 * i + 1);
        // }
        // Runtime Error demo
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Ineger part of 1000 divided by k is " + 1000 / k);

    }
}
