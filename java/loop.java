import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in); 
     System.out.println("Enter any number");
     var a= sc.nextInt();
     int b;
     for (b=a;b<10;b++) {
        System.out.println(b);
      }  
    }
}