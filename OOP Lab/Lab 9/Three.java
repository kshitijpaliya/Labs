import java.util.Scanner;

public class Three {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.nextLine();

        String palin="";

        int n =s.length();

        for(int i=0;i<n;i++)
        {
            palin = palin + s.charAt(n-i-1);
        }

        if(palin.equals(s))
        {
            System.out.println("Palindorme");
        }
        else
        {
            System.out.println("Not Palindorme"); 
        }
        
        System.out.println("Reversed String is:\n"+palin); 
        System.out.println("Concatinated String is:\n"+s+palin); 

        char str[] = new char[100];
        str=s.toCharArray();
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(j==' ' || j+1==' ')
                {
                    continue;
                }
                else if(str[j]>str[j+1])
                {
                    char temp = str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        System.out.println("Ordered String is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }
    }
}