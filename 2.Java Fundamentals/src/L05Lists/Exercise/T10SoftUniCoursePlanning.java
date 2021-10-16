package L05Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lessons = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("course start")) {
            String[] commands = input.split(":");
            String lessonsTitle = "";
            switch (commands[0]) {
                case "Add":
                     lessonsTitle = commands[1];
                    addLesson(lessons, lessonsTitle);
                    break;
                case "Insert":
                    lessonsTitle = commands[1];
                    int index = Integer.parseInt(commands[2]);
                    insertLesson(lessons, lessonsTitle, index);
                    break;
                case "Remove":
                     lessonsTitle = commands[1];
                    removeLesson(lessons, lessonsTitle);
                    break;
                case "Swap":
                    lessonsTitle = commands[1];
                    String lessonTitel2 = commands[2];
                    swapLessons(lessons, lessonsTitle, lessonTitel2);
                    break;
                case "Exercise":
                    lessonsTitle = commands[1];
                    exerciseAdd(lessons, lessonsTitle);
                    break;
            }

            input = scanner.nextLine();
        }
        for (int i = 0; i < lessons.size() ; i++) {
            System.out.printf("%d.%s\n",i+1,lessons.get(i));
        }

    }

    private static void exerciseAdd(List<String> lessons, String lessonsTitle) {
        if (lessons.contains(lessonsTitle) && !lessons.contains(lessonsTitle + "-Exercise")) {
            int index = lessons.indexOf(lessonsTitle);
            lessons.add(index + 1, lessonsTitle + "-Exercise");
        } else if (!lessons.contains(lessonsTitle)) {
            lessons.add(lessonsTitle);
            lessons.add(lessonsTitle + "-Exercise");
        }
    }

    private static void swapLessons(List<String> lessons, String lessonsTitle, String lessonTitel2) {
        if ((lessons.contains(lessonsTitle)  && (lessons.contains(lessonTitel2) ))) {

            int index1 = lessons.indexOf(lessonsTitle);
            int index1Exercise = -1;
            if (index1 + 1 != lessons.size()) {

                if (lessons.get(index1 + 1).equals(lessonsTitle + "-Exercise")) {
                    index1Exercise = index1 + 1;
                    lessons.remove(index1Exercise);
                }
            }
            int index2 = lessons.indexOf(lessonTitel2);
            int index2Exercise = -1;
            if (index2+1 != lessons.size()) {
                if (lessons.get(index2 + 1).equals(lessonTitel2 + "-Exercise")) {
                    index2Exercise = index2 + 1;
                    lessons.remove(index2Exercise);
                }
            }
            lessons.set(index1, lessonTitel2);
            lessons.set(index2, lessonsTitle);
            if (index1Exercise != -1) {
                lessons.add(index2+1,lessonsTitle + "-Exercise");
            }
            if (index2Exercise != -1) {
                lessons.add(index1+1, lessonTitel2 + "-Exercise");
            }
        }
    }

    private static void removeLesson(List<String> lessons, String lessonsTitle) {
        if (lessons.contains(lessonsTitle) || lessons.contains(lessonsTitle + "-Exercise")) {

            lessons.remove(lessonsTitle);
        }
    }

    private static void insertLesson(List<String> lessons, String lessonsTitle, int index) {
        if (index >= 0 && index <= lessons.size() - 1 && !lessons.contains(lessonsTitle)) {
            lessons.add(index, lessonsTitle);
        }
    }

    private static void addLesson(List<String> lessons, String lessonsTitle) {
        if (!lessons.contains(lessonsTitle)) {
            lessons.add(lessonsTitle);
        }
    }
}
