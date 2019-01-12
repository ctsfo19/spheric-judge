import java.util.Scanner;

public class trio {
   public static void main(String[] args) {
       int a, b, c;
       Scanner input = new Scanner(System.in);
       a = input.nextInt();
       b = input.nextInt();
       c = input.nextInt();
       if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a){
            System.out.println("tak");
       }
       else{
           System.out.println("nie");
       }
   }
}