package L05Lists.Lab;

import java.util.*;

public class T06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            products.add(scanner.nextLine());
        }
        sortAndOrderList(products);
    }

    private static void sortAndOrderList(List<String> products) {
        Collections.sort(products);
        int counter = 0;
        for (String n :
                products) {
            counter++;
            System.out.println(counter + "." + n);
        }
    }
}
