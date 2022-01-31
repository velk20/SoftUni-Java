package Advanced.L06DefiningClasses.Lab.T02Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Car car;
            String brand = tokens[0];
            if (tokens.length == 1) {
                car = new Car(brand);
            } else {
                String model = tokens[1];
                int horsePower = Integer.parseInt(tokens[2]);
                car = new Car(brand, model, horsePower);
            }
            System.out.println(car.carInfo());

        }
    }
}
