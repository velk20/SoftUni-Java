package Advanced.L06DefiningClasses.Exercise.T02CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departmentMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];
            String email = null;
            Integer age = null;
            Employee employee = null;

            if (tokens.length == 4) {
                employee = new Employee(name, salary, position, department);
                if (!departmentMap.containsKey(department)) {
                    Department department1 = new Department(department);
                    departmentMap.put(department, department1);
                }
                departmentMap.get(department).getListOfEmployee().add(employee);


            } else if (tokens.length == 6) {
                email = tokens[4];
                age = Integer.parseInt(tokens[5]);

                employee = new Employee(name, salary, position, department, email, age);
                if (!departmentMap.containsKey(department)) {
                    Department department1 = new Department(department);
                    departmentMap.put(department, department1);
                }
                departmentMap.get(department).getListOfEmployee().add(employee);
            } else if (tokens.length == 5) {
                if (tokens[4].contains("@")) {
                    email = tokens[4];
                    employee = new Employee(name, salary, position, department, email);
                    if (!departmentMap.containsKey(department)) {
                        Department department1 = new Department(department);
                        departmentMap.put(department, department1);
                    }
                    departmentMap.get(department).getListOfEmployee().add(employee);
                } else {
                    age = Integer.parseInt(tokens[4]);
                    employee = new Employee(name, salary, position, department,age);
                    if (!departmentMap.containsKey(department)) {
                        Department department1 = new Department(department);
                        departmentMap.put(department, department1);
                    }
                    departmentMap.get(department).getListOfEmployee().add(employee);
                }
            }

        }

        String maxAverageSalaryDepartment = departmentMap
                .entrySet()
                .stream()
                .max(Comparator.comparingDouble(e -> e.getValue().getAverageSalary()))
                .get()
                .getKey();

        System.out.printf("Highest Average Salary: %s\n", maxAverageSalaryDepartment);

        departmentMap.get(maxAverageSalaryDepartment)
                .getListOfEmployee().stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(e->
                {
                    System.out.printf("%s %.2f %s %d\n", e.getName(), e.getSalary(), e.getEmail(), e.getAge());
                });

    }
}
