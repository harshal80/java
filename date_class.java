import java.util.*;

public class date_class {
    public static void main(String[] args) {
        // System.out.println("The maximum value of long is: " + Long.MAX_VALUE);
        // System.out.println("The value of current time in ms: " +
        // System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());

    }
}
