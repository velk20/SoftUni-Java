package Advanced.L06DefiningClasses.Exercise.T07Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        List<Google> googles = new ArrayList<>();

        while (!string.equals("End")) {
            String[] tokens = string.split("\\s+");
            String name = tokens[0];
            String type = tokens[1];
            
            Google google = null;
            boolean findPreviousGoogle = false;
            for (Google google1 : googles) {
                if (google1.getName().equals(name)) {
                    google = google1;
                    findPreviousGoogle = true;

                    break;
                }
            }
            if (!findPreviousGoogle) {
                google = new Google(name);
            }
            
            switch (type) {
                case "company":
                    Google.Company company = google.new Company(tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                    google.setCompany(company);
                    break;
                    case "pokemon":
                        Google.Pokemon pokemon = google.new Pokemon(tokens[2], tokens[3]);
                        google.setPokemons(pokemon);
                    break;
                case "parents":
                    Google.Parent parent = google.new Parent(tokens[2], tokens[3]);
                    google.setParents(parent);

                    break;
                case "children":
                    Google.Child child = google.new Child(tokens[2], tokens[3]);
                    google.setChildren(child);

                    break;
                case "car":
                    Google.Car car  = google.new Car(tokens[2], tokens[3]);
                    google.setCar(car);
                    break;

            }

            googles.add(google);

            string = scanner.nextLine();
        }

        String search = scanner.nextLine();
        Google mygoogle = null;
        for (Google google : googles) {
            if (google.getName().equals(search)) {
                mygoogle = google;
            }
        }


        System.out.println(search);

        System.out.println("Company:");
        assert mygoogle != null;
        Google.Company company = mygoogle.getCompany();
        if (company!=null) {
            System.out.printf("%s %s %.2f\n", company.getName(), company.getDepartment(), company.getSalary());
        }

        System.out.println("Car:");
        Google.Car car = mygoogle.getCar();
        if (car!=null) System.out.printf("%s %s\n", car.getModel(), car.getSpeed());

        System.out.println("Pokemon:");
        List<Google.Pokemon> pokemon = mygoogle.getPokemons();
        if (pokemon!=null){
        for (Google.Pokemon pokemon1 : pokemon) {
            System.out.printf("%s %s\n", pokemon1.getName(), pokemon1.getType());
        }
        }

        System.out.println("Parents:");
        List<Google.Parent> parents = mygoogle.getParents();
        if (parents != null) {
            for (Google.Parent pokemon1 : parents) {
                System.out.printf("%s %s\n", pokemon1.getName(), pokemon1.getBirthday());
            }

        }


        System.out.println("Children:");
        List<Google.Child> children = mygoogle.getChildren();
        if (children != null) {
            for (Google.Child pokemon1 : children) {
                System.out.printf("%s %s\n", pokemon1.getName(), pokemon1.getBirthday());
            }

        }
    }
}
