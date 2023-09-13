/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
class Employee {
    String name;
    String city;
    int salary, total;
    int da, hra;
    
    void getdata(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the details: ");
    name=sc.nextLine();
    city=sc.nextLine();
    salary=sc.nextInt();
    da=sc.nextInt();
    hra=sc.nextInt();
    calculate();
    }
    
    int calculate()
    {
        total=salary+salary*da/100+salary*hra/100;
        return total;
    }
    
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("Salary: "+salary);
        System.out.println("DA: "+da);
        System.out.println("HRA: "+hra);
        System.out.println("Total Salary: "+total);
    }
    
    public static void main (String args[])
    {
        Employee obj = new Employee();
        obj.getdata();
        obj.display();
    }
}
