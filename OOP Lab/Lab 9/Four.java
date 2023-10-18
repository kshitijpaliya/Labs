import java.util.Scanner;
public class Four 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int ch;
        do
        {
            System.out.println("Choose an operation:");
            System.out.println("1. To compare two strings ");
            System.out.println("2. To convert the uppercase character to lower and vice-versa");
            System.out.println("3. To display whether an entered string is a substring of the other or not");
            System.out.println("4. If the entered string is a substring of the other, replace it with “Hello”");
            System.out.println("5. Exit");
            ch= sc.nextInt();
            switch (ch) 
            {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (ch != 5);
        sc.close();
    }
}