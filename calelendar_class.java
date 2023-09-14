import java.util.Calendar;

public class calelendar_class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current year is : " + c.get(Calendar.YEAR));
        System.out.println("Current year is : " + c.get(Calendar.MONTH));
        System.out.println("Current year is : " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current year is : " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current year is : " + c.get(Calendar.MINUTE));
        System.out.println("Current year is : " + c.get(Calendar.SECOND));

        System.out.println("Current date is: " + c.getTime());
        c.add(Calendar.YEAR, 4);
        System.out.println("After 4 years : " + c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println("Before 12 Years : " + c.getTime());
        c.add(Calendar.MONTH, 2);
        System.out.println("After 2 months: " + c.getTime());
    }
}
