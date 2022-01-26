package Advanced.L04StreamsFilesAndDirectories.Exercise;

import java.io.*;

public class T4CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String input = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";


        BufferedReader reader = new BufferedReader(new FileReader(input));
        String string = reader.readLine();
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        while (string != null) {
            for (int i = 0; i < string.length(); i++) {
                char currentChar = string.charAt(i);
                if (currentChar == 'a' ||currentChar == 'e' ||currentChar == 'i' ||currentChar == 'o' ||currentChar == 'u') {
                    vowels++;
                } else if (currentChar == '!' || currentChar == ',' || currentChar == '.' || currentChar == '?') {
                    punctuation++;
                }else {
                    if (currentChar !=' ') {
                        consonants++;
                    }
                }
            }
            string = reader.readLine();
        }
        reader.close();

        System.out.printf("Vowels: %d\nConsonants: %d\nPunctuation: %d",vowels,consonants,punctuation);
    }
}
