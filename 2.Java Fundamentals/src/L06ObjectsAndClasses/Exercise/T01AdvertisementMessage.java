package L06ObjectsAndClasses.Exercise;

import java.util.*;

public class T01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        String[]	Phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best " +
                "product" +
                " of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String [] authors ={"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String [] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("%s %s %s - %s\n",Phrases[rnd.nextInt(Phrases.length-1)]
            ,events[rnd.nextInt(events.length-1)]
            ,authors[rnd.nextInt(authors.length-1)]
            ,cities[rnd.nextInt(cities.length-1)]);
        }
    }
}
