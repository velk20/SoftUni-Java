package Advanced.L10EXAMS.JavaAdvancedRetakeExam15December;

import java.util.*;
import java.util.stream.Collectors;

public class T01Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matches = 0;

        ArrayDeque<Integer> malesStack = new ArrayDeque<>();
        ArrayDeque<Integer> femalesQueue = new ArrayDeque<>();
        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        for (Integer integer : integerList) {
            malesStack.push(integer);
        }
        integerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        for (Integer integer : integerList) {
            femalesQueue.offer(integer);
        }
        while (malesStack.size() > 0 && femalesQueue.size() > 0) {
            Integer peekMale = malesStack.peek();
            if (peekMale<=0) {
                malesStack.pop();
                peekMale = malesStack.peek();
                continue;
            }
            Integer peekFemales = femalesQueue.peek();
            if (peekFemales<=0) {
                femalesQueue.poll();
                peekFemales = femalesQueue.peek();
                continue;
            }

            if (peekMale % 25 == 0) {
                malesStack.pop();
                if (malesStack.size() != 0) {
                    malesStack.pop();
                }
                continue;
            }
            if (peekFemales % 25 == 0) {
                femalesQueue.poll();
                if (femalesQueue.size() != 0) {
                    femalesQueue.poll();
                }
                continue;
            }

            if (Objects.equals(peekMale, peekFemales)) {
                malesStack.pop();
                femalesQueue.poll();
                matches++;
            } else {
                femalesQueue.poll();
                Integer integer = malesStack.pop();
                malesStack.push(integer - 2);
            }
        }

        System.out.println("Matches: "+matches);
        System.out.print("Males left: ");
        if (malesStack.size() == 0) {
            System.out.print("none\n");
        } else {
            String collect = malesStack.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.print(collect+"\n");
        }
        System.out.print("Females left: ");
        if (femalesQueue.size() == 0) {
            System.out.print("none\n");
        } else {
            String collect = femalesQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.print(collect+"\n");
        }
    }
}
