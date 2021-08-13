import java.util.Scanner;

public class FaceBookHelp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int moves = scanner.nextInt();
            int count = 0;
            int points = scanner.nextInt();
            int zeroToNineCount = 0;
            int tenToNineteenCount = 0;
            int twentyToTwentyNineCount = 0;
            int thirtyToThirtyNineCount = 0;
            int fortyToFiftyCount = 0;
            int invalidsCount=0;

                double result =0;


        while (count<=moves) {


            if (points >= 0 && points <= 9) {
                result += 0.2 * points;
                zeroToNineCount++;

            } else if (points >= 10 && points <= 19) {
                result += 0.3 * points;
                tenToNineteenCount++;
            } else if (points >= 20 && points <= 29) {
                result += 0.4 * points;
                twentyToTwentyNineCount++;

            } else if (points >= 30 && points <= 39) {
                result += 50;
                thirtyToThirtyNineCount++;

            } else if (points >= 40 && points <= 50) {
                result += 100;
                fortyToFiftyCount++;

            } else {
                result /= 2;
                invalidsCount++;

            }
            points = scanner.nextInt();

            count++;

        }

        System.out.println(result);
        System.out.printf("From 0 to 9: %.2f%%%n",(double)zeroToNineCount/count*1.0*100);
        System.out.printf("From 10 to 19: %.2f%%%n",(double)tenToNineteenCount/count*1.0*100);
        System.out.printf("From 20 to 29: %.2f%%%n",(double)twentyToTwentyNineCount/count*1.0*100);
        System.out.printf("From 30 to 39: %.2f%%%n",(double)thirtyToThirtyNineCount/count*1.0*100);
        System.out.printf("From 40 to 50: %.2f%%%n",(double)fortyToFiftyCount/count*1.0*100);
        System.out.printf("Invalid numbers: %.2f%%%n",(double)invalidsCount/count*1.0*100);





    }
}


