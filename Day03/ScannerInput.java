import java.util.Scanner;
public class Scaninput
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter name");
      String name;
      name=sc.nextLine();
      System.out.println("Enter age");
      int age=sc.nextInt();
      System.out.println("Enter marks");
      float marks=sc.nextFloat(); 
      System.out.println("User Deatils");
      System.out.println("Name: "+name);
      System.out.println("Age: "+age);
      System.out.println("Marks: "+marks);
    }
  }
