package Advanced.L10EXAMS.JavaAdvancedExam28June2020;

import java.util.*;
import java.util.stream.Collectors;

public class T01Bombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> effectsQueue =new ArrayDeque<>();
        ArrayDeque<Integer> casingsStack =new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).forEach(effectsQueue::offer);
        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).forEach(casingsStack::push);

        int daturaBomb = 0;
        int cherryBomb = 0;
        int smokeBomb = 0;

        while (!effectsQueue.isEmpty() && !casingsStack.isEmpty() && !bombPouch(daturaBomb, cherryBomb, smokeBomb)) {
            int effect = effectsQueue.peek();
            int casi = casingsStack.peek();
            int sum = effect + casi;

            if (sum == 40) {
                daturaBomb++;
                effectsQueue.poll();
                casingsStack.pop();
            } else if (sum == 60) {
                cherryBomb++;
                effectsQueue.poll();
                casingsStack.pop();
            } else if (sum == 120) {
                smokeBomb++;
                effectsQueue.poll();
                casingsStack.pop();
            } else {
                casingsStack.push(casingsStack.pop() - 5);
            }

        }

        if (bombPouch(daturaBomb, cherryBomb, smokeBomb)) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        }else System.out.println("You don't have enough materials to fill the bomb pouch.");

        if (effectsQueue.isEmpty()) {
            System.out.println("Bomb Effects: empty");
        }else {
            List<Integer> list = new ArrayList<>(effectsQueue);
            System.out.printf("Bomb Effects: %s\n", list.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }

        if (casingsStack.isEmpty()) {
            System.out.println("Bomb Casings: empty");
        }else {
            List<Integer> list = new ArrayList<>(casingsStack);
            System.out.printf("Bomb Casings: %s\n", list.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }

        System.out.printf("Cherry Bombs: %d\n",cherryBomb);
        System.out.printf("Datura Bombs: %d\n",daturaBomb);
        System.out.printf("Smoke Decoy Bombs: %d\n",smokeBomb);

    }

    public static boolean bombPouch(int a, int b, int c) {
        return a >= 3 && b >= 3 && c >= 3;
    }
}
