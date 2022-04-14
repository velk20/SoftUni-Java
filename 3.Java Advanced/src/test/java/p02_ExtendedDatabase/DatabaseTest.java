package p02_ExtendedDatabase;

import OOP.L10UnitTesting.Exercise.p02_ExtendedDatabase.Database;
import OOP.L10UnitTesting.Exercise.p02_ExtendedDatabase.Person;
import org.junit.Before;
import org.junit.Test;


import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class DatabaseTest {


    private Person[] people = {new Person(1, "Angel"), new Person(2, "Georig"), new Person(3, "Pesho")};
    private Database database;

    @Before
    public void initialStart() throws OperationNotSupportedException {
        database = new Database(people);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorWithMoreThanExpectedElements() throws OperationNotSupportedException {
        Person[] elementsWithMoreElements = new Person[17];
        database = new Database(elementsWithMoreElements);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorWithEmptyArray() throws OperationNotSupportedException {
        Person[] arr = new Person[0];
        database = new Database(arr);
    }

    @Test
    public void testGettingElementsFromDataBase() {
        assertArrayEquals(people, database.getElements());
    }

    @Test
    public void testAddNotNullElementToTheElements() throws OperationNotSupportedException {

        Person elementToBeAdded = new Person(4,"Alabala");
        database.add(elementToBeAdded);

        assertEquals(elementToBeAdded, database.findById(4));
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddNullElementToTheElements() throws OperationNotSupportedException {
        Person element = null;
        database.add(element);
    }

    @Test
    public void testRemovingElementFromNotEmptyDatabase() throws OperationNotSupportedException {

        database.remove();
        assertEquals(database.findById(2), people[database.getElements().length - 1]);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testRemovingElementsFromEmptyDatabase() throws OperationNotSupportedException {
        Person[] elementsEmpty = {};
        database = new Database(elementsEmpty);
        database.remove();
    }


}