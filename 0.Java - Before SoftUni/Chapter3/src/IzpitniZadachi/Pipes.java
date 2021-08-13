package IzpitniZadachi;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Pipes {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//        int v = Integer.parseInt(scanner.nextLine());
//        int p1 = Integer.parseInt(scanner.nextLine());
//        int p2 = Integer.parseInt(scanner.nextLine());
//        double hours = Double.parseDouble(scanner.nextLine());
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());


        double P = P1*H+P2*H;
        if (P<=V){
            System.out.printf("The pool is %.0f%% full." + " Pipe 1: %.0f%%. Pipe 2: %.0f%%.",Math.floor(P/V*100),Math.floor(P1*H/P*100),Math.floor(P2*H/P*100));
        }
        else    {
            System.out.printf("For %f hours the pool overflows with %f liters",H,P-V);
        }
    }
}
