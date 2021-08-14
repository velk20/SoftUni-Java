import java.util.Scanner;

public class T06MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String n = "" + num;

        int a = Integer.parseInt("" + n.charAt(2));
        int b = Integer.parseInt("" + n.charAt(1));
        int c = Integer.parseInt("" + n.charAt(0));



        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <= b ; j++) {
                for (int k = 1; k <= c; k++) {
                    System.out.printf("%d * %d * %d = %d;\n", i, j, k, i * j * k);

                }
            }
        }
    }
}
