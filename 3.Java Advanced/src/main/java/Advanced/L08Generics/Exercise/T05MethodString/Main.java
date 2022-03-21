package Advanced.L08Generics.Exercise.T05MethodString;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        GenericCountString<Double> box = new GenericCountString<>();
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            box.getCollection().add(Double.parseDouble(reader.readLine()));
        }
        double element = Double.parseDouble(reader.readLine());

        int count = GenericCountString.compare(box.getCollection(), element);
        System.out.println(count);
    }
}
