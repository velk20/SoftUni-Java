package rpg_lab;

import OOP.L10UnitTesting.Lab.rpg_lab.Axe;
import OOP.L10UnitTesting.Lab.rpg_lab.Dummy;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {
    @Test
    public void testAxeLosesDurabilityAfterAttack() {
        //Arrange
        Axe axe = new Axe(10, 10);
        Dummy dummy = new Dummy(10, 10);
        //Act
        axe.attack(dummy);
        assertEquals("We expected 10 exp, but it was not",9, axe.getDurabilityPoints());
    }

}