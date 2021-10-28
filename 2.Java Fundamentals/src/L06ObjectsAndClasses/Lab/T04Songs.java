package L06ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T04Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("_");
            String type = tokens[0];
            String name = tokens[1];
            String time = tokens[2];

            Song song = new Song(type, name, time);
            songs.add(song);
        }

        String type = scanner.nextLine();
        if (type.equals("all")) {
            for (Song song :
                    songs) {
                System.out.println(song);
            }
        } else {
            for (Song song : songs) {
                if (song.getType().equals(type)) {
                    System.out.println(song);
                }
            }
        }
    }



    public static class Song{
        private String type;
        private String name;
        private String time;

        public Song(String type, String name, String time) {
            this.type = type;
            this.name = name;
            this.time = time;
        }

        public String getType() {
            return this.type;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
}
