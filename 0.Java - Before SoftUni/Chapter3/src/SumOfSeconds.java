import java.util.Scanner;

public class SumOfSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
int all = a+b+c;

if (all>=10 && all<=59)
    System.out.printf("0:%d",all);

else if (all>=60 && all<=119 && (all-60)>=10)
    System.out.printf("1:%d",all-60);
else if (all>=60 && all<=119 && (all-60)<10)
    System.out.printf("1:0%d",all-60);

else if (all>=120 && all<=179 && (all-120)>=10)
    System.out.printf("2:%d",all-120);
else if (all>=120 && all<=179 && (all-120)<10)
    System.out.printf("2:0%d",all-120);

else if (all<10)
    System.out.printf("0:0%d",all);

    }
}
