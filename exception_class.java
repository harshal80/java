import java.util.Scanner;

class myexception extends Exception {
    public String toString() {
        return "I am toSring()";
    }

    public String getMessage() {
        return "I am getMessage()";
    }

}

class MaxAgeException extends Exception {
    public String toString() {
        return "Age cammote be greater than 125";
    }

    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}

public class exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 9) {
            try {
                // throw new MyException();
                throw new ArithmeticException("This is an Exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");

            }
            System.out.println("Yes Finished");
        }
    }
}
