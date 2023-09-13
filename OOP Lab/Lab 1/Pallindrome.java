class Pallindrome{
	public static void main(String args[]){
	int i,n, temp;
	n=Integer.parseInt(args[0]);
	temp=n;
	int sum=0, rem;
	
	while(n>0){
	rem=n%10;
	sum=(sum*10)+rem;
	n=n/10;
}
	if(temp==sum)
	System.out.println("Pallindrome");
	else
	System.out.println("Not Pallindrome");
}
}