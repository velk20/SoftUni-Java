package Advanced.L10EXAMS.JavaAdvancedExam26June2021.groomingSalon;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T01OSPlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> tasks = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> threads =
                Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int killTask = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> taskStack = new ArrayDeque<>();
        ArrayDeque<Integer> threadsQueue = new ArrayDeque<>();

        for (Integer task : tasks) {
            taskStack.push(task);

        }
        for (Integer thread : threads) {
            threadsQueue.offer(thread);
        }

        while (true) {
            int task = taskStack.peek();
            int thread = threadsQueue.peek();

            if (task == killTask) {
                System.out.printf("Thread with value %d killed task %d\n", thread, task);
                break;
            }

            if (thread >= task) {
                taskStack.pop();
                threadsQueue.poll();
            } else {
                threadsQueue.poll();

            }
        }

        for (Integer integer : threadsQueue) {
            System.out.print(integer+" ");
        }

    }
}
