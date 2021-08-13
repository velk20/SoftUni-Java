package Lab;

import java.util.Scanner;

public class T11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double banana=0, apple = 0, orange=0, grapefruit=0, kiwi=0, pineapple=0, grapes = 0;
        double res = 0;

/*Магазин за плодове през работните дни работи на следните цени:
        плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
        цена	2.50	1.20	0.85	1.45	2.70	5.50	3.85
        Събота и неделя магазинът работи на по-високи цени:
        плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
        цена	2.70	1.25	0.90	1.60	3.00	5.60	4.20
*/
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Friday":
            case "Thursday":
            case "Wednesday":
                banana = 2.50 * quantity;
                apple = 1.20* quantity;
                orange = 0.85* quantity;
                grapefruit = 1.45* quantity;
                kiwi = 2.70* quantity;
                pineapple = 5.50* quantity;
                grapes = 3.85* quantity;
                switch (product) {
                    case "banana":
                        System.out.printf("%.2f",banana);
                        break;
                    case "apple":
                        System.out.printf("%.2f",apple);
                        break;
                    case "orange":
                        System.out.printf("%.2f",orange);
                        break;
                    case "grapefruit":
                        System.out.printf("%.2f",grapefruit);
                        break;
                    case "kiwi":
                        System.out.printf("%.2f",kiwi);
                        break;
                    case "pineapple":
                        System.out.printf("%.2f",pineapple);
                        break;
                    case "grapes":
                        System.out.printf("%.2f",grapes);
                        break;
                    default: System.out.println("error");
                        break;

                }
                break;

            case "Saturday":
            case "Sunday":
                banana = 2.70* quantity;
                apple = 1.25* quantity;
                orange = 0.90* quantity;
                grapefruit = 1.60* quantity;
                kiwi = 3.00* quantity;
                pineapple = 5.60* quantity;
                grapes = 4.20* quantity;
                switch (product) {
                    case "banana":
                        System.out.printf("%.2f",banana);
                        break;
                    case "apple":
                        System.out.printf("%.2f",apple);
                        break;
                    case "orange":
                        System.out.printf("%.2f",orange);
                        break;
                    case "grapefruit":
                        System.out.printf("%.2f",grapefruit);
                        break;
                    case "kiwi":
                        System.out.printf("%.2f",kiwi);
                        break;
                    case "pineapple":
                        System.out.printf("%.2f",pineapple);
                        break;
                    case "grapes":
                        System.out.printf("%.2f",grapes);
                        break;
                    default: System.out.println("error");
                        break;

                }
                break;
            default:
                System.out.println("error");
                break;
        }


    }
}
