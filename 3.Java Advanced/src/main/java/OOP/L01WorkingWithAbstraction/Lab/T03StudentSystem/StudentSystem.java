package OOP.L01WorkingWithAbstraction.Lab.T03StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repository;

    public StudentSystem() {
        this.repository = new HashMap<>();
    }

    public Map<String, Student> getRepository() {
        return this.repository;
    }

    public void ParseCommand(String[] inputString) {

        if (inputString[0].equals("Create")) {
            createStudent(inputString);
        } else if (inputString[0].equals("Show")) {
            printStudent(inputString);
        }
    }

    private void printStudent(String[] inputString) {
        String name = inputString[1];
        if (repository.containsKey(name)) {
            Student student = repository.get(name);
            String view = student.toString();

            view = checkGrade(student, view);

            System.out.println(view);
        }
    }

    private void createStudent(String[] inputString) {
        String name = inputString[1];
        int age = Integer.parseInt(inputString[2]);
        double grade = Double.parseDouble(inputString[3]);
        this.repository.putIfAbsent(name, new Student(name, age, grade));
    }

    private String checkGrade(Student student, String view) {
        if (student.getGrade() >= 5.00) {
            view += " Excellent student.";
        } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
            view += " Average student.";
        } else {
            view += " Very nice OOP.L03Inheritance.Exercise.person.";
        }
        return view;
    }
}
