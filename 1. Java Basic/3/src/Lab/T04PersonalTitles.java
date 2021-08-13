package Lab;

import java.util.Scanner;
public class T04PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();


        if ("m".equals(sex)) {
            if (age < 16) {
                System.out.println("Master");
            } else if(age>=16){
                System.out.println("Mr.");
            }
        } else if("f".equals(sex)){
            if (age < 16) {
                System.out.println("Miss");
            } else if(age>=16){
                System.out.println("Ms.");
            }
        }
    }
}
