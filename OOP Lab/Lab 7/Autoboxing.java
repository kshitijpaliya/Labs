import java.util.*;
class AutoBoxUnbox
{
    int m1(Integer a)
    {
        return a;
    }
     double m2(Double a)
    {
        return a;
    }
     float m3(Float a)
    {
        return a;
    }
     boolean m4(Boolean a)
    {
        return a;
    }
     char m5(Character a)
    {
        return a;
    }
}

public class Autoboxing {

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        AutoBoxUnbox a=new AutoBoxUnbox();

        System.out.println("enter an integer value");
        Integer ob1 = sc.nextInt();
        System.out.println(a.m1(ob1));

        System.out.println("enter a Double value");
        Double ob2 = sc.nextDouble();
        System.out.println(a.m2(ob2));

        System.out.println("enter a Float value");
        Float ob3 = sc.nextFloat();
        System.out.println(a.m3(ob3));

        System.out.println("enter a Boolean value");
        Boolean ob4 = sc.nextBoolean();
        System.out.println(a.m4(ob4));

        System.out.println("enter a Character");
        Character ob5 = sc.next().charAt(0);
        System.out.println(a.m5(ob5));

        Integer o1 = a.m1(100);
        System.out.println(o1);

        Double o2 = a.m2(34.5);
        System.out.println(o2);

        Float o3 = a.m3((float)97.34);
        System.out.println(o3);

        Boolean o4 = a.m4(false);
        System.out.println(o4);

        Character o5 = a.m5('A');
        System.out.println(o5);
    }
}