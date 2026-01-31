import java.util.Scanner;
public class PalindromeString 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(Systemm.in);
    System.out.println("Enter string");
    String st=sc.nextLine();
    String rev="";
    for(int i=st.length();i>0;i--)
      {
        rev+=st.charAt(i);
      }
    if (str.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}
    
