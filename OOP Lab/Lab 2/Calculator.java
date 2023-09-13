import java.util.Scanner;

class Calculator {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	char w;

do{
	float a, b;
	a=input.nextFloat();
	b=input.nextFloat();
	char c;
	c=input.next().charAt(0);
	
	switch(c){
case '+' :
	System.out.println(a+b);
	break;
case '-' :
	System.out.println(a-b);
	break;
case '*' :
	System.out.println(a*b);
	break;
case '/' :
	System.out.println(a/b);
	break;
default :
	System.out.println("Invalid Input");}

	
System.out.println("Do another (y/n)?");

w=input.next().charAt(0);
}while(w=='y');
}
}