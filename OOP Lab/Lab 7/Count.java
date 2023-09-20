import java.util.Scanner;
class Counter
{
    static int count=0;
    void calculate()
    {
        count++;
    }

    static void display()
    {
        System.out.println("Total number of object created : " + count);
    }
}

public class Count {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Counter ob = new Counter();
        do
        {
            System.out.println("Do you want to create another obeject? 1=Yes & 2=No");
            int ch=sc.nextInt();
            if(ch!=1)
            break; 
            Counter c = new Counter();
            System.out.println("OBJECT CREATED");
            c.calculate();
        }while(true);
        ob.display();
    }
}