import java.util.Scanner;

class Prime {
public static void main(String args[]){
	int m, n, prime;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter m:");
	m = sc.nextInt();
	System.out.println("Enter n:");
	n = sc.nextInt();
	
	for(int i=m; i<=n; i++){
	prime=0;
	for(int j=2; j<i/2;j++){
		if((i%j)==0){
		prime=1;
		break;
	}
	}
	if(prime==0){
	System.out.println(i);}
	
	}
}
}