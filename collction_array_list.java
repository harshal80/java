import java.util.*;

public class collction_array_list {
    public static void main(String[] args) {
        // ArrayList<Integer> l1 = new ArrayList<>();
        // ArrayList<Integer> l2 = new ArrayList<>();
        // l1.add(1);
        // l1.add(2);
        // l1.add(3);
        // l1.add(4);
        // l1.add(6);
        // l1.add(5, 5);// inserts 5 at the 5th index in l1

        // l2.add(11);
        // l2.add(12);
        // l2.add(13);
        // l2.add(14);

        // System.out.println(l1);

        // System.out.println("Array list before: " + l1);

        // l1.remove(0); //removeing the index that time use this .remove()
        // System.out.println("ArrayList afeter removing the value at index 0 : " + l1);

        // System.out.println("Array list:" + l1);
        // System.out.println("L1 list contain 7: " + l1.contains(7));
        // System.out.println("L1 list contain 4: " + l1.contains(4));

        // System.out.println("L1 Array list : " + l1);
        // System.out.println("L1 Array list : " + l2);
        // l1.addAll(l2); // add another list member that time use .addAll()
        // System.out.println("L1 Array list after meging: " + l1);
        // System.out.println("L2 Array list:" + l2);

        // System.out.println("The first occurence of 3 in l1 is at index :" +
        // l1.indexOf(3));
        // System.out.println("The last occurence of 3 in l1 is at index :" +
        // l1.lastIndexOf(3));

        // --------------------- The main program start----------------------------

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);
        l1.add(0, 1);

        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        // l1.clear();
        l1.set(1, 566);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}
