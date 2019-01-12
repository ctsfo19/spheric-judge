import java.util.Scanner;

public class switchpractice {
    public static void main(String[] Args){
        int stdin;
        String stdout;
        Scanner input = new Scanner(System.in);
        stdin = input.nextInt();
        switch(stdin){
            case 1: stdout = "jeden"; break;
            case 2: stdout = "dwa";break;
            case 3:stdout = "trzy";break;
            case 4:stdout = "cztery";break;
            case 5:stdout = "piec";break;
            case 6:stdout = "szesc";break;
            case 7:stdout = "siedem";break;
            case 8:stdout = "osiem";break;
            case 9:stdout = "dziewiec";break;
            case 0:stdout = "zero";break;
            default:stdout = "";break;
        }
        System.out.println(stdout);
    }
}
