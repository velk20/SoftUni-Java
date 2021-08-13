package Exercise;

import java.util.Scanner;

public class T06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double res = 0.0;
        switch (operator) {
            case '+':
                res = num1 + num2;
                if (res % 2 == 0) {
                    System.out.printf("%d %c %d = %.0f - even",num1,operator,num2,res);
                }else System.out.printf("%d %c %d = %.0f - odd",num1,operator,num2,res);
                break;
            case '-':
                res = num1 - num2;
                if (res % 2 == 0) {
                    System.out.printf("%d %c %d = %.0f - even",num1,operator,num2,res);
                }else System.out.printf("%d %c %d = %.0f - odd",num1,operator,num2,res);
                break;

            case '*':
                res = num1 * num2;
                if (res % 2 == 0) {
                    System.out.printf("%d %c %d = %.0f - even",num1,operator,num2,res);
                }else System.out.printf("%d %c %d = %.0f - odd",num1,operator,num2,res);
                break;

            case '/':
                if (num2 != 0){

                    res = (double) num1 / num2;

                        System.out.printf("%d %c %d = %.2f",num1,operator,num2,res);
                }else System.out.printf("Cannot divide %d by zero",num1);
                break;

                case '%':
                if (num2 != 0){

                    res = num1 % num2;

                        System.out.printf("%d %c %d = %.0f",num1,operator,num2,res);
                }else System.out.printf("Cannot divide %d by zero",num1);
                break;
        }
    }
}
