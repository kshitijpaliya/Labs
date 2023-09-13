/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

class Pattern_1 {
    public static void main(String args[]){
       int i, j, n,c=1;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows");
       n=sc.nextInt();
       for(i=0;i<n;i++){
           for(j=0;j<=i;j++){
               System.out.println(c);
               c++;
           }
           System.out.println("\n");
       }
    }
}
