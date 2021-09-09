package basic;

public class string {
    public static void main(String[] args) {
        //String
        //concatenate (joining two strings)
        String name1 = "Hello";
        String name2 = "World";
        String name3 = name1 + name2;
        String name4 = name1 + " and " + name2;
        System.out.println(name3);
        System.out.println(name4);

        //charAt
        System.out.println(name1.charAt(2));

        //length
        System.out.println(name2.length());

        //replace
        String name5 = name1.replace('l', 'L');
        System.out.println(name5);
        System.out.println(name1);

        //substring
        System.out.println(name4.substring(10, 15));
    }
}
