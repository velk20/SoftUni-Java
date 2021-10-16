package L05Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class T07AppendArrays {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        //???????????????????????NE MOGA SAM ?????????????????????????????????????????
//        List<String> nums = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
//        Collections.reverse(nums);
//        String toPrint = nums.toString().replaceAll("[\\]\\[,]", "").trim();
//        toPrint = toPrint.replaceAll("\\s+", " ");
//        System.out.println(toPrint);
        //???????????????????????NE MOGA SAM ?????????????????????????????????????????

        //TEACHER _ EXERCISE
        String input = scanner.nextLine();
        List<String> listSeparatedByPipe = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(listSeparatedByPipe);
        System.out.println(listSeparatedByPipe.toString()
                .replaceAll("\\[","")//защото е специален символ заради това е с \\
                .replaceAll("]","")//защото не е специален символ
                .trim()//маха всички спейсове в началото и в края !!!
                .replaceAll(",","")
                .replaceAll("\\s+"," "));//всички интервали(дали повече от 1 или не) се заменят с един спейс
        //TEACHER _ EXERCISE

    }
}

