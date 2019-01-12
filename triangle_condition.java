import java.util.Scanner;
import java.lang.Math;

public class triangle_condition {
    public static void main(String[] args){
      double sum, max, a, b, c;
      Scanner input = new Scanner(System.in);
      a = input.nextDouble();
      b = input.nextDouble();
      c = input.nextDouble();
      max = Math.max(a,Math.max(b,c));
      sum = a + b + c - max;
      if (max < sum){
          System.out.println("Tak");
      }
      else{
          System.out.println("Nie");
      }
    }
}
