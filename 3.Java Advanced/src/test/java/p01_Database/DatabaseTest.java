package p01_Database;

import OOP.L10UnitTesting.Exercise.p01_Database.Database;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class DatabaseTest {

    private Integer[] elements = {13, 3, 45, 6, 61, 12};
    private Database database;

    @Before
    public void initialStart() throws OperationNotSupportedException {
        database = new Database(elements);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorWithMoreThanExpectedElements() throws OperationNotSupportedException {
        Integer[] elementsWithMoreElements = new Integer[17];
        database = new Database(elementsWithMoreElements);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorWithEmptyArray() throws OperationNotSupportedException {
        Integer[] arr = new Integer[0];
        database = new Database(arr);
    }

    @Test
    public void testGettingElementsFromDataBase() {
        assertArrayEquals(elements, database.getElements());
    }

    @Test
    public void testAddNotNullElementToTheElements() throws OperationNotSupportedException {

        Integer elementToBeAdded = 69;
        database.add(69);
        Integer[] newElements = {13, 3, 45, 6, 61, 12, 69};
        assertArrayEquals(newElements, database.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddNullElementToTheElements() throws OperationNotSupportedException {
        Integer element = null;
        database.add(element);
    }

    @Test
    public void testRemovingElementFromNotEmptyDatabase() throws OperationNotSupportedException {
//        private Integer[] elements = {13, 3, 45, 6, 61, 12};
        Integer[] elementsAfterRemove = {13, 3, 45, 6, 61};
        database.remove();
        assertArrayEquals(elementsAfterRemove, database.getElements());
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testRemovingElementsFromEmptyDatabase() throws OperationNotSupportedException {
        Integer[] elementsEmpty = {};
        database = new Database(elementsEmpty);
        database.remove();
    }

}