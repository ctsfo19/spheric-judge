import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        double a, b, r;
        char sign;
        Scanner input = new Scanner(System.in);
        sign = input.next().charAt(0);
        a = input.nextInt();
        b = input.nextInt();
        switch(sign) {
            case '*':
                r = a * b;
                System.out.printf("%.0f",r);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("null");
                } else {
                    r = a/b;
                    System.out.printf("%.2f",r);
                }
                break;
            case '+':
                r = a + b;
                System.out.printf("%.0f",r);
                break;
            case '-':
                r = a - b;
                System.out.printf("%.0f",r);
                break;
        }


    }
}
