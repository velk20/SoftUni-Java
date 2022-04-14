package p03_IteratorTest;

import OOP.L10UnitTesting.Exercise.p03_IteratorTest.ListIterator;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class ListIteratorTest {

    private String[] initialElements = {"A", "B", "C"};
    private ListIterator listIterator;

    @Before
    public void initialListIterator() throws OperationNotSupportedException {
        listIterator = new ListIterator(initialElements);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorWithNullElements() throws OperationNotSupportedException {
        listIterator = new ListIterator(null);
        assertFalse(listIterator.hasNext());
    }

    @Test
    public void testConstructorWithCorrectElements() throws OperationNotSupportedException {
        listIterator = new ListIterator(initialElements);
        assertTrue(listIterator.hasNext());
    }

    @Test
    public void testMoveMethod() {
        boolean move = listIterator.move();
        assertTrue(move);
    }

    @Test
    public void testMoveWithNoElements() throws OperationNotSupportedException {
        listIterator = new ListIterator("Angel");
        listIterator.move();
        boolean b = listIterator.hasNext();
        assertFalse(b);
        assertFalse(listIterator.move());
    }

    @Test
    public void testMoveWithEmptyElements() throws OperationNotSupportedException {
        listIterator = new ListIterator(new String[0]);
        assertFalse(listIterator.hasNext());

    }

    @Test
    public void testPrintWithNOTEmptyElements() {
        String print = listIterator.print();
        assertEquals("A",print);
    }

    @Test(expected = IllegalStateException.class)
    public void testPrintWithSizeEqualsToZero() throws OperationNotSupportedException {
        listIterator = new ListIterator(new String[0]);
        listIterator.print();
    }



}