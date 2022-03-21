package Advanced.L10EXAMS.JavaAdvancedExam23October2021.T03Hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private int capacity;
    private List<Person> roster;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void add(Person person) {
        if (roster.size() < capacity) {
            roster.add(person);
        }
    }

    public boolean remove(String name) {
        for (Person person : this.roster) {
            if (person.getName().equals(name)) {
                roster.remove(person);
                return true;
            }
        }
        return false;
    }

    public Person getPerson(String name, String hometown) {
        Person hPerson = null;
        for (Person person : this.roster) {
            if (person.getName().equals(name) && person.getHometown().equals(hometown)) {
                hPerson = person;
            }
        }
        return hPerson;
    }

    public int getCount(){
        return this.roster.size();
    }

    public String getStatistics(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("The people in the hotel %s are:\n", this.name));
        for (Person person : roster) {
            stringBuilder.append(person.toString()).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}
