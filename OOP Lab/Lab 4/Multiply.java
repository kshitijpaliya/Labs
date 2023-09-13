/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
class Multiply {
    public static void main (String args[]){
        int mat1[][]=new int[50][50];
        int mat2[][]=new int[50][50];
        int mat3[][]=new int[50][50];
        //int mat4[][]=new int[50][50];
        int i, j, m, n, p, q, sum=0;
        Scanner sc = new Scanner(System.in);
        
        //oder of 1st matrix
        System.out.println("Enter the order of the 1st MATRIX:");
        m=sc.nextInt();
        n=sc.nextInt();
        
        //order of 2nd matrix
        System.out.println("Enter the order of the 2nd MATRIX:");
        p=sc.nextInt();
        q=sc.nextInt();
        
        
        System.out.println("Enter the elements of the 1st matrix:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter the elements of the 2nd matrix:");
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }
        
        //add
        if(n==p && m==q){
        for(i=0;i<m;i++)
        {
            for(j=0;j<q;j++)
            {
                sum+=mat1[i][j]+mat2[i][j];
            }
        }
        }
        System.out.println("The sum is:"+sum);
        //System.out.print("\t");
          
        
        
        if(n==p){
        for(i=0;i<m;i++)
        {
            for(j=0;j<q;j++)
            {
                mat3[i][j]=0;
                for(int k =0;k<n;k++)
                {
                    mat3[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        }
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                System.out.println(mat3[i][j]);
                //System.out.print("\t");
            }
        }
        
    }
}
