package basic;

public class Switch {

    public static void main(String[] args) {
        //conditional statement - Switch
        int day = 1; // 1- monday; 2- tuesday

        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("wed - sun");
        }
    }
}