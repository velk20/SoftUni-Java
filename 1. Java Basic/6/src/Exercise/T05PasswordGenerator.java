package Exercise;

import java.util.Scanner;

public class T05PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++)
        {
            for (int k = 1; k <= n; k++)
            {
                for (char d = (char)97; d < (char)97+l; d++)
                {
                    for (char e = (char)97; e < (char)97+l; e++)
                    {
                        for (int m = 1; m <=n; m++)
                        {
                            if (m>i&&m>k)
                            {
                                System.out.printf("%d%d%c%c%d ",i,k,d,e,m);
                            }
                        }
                    }
                }
            }
        }
    }
}
