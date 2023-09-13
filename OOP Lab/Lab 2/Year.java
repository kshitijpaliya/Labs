import java.util.Scanner;
class Year {
	public static void main(String args[]){
	int year;
	Scanner sc = new Scanner(System.in);
	year = sc.nextInt();
	if(year%4!=0)
		System.out.println("It is a Common year");
	else
	if(year%100!=0)
		System.out.println("It is a Leap year");
	else
	if(year%400!=0)
		System.out.println("It is a Common year");
	else
		System.out.println("It is a Leap year");	
}
}