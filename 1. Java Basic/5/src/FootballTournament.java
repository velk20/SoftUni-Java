import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int countW = 0;
        int countL = 0;
        int countD = 0;


        if (n==0) {
            System.out.printf("%s hasn't played any games during this season.",name);
        }
        else{
            for (int i = 0; i < n; i++) {
                String wdl = scanner.nextLine();

                if (wdl.equals("W")) {
                    sum += 3;
                    countW++;
                } else if (wdl.equals("D")) {
                    sum += 1;
                    countD++;
                } else if (wdl.equals("L")) {
                    countL++;
                }
            }

            System.out.printf("%s has won %d points during this season.\n",name,sum);
            System.out.printf("Total stats:\n");
            System.out.printf("## W: %d\n",countW);
            System.out.printf("## D: %d\n",countD);
            System.out.printf("## L: %d\n",countL);
            System.out.printf("Win rate: %.2f%%\n",1.0*countW/n*100.0);
//            System.out.printf("Win rate: %.2f%%\n",(double)countW/n*100.0);

        }
    }
}
