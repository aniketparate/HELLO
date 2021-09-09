package basic;

public class datatypes {
    public static void main(String[] args) {
        //PRIMITIVES TYPE
        //byte - 1 bits [-128 to 127]
        //short - 2 bytes
        //int - 4 bytes [1,2,3,4]
        //long - 8 bytes
        //float - 4 bytes [3.14]
        //double - 8 bytes
        //char - 2 bytes [a,b,c,d]
        //boolean - 1 byte [true/false]
        byte age = 10;
        int phone = 1234567890;
        long phone1 = 12345678900L;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = true;

        //NON-PRIMITIVE TYPES
        String name = "ANIKET";
        String friend = new String( "Hello");
        System.out.println(name.length());
    }
}
