package OOP.L07ReflectionAndAnnotation.Lab.reflectionLabDemo;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //first example
        Class<?> reflectionClass = Reflection.class;//ReflectionExample from resource lab
        //Class myClass = Class.forName("reflectionLab.ReflectionExample");// same as first example
        System.out.println(reflectionClass.getName()); // return full name
        System.out.println(reflectionClass.getSimpleName());// return only the name of the class
        System.out.println(reflectionClass.getSuperclass());
        System.out.println(reflectionClass.toString());

        //!new instance of class
        Reflection reflection = (Reflection) reflectionClass.getDeclaredConstructor().newInstance();
        System.out.println(reflection);


        //!For constructors
        Constructor<?>[] publicConstructors = reflectionClass.getConstructors(); // only public classes
        //when something starts with get...() => it only returns public methods,fields .....

        Constructor<?>[] allConstructors = reflectionClass.getDeclaredConstructors();
        System.out.println();

        Constructor<?> declaredConstructor = reflectionClass.getDeclaredConstructor(String.class, String.class, String.class);


        //we setAccessible(true) because this constructor with 3 parameters is private!!!
        declaredConstructor.setAccessible(true);
        Reflection newInstance = (Reflection) declaredConstructor.newInstance("Pesho", "Ivan", "Georgi");
        System.out.println(newInstance);


        //!For Fields
        Field[] publicFields = reflectionClass.getFields();
        Field name = reflectionClass.getField("name");//only one field with specific name
        System.out.println(name.getName());
        System.out.println(name.getType());
        Field[] allFields = reflectionClass.getDeclaredFields();


        //!For Methods
        Method[] declaredMethods = reflectionClass.getDeclaredMethods();
        Method name1 = reflectionClass.getDeclaredMethod("getName");
        name1.invoke(newInstance); // when we want to call a method
        System.out.println(name1);


        //!For Modifiers
        int modifiers = reflectionClass.getModifiers();
        System.out.println(Modifier.toString(modifiers));
        System.out.println(Modifier.isPublic(modifiers));
        System.out.println(Modifier.isPrivate(modifiers));
        System.out.println(Modifier.isProtected(modifiers));
        System.out.println(Modifier.isStatic(modifiers));
        //.......

        //!For Annotations
        Annotation[] aClass =  reflectionClass.getAnnotations();







    }
}
