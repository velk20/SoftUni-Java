package L01BasicSyntaxStatementsLoops.Exercise;

import java.util.Scanner;
/*•	0-2 – baby;
•	3-13 – child;
•	14-19 – teenager;
•	20-65 – adult;
•	>=66 – elder;
*/
public class T01Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        if (age >= 0 && age <= 2) {
            System.out.println("baby");
        } else if (age >= 3 && age <= 13) {
            System.out.printf("child");
        } else if (age >= 14 && age <= 19) {
            System.out.printf("teenager");
        } else if (age >= 20 && age <= 65) {
            System.out.printf("adult");

        } else if (age >= 66) {
            System.out.printf("elder");
        }
    }
}
