import java.util.Scanner;

class Ternary {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);

	int a, b, c; 
	a=input.nextInt();
	b=input.nextInt();
	c=input.nextInt();
	
	int max = (a>b)?(a>c ? a : c ) : (b>c ? b : c);
	System.out.println(max);
}
}