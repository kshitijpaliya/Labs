/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
class Symmetric {
    public static void main (String args[]){
        int twoD[][]=new int[50][50];
        int i, j, n, sum=0, flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of the MATRIX:");
        n=sc.nextInt();
        System.out.println("Enter the elements of the matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                twoD[i][j]=sc.nextInt();
            }
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(twoD[i][j]==twoD[j][i])
                    flag=1;
            }
        }
        if(flag==1)
            System.out.println("The matrix is symmetric");
        else
            System.out.println("The matrix is not symmetric");
    }
}