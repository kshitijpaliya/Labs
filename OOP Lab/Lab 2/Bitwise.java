import java.util.Scanner;

class Bitwise {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	int a, div, mult;

	a=input.nextInt();
	mult=a<<1;
	div=a>>1;
	System.out.println("a/2 =" + div);
	System.out.println("a*2 =" + mult);
}
}