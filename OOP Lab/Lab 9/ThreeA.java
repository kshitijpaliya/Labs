
import java.util.Scanner;


public class ThreeA 
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
            System.out.println("1. Check whether a string is palindrome or not");
            System.out.println("2. Write the string in alphabetical order");
            System.out.println("3. Reverse the string");
            System.out.println("4. Concatenate the original string and the reversed string");
            System.out.println("5. Exit");
            ch= sc.nextInt();
            switch (ch) 
            {
                case 1:
                    if (isPalindrome(str)) 
                    {
                        System.out.println("The string is a palindrome.");
                    } else 
                    {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;
                case 2:
                    String sortedStr = alphabet(str);
                    System.out.println("The string in alphabetical order is: " + sortedStr);
                    break;
                case 3:
                    String reversedStr = reverseString(str);
                    System.out.println("The reversed string is: " + reversedStr);
                    break;
                case 4:
                    String concatenatedStr = concatenateString(str);
                    System.out.println("The concatenated string is: " + concatenatedStr);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (ch != 5);
        sc.close();
    }

    
      public static boolean isPalindrome(String str) 
    {
        String reversedStr = "";
        for (int i = str.length()- 1; i>= 0; i--) 
        {
            reversedStr += str.charAt(i);
        }
        return str.equals(reversedStr);
    }
      
      public static String alphabet(String str)
      {
        String sorted = "";
        for (char c = 'a'; c <= 'z'; c++) 
        {
            for (int i = 0; i < str.length(); i++) 
            {
                if (str.charAt(i) == c) {
                    sorted += c;
                }
            }
        }
        return sorted;
      }    

      
    public static String reverseString(String str)
    {
        String rev="";
        for (int i = str.length()-1; i >=0; i--) 
            {
                rev+= str.charAt(i);
            }
        return rev;
    }
      
      
    public static String concatenateString(String str) 
    {
        String revStr = reverseString(str);
        String ct= str.concat(revStr);
        return ct;
    }
}
