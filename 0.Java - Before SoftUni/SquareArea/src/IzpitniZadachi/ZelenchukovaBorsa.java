package IzpitniZadachi;

import java.util.Scanner;

public class ZelenchukovaBorsa {
    public static void main(String[] args) {
        double euro = 1.94;
        Scanner scanner = new Scanner(System.in);

        double veg = Double.parseDouble(scanner.nextLine());
        double veg2 = Double.parseDouble(scanner.nextLine());
        double kilos1 = Double.parseDouble(scanner.nextLine());
        double kilos2 = Double.parseDouble(scanner.nextLine());

        veg = veg*kilos1;
        veg2 = veg2*kilos2;
        var res = (veg+veg2)/euro;
        System.out.println(res);


    }
}
