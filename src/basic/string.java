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
        
        //length and characters of a string
        String s = "Hi, all";

        int len = s.length(); // the len is 7
        char theFirstChar = s.charAt(0);  // 'H' has the index 0
        char theFifthChar = s.charAt(4); // 'a' has the index 4
        char theLastChar = s.charAt(s.length() - 1); // 'l' has the index 6

        System.out.println(len);
        System.out.println(theFirstChar);
        System.out.println(theFifthChar);
        System.out.println(theLastChar);

        //Useful methods of strings
        String text = "The simple text string";

        boolean empty = text.isEmpty(); // false
        String textInUpperCase = text.toUpperCase(); // "THE SIMPLE TEXT STRING"
        boolean startsWith = textInUpperCase.startsWith("THE"); // true
        /* replace all space characters with empty strings */
        String noSpaces = textInUpperCase.replace(" ", ""); // "THESIMPLETEXTSTRING"
        String textWithWhitespaces = "\t text with whitespaces   !\n  \t";
        String trimmedText = textWithWhitespaces.trim(); // "text with whitespaces   !"


        //Exceptions when processing strings
        String s1 = null;
        int length = s1.length(); // it throws NullPointerException

        String s2 = "ab";
        char c = s2.charAt(2); // it throws StringIndexOutOfBoundsException because indexing starts with 0


        //Concatenating strings
        String firstName = "John";
        String lastName = "Smith";

        // concatenation using the "+" operator
        String fullName1 = firstName + " " + lastName; // "John Smith"

        // concatenation using the concat method
        String fullName2 = firstName.concat(" ").concat(lastName); // "John Smith"


        //Appending values to a string
        String str = "str" + 10 + false; // the result is "str10false"

        String shortString = "str";
        int number = 100;

        String result1 = shortString + number + 50; // the result is "str10050"
        String result2 = number + 50 + shortString; // the result is "150str"


        //compare strings
        String first = "first";
        String second = "second";

        String anotherFirst = "first";
        String secondInUpperCase = "SECOND";

        System.out.println(first.equals(second)); // false, the strings have different values
        System.out.println(first.equals(anotherFirst)); // true, the strings have the same value

        System.out.println(second.equals(secondInUpperCase)); // false, the strings have different cases
        System.out.println(second.equalsIgnoreCase(secondInUpperCase)); // true, it ignores cases
    }
}
