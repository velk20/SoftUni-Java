package Advanced.L06DefiningClasses.Exercise.T02CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> listOfEmployee;

    public Department(String name) {
        this.name = name;
        this.listOfEmployee = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void setListOfEmployee(List<Employee> listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }

    public double getAverageSalary(){
        return listOfEmployee.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }
}
