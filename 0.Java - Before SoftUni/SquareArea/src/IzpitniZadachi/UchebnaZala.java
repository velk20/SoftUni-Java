package IzpitniZadachi;

import java.util.Scanner;

public class UchebnaZala {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Height = ");
        double h = Double.parseDouble(scan.next());
        System.out.print("Enter Weight = ");
        double w = Double.parseDouble(scan.next());

h=h*100;
w=w*100;
var h1 = Math.floor(h/120);
var w1 = Math.floor((w-100)/70);

var reshenie = (w1*h1)-3;
        System.out.println(reshenie);

    }
}
