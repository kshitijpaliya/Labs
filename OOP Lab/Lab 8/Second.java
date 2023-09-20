import java.util.*;
abstract class Shape
{
     Scanner sc=new Scanner(System.in);
     abstract void area();
     double area;
}
class Rectangle extends Shape
{
 double w,h;
 void area()
 {
     System.out.println("Enter width and height of rectangle: ");
     w=sc.nextDouble();
     h=sc.nextDouble();
     area = w*h;
  System.out.println("Area of Rectangle : "+area);
 }
}
class Circle extends Shape
{
 double r;
 void area()
 {
     System.out.println("Enter radius of circle: ");
     r=sc.nextDouble();
     area = Math.PI * r * r;
  System.out.println("Area of Circle : "+area);
 }
}
class Second
{
 public static void main(String args[])
 {
  Rectangle r =new Rectangle();
  Circle c =new Circle();
  r.area();
  c.area();
 }
}