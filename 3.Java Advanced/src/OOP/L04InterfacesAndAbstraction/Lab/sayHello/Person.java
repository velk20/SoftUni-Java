package OOP.L04InterfacesAndAbstraction.Lab.sayHello;

public interface Person {
    String getName();

    default String sayHello() {
        return "Hello";
    }
}
