import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        int c=1, v=0, o=0;
        int n = s.length();

        if(s.charAt(0)==' ')
        {
            c--;
        }

        for (int i = 0; i < n; i++) {
            if (s.charAt(i)==' ') {
                o++;
            }

            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
                v++;
            }
        }

        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                c++;
            }
        }

        System.out.println("the string you eneteres is: "+s);
        System.out.println("Total number of letters in above string is: "+(n-o));
        System.out.println("Total number of words in above string is: "+c);
        System.out.println("Total number of vowels in above string is: "+v);
    }
}
