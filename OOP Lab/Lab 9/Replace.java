import java.util.Scanner;

public class Replace {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        
        System.out.println("Enter the word you want to replace with");
        String word = sc.nextLine();

        String nstr="";

        System.out.println("Enter the character you want to replace");
        char c = sc.next().charAt(0);
        

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==c)
            {
                nstr = nstr + " " + word + " ";
            }
            else
            {
                nstr = nstr + str.charAt(i);
            }
        }

        System.out.println("Replaced string is : "+ nstr);
    }
}
