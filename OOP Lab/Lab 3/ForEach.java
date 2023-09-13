import java.util.Scanner;

class ForEach {
public static void main(String args[]){
	int i,j;
	int[] arr = {1,2,3,4,5};
	for(int n : arr){
		for(j=1;j<=n;j++){
		System.out.print(n);
		}
	System.out.println("\n");
	}
}	
}