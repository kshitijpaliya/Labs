import java.util.Scanner;

class Execute {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);

	int a, b; 
	
	a=input.nextInt();
	b=input.nextInt();
	System.out.println((a<<2)+(b>>2));
	System.out.println((b>0));
	System.out.println((a+b*100)/10);
	System.out.println(a & b);
}
}