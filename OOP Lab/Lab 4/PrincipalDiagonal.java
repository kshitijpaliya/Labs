/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
class PrincipalDiagonal {
    public static void main (String args[]){
        int twoD[][]=new int[50][50];
        int i, j, n, sum=0;
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
                if(i==j)
                    sum=sum+twoD[i][j];
            }
        }
        System.out.println("The sum of principal diagonal elements is: "+sum);
    }
}
