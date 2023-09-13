class Number{
	public static void main(String args[]){
	int i,n,zero=0,neg=0,pos=0;
	for(i=0;i<10;i++){
	n=Integer.parseInt(args[i]);
if(n>0)
	pos++;
else
if(n<0)
	neg++;
else
if(n==0)
	zero++;
}
System.out.println(pos);
System.out.println(neg);
System.out.println(zero);
}
}