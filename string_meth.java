public class string_meth {
    public static void main(String[] args) {
        String name = "Harshal";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String uString = name.toUpperCase();
        System.out.println(uString);

        String nonTrime = "     harshal      ";
        System.out.println(nonTrime);

        String trimedString = nonTrime.trim();
        System.out.println(trimedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 5));

        System.out.println(name.replace('r', 'p'));

        System.out.println(name.startsWith("har"));
        System.out.println(name.endsWith("dd"));

        System.out.println(name.charAt(4));

        String modifiname = "Harshahahal";
        System.out.println(modifiname.indexOf("haha"));
        System.out.println(modifiname.indexOf("haha", 6));
        System.out.println(modifiname.lastIndexOf("haha", 7));

        System.out.println(name.equals("Harshal"));
        System.out.println(name.equalsIgnoreCase("HArshal"));

    }
}
