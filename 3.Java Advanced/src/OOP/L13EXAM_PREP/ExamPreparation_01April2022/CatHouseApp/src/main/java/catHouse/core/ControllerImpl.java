package OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.core;

import OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.common.ExceptionMessages;
import OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.entities.cat.Cat;
import OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.entities.cat.LonghairCat;
import OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.entities.cat.ShorthairCat;
import OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.entities.houses.House;
import OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.entities.houses.LongHouse;
import OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.entities.houses.ShortHouse;
import OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.entities.toys.Ball;
import OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.entities.toys.Mouse;
import OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.entities.toys.Toy;
import OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.repositories.ToyRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ControllerImpl implements Controller{
    private ToyRepository toys;
    private List<House> houses;

    public ControllerImpl() {
        toys = new ToyRepository();
        houses = new ArrayList<>();
    }

    @Override
    public String addHouse(String type, String name) {
        House newHouse ;
        if (type.equals("ShortHouse")) {
            newHouse = new ShortHouse(name);
            houses.add(newHouse);
            return String.format("%s is successfully added.", type);
        } else if (type.equals("LongHouse")) {
            newHouse = new LongHouse(name);
            houses.add(newHouse);
            return String.format("%s is successfully added.", type);

        } else throw new NullPointerException(ExceptionMessages.INVALID_HOUSE_TYPE);
    }

    @Override
    public String buyToy(String type) {
        Toy newToy ;
        if (type.equals("Ball")) {
            newToy = new Ball();
            toys.buyToy(newToy);
            return String.format("%s is successfully added.", type);
        } else if (type.equals("Mouse")) {
            newToy = new Mouse();
            toys.buyToy(newToy);
            return String.format("%s is successfully added.", type);

        } else throw new IllegalArgumentException(ExceptionMessages.INVALID_TOY_TYPE);
    }

    @Override
    public String toyForHouse(String houseName, String toyType) {
        Toy toy ;
        if (toyType.equals("Mouse")) {
            toy = new Mouse();
        } else if (toyType.equals("Ball")) {
            toy = new Ball();
        } else throw new IllegalArgumentException(String.format("Toy of type %s is missing.", toyType));

        House myHouse = null;

        for (House house : houses) {
            if (house.getName().equals(houseName)) {
                myHouse = house;
                myHouse.buyToy(toy);
                return String.format("Successfully added %s to %s", toyType, houseName);
            }
        }

        throw new IllegalArgumentException(ExceptionMessages.INVALID_HOUSE_TYPE);


    }

    @Override
    public String addCat(String houseName, String catType, String catName, String catBreed, double price) {
        if (catType.equals("ShorthairCat")) {
            Cat newCat = new ShorthairCat(catName, catBreed, price);
            House myHouse;
            for (House house : houses) {
                if (house.getName().equals(houseName)) {
                    myHouse = house;
                    if (myHouse.getClass().getSimpleName().equals("LongHouse")) {
                        return "Unsuitable house.";
                    }
                    myHouse.addCat(newCat);
                    return String.format("Successfully added %s to %s", catType, houseName);
                }
            }
            throw new IllegalArgumentException("House name is invalid");

        } else if (catType.equals("LonghairCat")) {
            Cat newCat = new LonghairCat(catName, catBreed, price);
            House myHouse1;
            for (House house : houses) {
                if (house.getName().equals(houseName)) {
                    myHouse1 = house;
                    if (myHouse1.getClass().getSimpleName().equals("ShortHouse")) {
                        return "Unsuitable house.";
                    }
                    myHouse1.addCat(newCat);
                    return String.format("Successfully added %s to %s", catType, houseName);
                }
            }
            throw new IllegalArgumentException("House name is invalid");
        } else throw new IllegalArgumentException("Invalid cat type.");
    }

    @Override
    public String feedingCat(String houseName) {
        for (House house : houses) {
            if (house.getName().equals(houseName)) {
                Collection<Cat> cats = house.getCats();
                cats.forEach(Cat::eating);
                return String.format("Feeding a cat: %d", cats.size());
            }
        }
        throw new IllegalArgumentException("Invalid house name");
    }

    @Override
    public String sumOfAll(String houseName) {
        for (House house : houses) {
            if (house.getName().equals(houseName)) {
                Collection<Cat> cats = house.getCats();
                Collection<Toy> toys = house.getToys();
                return String.format("The value of House %s is %.2f", houseName,
                        cats.stream().mapToDouble(Cat::getPrice).sum() + toys.stream().mapToDouble(Toy::getPrice).sum());
            }
        }
        throw new IllegalArgumentException("No such house name.");
    }

    @Override
    public String getStatistics() {
        StringBuilder stringBuilder = new StringBuilder();
        for (House house : houses) {
            stringBuilder.append(house.getStatistics()).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}
