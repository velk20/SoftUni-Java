package L02DataTypesandVariables.Lab;

import java.util.Scanner;

public class T11RefactorVolumeofPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l, w, h,V;
        System.out.print("Length: ");
        l = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        w = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        h = Double.parseDouble(scanner.nextLine());
        V = w * l*h / 3;
        System.out.printf("Pyramid Volume: %.2f", V);

    }
}
