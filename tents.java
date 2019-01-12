import java.util.Scanner;
public class tents {
    public static void main(String[] args){
        int k,m,n,M,C;
        //k - read days num
        //m - read student/adult
        //n - read single/multi
        //M = 10 (student, single) m=1,n=1
        //M = 15 (adult, single) m=0,n=1
        //M = 15 (student, multi) m=1,n=0
        //M = 25 (adult, multi) m=0,n=0
        System.out.println("Enter value 0≤k≤30\nEnter value m (0,1)\nEnter value n (0,1)");
        Scanner input = new Scanner(System.in);
        k = input.nextInt();
        m = input.nextInt();
        n = input.nextInt();
            if(m == 1){
                if(n == 1){
                    M = 10;
                }
                else{
                    M = 15;
                }
            }
            else{
                if(m == 0 && n ==1){
                    M = 15;
                }
                else{
                    M = 25;
                }
            }
            C = M * k;
            System.out.println(C);
    }
}
