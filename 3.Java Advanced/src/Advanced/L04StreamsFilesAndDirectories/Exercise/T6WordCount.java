package Advanced.L04StreamsFilesAndDirectories.Exercise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class T6WordCount {
    public static void main(String[] args) throws IOException {
        Path input = Paths.get("D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
        Path input1 = Paths.get("D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");

        String output = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        List<String> list = Files.readAllLines(input);
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

        for (String s : list) {
            String[] strings = s.split(" ");
            set.addAll(Arrays.asList(strings));
        }

        String[] text = Files.readString(input1).split("\\s+");
        for (String s : text) {
            if (set.contains(s)) {
                if (!map.containsKey(s)) {
                    map.put(s, 1);
                } else {
                    map.put(s, map.get(s) + 1);
                }
            }
        }

        map.entrySet().stream().sorted(
                (leftElement,rightElement) ->{
                    return rightElement.getValue().compareTo(leftElement.getValue());
                }
        ).forEach(
                e->{
                    System.out.printf("%s - %d\n",e.getKey(),e.getValue());
                }
        );
    }
}
