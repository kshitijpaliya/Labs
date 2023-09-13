/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

class Box {
       double d, h, w;
       Box(double width, double height, double depth)
       {
        w=width;
        h=height;
        d=depth;
    }
       double Volume()
       {
           double v;
           v=h*w*d;
           return v;
       }
       
       public static void main(String args[]){
           double m, n, o;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter height width and depth:");
           m=sc.nextDouble();
           n=sc.nextDouble();
           o=sc.nextDouble();
           Box obj = new Box(m,n,o);
           System.out.println("The volume is: " + obj.Volume());
       }
}


