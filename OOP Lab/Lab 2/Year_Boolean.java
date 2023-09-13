import java.util.Scanner;
class Year_Boolean {
	public static void main(String args[]){
	int year;
	Scanner sc = new Scanner(System.in);
	year = sc.nextInt();
	
	boolean leap = false;

	if(year%4!=0)
		leap=false;
	else
	if(year%100!=0)
		leap=true;
	else
	if(year%400!=0)
		leap=false;
	else
		leap=true;

	if(!leap)
		System.out.println("It is a Common year");
	else
		System.out.println("It is a Leap year");
}
}