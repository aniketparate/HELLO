package practice_code;

import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pen = 10; notebook = 40
        int cash = sc.nextInt();
        if(cash < 10){
            System.out.println("cannot buy anything");
            System.out.println("get more cash");
        }
        else if(cash > 10 && cash < 50){
            System.out.println("can get 1 thing");
        }
        else {
            System.out.println("can buy both");
        }
    }
}
