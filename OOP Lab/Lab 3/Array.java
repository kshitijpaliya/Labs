/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

class Array {
public static void main(String args[]){
	int i=0;
	int[] arr = {1,2,3,1,2,1,5,6,7};
        int value;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the search value");
        value=sc.nextInt();
	for(int n : arr){
            i++;
	if(n==value){
            System.out.println("The value found at location arr"+(i-1));
                    }
        }
	System.out.println("\n");
	}
}	

