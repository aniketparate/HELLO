package practice_code;

import java.util.Scanner;

class employee {
    Scanner sc = new Scanner(System.in);

    int size;
    double[] Employee_no = new double[size];
    String[] Employee_name = new String[size];
    double[] basic = new double[size];
    double[] DA = new double[size];
    double[] ID = new double[size];
    double[] IT = new double[size];
    double[] netSalary = new double[size];

    void employeeDetails () {
        System.out.print(" Enter no of entries : ");
        size = sc.nextInt();
        ///int size = this.size;
        for (int i = 0; i < size; i++) {
            System.out.print(" Enter Employee No : ");
            Employee_no[i] = sc.nextInt();
            System.out.print(" Enter Employee Name : ");
            Employee_name[i] = sc.next();
            System.out.print(" Enter Employee ID : ");
            ID[i]= sc.nextInt();
            System.out.print(" Enter basic : ");
            basic[i] = sc.nextInt();
            System.out.println();
        }
    }

    void netSalary(){
        for (int i = 0; i < size; i++) {
            DA[i] = 1.32 * basic[i];
            IT[i] = 0.3 * (basic[i] + DA[i]);
            netSalary[i] = (basic[i] + DA[i]) - IT[i];
        }
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(" Employee No : " + Employee_no[i]);
            System.out.println(" Employee Name : " + Employee_name[i]);
            System.out.println(" ID : " + ID[i]);
            System.out.println(" Basic : " + basic[i]);
            System.out.println(" DA : " + DA[i]);
            System.out.println(" IT : " + IT[i]);
            System.out.println(" Net Salary : " + netSalary[i]);
        }
    }
}

public class Empolyee {
    public static void main(String[] args) {
        employee emp = new employee();

        emp.employeeDetails();
        emp.netSalary();
        emp.display();
    }
}
