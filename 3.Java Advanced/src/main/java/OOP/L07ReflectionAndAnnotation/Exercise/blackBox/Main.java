package OOP.L07ReflectionAndAnnotation.Exercise.blackBox;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);

        Class<BlackBoxInt> clazz = BlackBoxInt.class;
        String input = scanner.nextLine();

        Constructor<BlackBoxInt> declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        BlackBoxInt blackBoxInt = declaredConstructor.newInstance();
        Field field = blackBoxInt.getClass().getDeclaredField("innerValue");
        field.setAccessible(true);

        while (!input.equals("END")) {
            String methodName = input.split("_")[0];
            int value = Integer.parseInt(input.split("_")[1]);
            Method declaredMethod = clazz.getDeclaredMethod(methodName,int.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(blackBoxInt,value);

            input = scanner.nextLine();
            System.out.println(field.get(blackBoxInt));

        }
    }
}
