import java.lang.Math;
import java.util.Scanner;
public class cinema {
    public static void main(String args[]) {
        int a,d,r;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        d = input.nextInt();
        r = input.nextInt();

        if (d>2)
            if (a==1)
                System.out.println((d+r)*18);
            else
                System.out.println((d+r)*16);

        else
        if (a==1)
            System.out.print((r*21)+(d*18));
        else
            System.out.print((r*18)+(d*16));
    }
}