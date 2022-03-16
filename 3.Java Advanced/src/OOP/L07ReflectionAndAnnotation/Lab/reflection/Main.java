package OOP.L07ReflectionAndAnnotation.Lab.reflection;



import java.util.Arrays;
import java.lang.reflect.*;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> myClass = Reflection.class;
        //Task 1
//        System.out.println(myClass.getClass().getSimpleName().toLowerCase() +" "+myClass.getSimpleName());
//        System.out.println(myClass.getClass().getSimpleName().toLowerCase() +" "+myClass.getSuperclass().getTypeName());
//        Arrays.stream(myClass.getInterfaces()).forEach(System.out::println);
//        Reflection OOP.L07ReflectionAndAnnotation.Lab.reflection = (Reflection) myClass.getDeclaredConstructor().newInstance();
//        System.out.println(OOP.L07ReflectionAndAnnotation.Lab.reflection);

        //Task 2
        Method[] declaredMethods = myClass.getDeclaredMethods();

    Arrays.stream(declaredMethods).sorted(Comparator.comparing(Method::getName)).filter(e -> e.getName().startsWith("get")
            && e.getParameterCount() == 0
    && !e.getName().equals("toString")).forEach(
                e -> System.out.printf("%s will return class %s%n", e.getName(), e.getReturnType())
        );

        Arrays.stream(declaredMethods).sorted(Comparator.comparing(Method::getName)).filter(e -> e.getName().startsWith("set")&& !e.getName().equals("toString") && e.getParameterCount() == 1).forEach(
                e -> System.out.printf("%s and will set field of class %s%n", e.getName(),
                        e.getParameterTypes()[0].getSimpleName())
        );

    }
}
