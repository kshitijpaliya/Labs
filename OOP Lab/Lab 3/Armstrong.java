import java.util.Scanner;

class Armstrong {
public static void main(String args[]){
	int n, i, dig, sum=0, m;
	System.out.println("Enter the number:");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	m=n;
	while(n>0){
	dig=n%10;
	sum+=dig*dig*dig;
	n=n/10;
	}
	if(sum==m)
	System.out.println("It is an armstrong number");
	else
	System.out.println("Not a Pallindrome");
}
}