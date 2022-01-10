package T12AlgorithmsFundamentalsWithJava.CombinatorialProblems.Lab;

public class T01PermutationswithoutRepetition {
    public static String[] elements = {"A", "B", "C"};
    public static String[] permutes = new String[elements.length];

    public static void main(String[] args) {
        permutes(0);
    }

    private static void permutes(int index) {
        if (index == elements.length) {
            print();
            return;
        }
        for (int i = 0; i < elements.length; i++) {
            permutes[index] = elements[i];
            permutes(index + 1);
        }
    }

    private static void print() {
        System.out.println(String.join(" ", permutes));
    }
}
