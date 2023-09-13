/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
class MagicSquare {
    public static void main (String args[]){
        int twoD[][]=new int[50][50];
        int i, j, n, sum_pd=0, sum_row=0, sum_column=0, sum_npd=0;
        int c[] = new int[50];
        int d[] = new int[50];
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
        
        //prinicpal diagonal
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                    sum_pd+=twoD[i][j];
            }
        }
        
        //non principal diagonal
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i!=j && j!=n-i-1)
                    sum_npd+=twoD[i][j];
            }
        }
        
        for(int k=0;k<n;k++){
            c[k]=0;
        for(i=0;i<n;i++)
        {
            
            for(j=0;j<n;j++)
            {
               c[k]=twoD[i][j];
            }
            
        }
        
        System.out.println("Sum of " + k +"th row is :" + c[k]);
        }
        
        for(int l=0;l<n;l++){
            d[l]=0;
        for(j=0;j<n;j++)
        {
            for(i=0;i<n;i++)
            {
                d[l]+=twoD[i][j];
            }
        }
        
        System.out.println("Sum of " + l +"th columnn is :" + d[l]);
        }
        
        
        int flag=0;
        for(i=0;i<n;i++){
        if (sum_pd==sum_npd && c[i]==d[i] && c[i]==c[i+1] && d[i]==d[i+1] && sum_pd==c[i])
            flag=1;
        else 
            flag=0;
        }
        
        if(flag==1)
            System.out.println("It is a magic suqare");
        else
            System.out.println("It is not a magic suqare");
        }
                   
    }