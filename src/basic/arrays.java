package basic;

import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {
        int age = 30;
        int physics = 97;
        int chem = 98;
        int eng = 95;

        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        System.out.println(marks[2]);

        //length
        System.out.println(marks.length);

        System.out.println(marks[0]);
        //sort (In ascending order)
        Arrays.sort(marks);
        System.out.println(marks[0]);

        int[] marks1 = {97, 98, 95};

        int[][] finalmarks = {{97, 98, 95}, {95, 95, 98}};
        System.out.println(finalmarks[0][0]);
        System.out.println(finalmarks[1][1]);
    }
}
