class Circumference{
	public static void main(String args[]){
	int length, breadth;
	length=Integer.parseInt(args[0]);
	breadth=Integer.parseInt(args[1]);
	int circumference=2*(length+breadth);
	System.out.println("Length of Rectangle=" + length);
	System.out.println("Breadth of Rectangle=" + breadth);
	System.out.println("Circumference=" + circumference);
}
}