import java.util.Scanner;

public class FindTheParameter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("x1 = ");
        int x1 = Integer.parseInt(scan.nextLine());
        System.out.print("y1 = ");
        int y1 = Integer.parseInt(scan.nextLine());
        System.out.print("x2 = ");
        int x2 = Integer.parseInt(scan.nextLine());
        System.out.print("y2 = ");
        int y2 = Integer.parseInt(scan.nextLine());

        int a,b;

        if (x1 > x2) {
            a=x1-x2;
        }
        else {
            a=x2-x1;
        }

        if (y1>y2){
            b=y1-y2;
        }
        else{
            b=y2-y1;
        }

        int S = a*b;
        int P = 2*(a+b);
        System.out.println(S);
        System.out.println(P);
    }
}
