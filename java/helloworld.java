import java.util.Scanner;  // Import the Scanner class

class MyClass {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter value of first number");
   var a=sc.nextInt();
   System.out.println("Enter value of second number");
   var b= sc.nextInt();
   var c=a+b;
   System.out.println("sum of the numbers is"+c);
  }
}