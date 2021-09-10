package basic;

public class logical_operator {

    public static void main(String[] args) {
        //logical operators
        // &&
        int a = 60;
        int b = 40;

//        if (a < 50 && b < 50)
//            System.out.println("both are les than 50");

        // ||
        if (a < 50 || b < 50)
            System.out.println("atleast one less than 50");

        boolean isAdult = false;
        if (!isAdult)
            System.out.println("is Adult");
        else
            System.out.println("not Adult");
    }
}
