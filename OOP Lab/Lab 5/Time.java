/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

class Time {
    int hrs, min, sec;
    Time()
    {
        hrs=0;
        min=0;
        sec=0;
    }
    
    Time(int h, int m, int s)
    {
        hrs=h;
        min=m;
        sec=s;
    }
    
    void display()
    {
        System.out.println("hh:mm:ss = "+ hrs + ":" + min + ":" + sec);
    }

    void add(Time a, Time b)
    {
        int h = a.hrs + b.hrs;
        int m = a.min + b.min;
        int s = a.sec + b.sec;
        System.out.println("hh:mm:ss = "+ h + ":" + m + ":" + s);
    }
    
    public static void main (String args[])
    {
        int h0, m0 , s0, h1, m1, s1, h2, m2, s2;
        Scanner sc = new Scanner(System.in);
           System.out.println("Enter hours minutes and seconds:");
           h0=sc.nextInt();
           m0=sc.nextInt();
           s0=sc.nextInt();
           Time obj = new Time(h0, m0, s0);
           obj.display();
           
           h1=sc.nextInt();
           m1=sc.nextInt();
           s1=sc.nextInt();
           
           h2=sc.nextInt();
           m2=sc.nextInt();
           s2=sc.nextInt();
           
           Time a = new Time(h1, m1, s1);
           a.display();
           Time b = new Time(h2, m2, s2);
           b.display();
           
           a.add(a, b);
                   
    } 
}

//class Time{    
//    public static void main (String args[])
//    {
//        int h0, m0 , s0, h1, m1, s1, h2, m2, s2;
//        Scanner sc = new Scanner(System.in);
//           System.out.println("Enter hours minutes and seconds:");
//           h0=sc.nextInt();
//           m0=sc.nextInt();
//           s0=sc.nextInt();
//           Time1 obj = new Time1(h0, m0, s0);
//           obj.display();
//           
//           h1=sc.nextInt();
//           m1=sc.nextInt();
//           s1=sc.nextInt();
//           
//           h2=sc.nextInt();
//           m2=sc.nextInt();
//           s2=sc.nextInt();
//           
//           Time1 a = new Time1(h1, m1, s1);
//           a.display();
//           Time1 b = new Time1(h2, m2, s2);
//           a.add(a, b);
//    }   
//}