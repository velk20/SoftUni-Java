package L06ObjectsAndClasses.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class T01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        List<String> str = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
//        Random rnd = new Random();
//        while (str.size() > 0) {
//            String num = str.remove(rnd.nextInt(str.size()));
//            System.out.println(num);
//        }

        //### TEACHER ####

        String input = scanner.nextLine();
        String[] wordsArr = input.split("\\s+");
        Random randomGenerator = new Random();

        for (int i = 0; i < wordsArr.length; i++) {
            int x = randomGenerator.nextInt(wordsArr.length);
            int y = randomGenerator.nextInt(wordsArr.length);

            String oldWordX = wordsArr[x];
            wordsArr[x] = wordsArr[y];
            wordsArr[y] = oldWordX;
        }

        System.out.println(String.join(System.lineSeparator(), wordsArr));

    }
}
