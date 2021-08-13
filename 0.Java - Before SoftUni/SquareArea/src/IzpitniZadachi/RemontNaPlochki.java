package IzpitniZadachi;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class RemontNaPlochki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N = Double.parseDouble(scanner.nextLine());
        double W = Double.parseDouble(scanner.nextLine());
        double L = Double.parseDouble(scanner.nextLine());
        double M = Double.parseDouble(scanner.nextLine());
        double O = Double.parseDouble(scanner.nextLine());
        double obshtaplosht = N * N;
        double ploshtpeika = M * O;
        double ploshtpokrivane = obshtaplosht - ploshtpeika;
        double ploshtplochka = W * L;
        double plochki =ploshtpokrivane / ploshtplochka;
        double vreme =plochki * 0.2;

        System.out.println(plochki);
        System.out.println(vreme);    }
}
