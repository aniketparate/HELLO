package practice_code;

import java.util.Scanner;

class employee {
    Scanner sc = new Scanner(System.in);

    double Employee_no;
    String Empolyee_name;
    double basic;
    double DA;
    double ID;
    double IT;
    double netSalary;

    void employeeDetails () {
        System.out.print(" Enter Employee No : ");
        Employee_no = sc.nextInt();
        System.out.print(" Enter Employee Name : ");
        Empolyee_name = sc.next();
        System.out.print(" Enter Employee ID : ");
        ID= sc.nextInt();
        System.out.print(" Enter basic : ");
        basic = sc.nextInt();
        System.out.println();
    }

    void netSalary(){
        DA = 1.32 * basic;
        IT = 0.3 * (basic + DA);
        netSalary = (basic + DA) - IT;
    }

    void display() {
        System.out.println(" Employee No : " + Employee_no);
        System.out.println(" Employee Name : " + Empolyee_name);
        System.out.println(" ID : " + ID);
        System.out.println(" Basic : " + basic);
        System.out.println(" DA : " + DA);
        System.out.println(" IT : " + IT);
        System.out.println(" Net Salary : " + netSalary);
    }
}

public class Empolyee {
    public static void main(String[] args) {
        employee employ = new employee();

        employ.employeeDetails();
        employ.netSalary();
        employ.display();

    }
}
