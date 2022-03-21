package OOP.L07ReflectionAndAnnotation.Exercise.barracksWars;

import OOP.L07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.Repository;
import OOP.L07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.Runnable;
import OOP.L07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.UnitFactory;
import OOP.L07ReflectionAndAnnotation.Exercise.barracksWars.core.Engine;
import OOP.L07ReflectionAndAnnotation.Exercise.barracksWars.core.factories.UnitFactoryImpl;
import OOP.L07ReflectionAndAnnotation.Exercise.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
