import java.util.Scanner;

class Typecast {
public static void main(String args[]){
	int n;
	double d;
	char c;
	Scanner input = new Scanner(System.in);
	n=input.nextInt();
	d=input.nextDouble();
	c=input.next().charAt(0);

	System.out.println((byte)n);
	System.out.println((int)c);
	System.out.println((byte)d);
	System.out.println((int)d);
}
}