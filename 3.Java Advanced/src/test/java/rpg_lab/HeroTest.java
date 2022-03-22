package rpg_lab;

import OOP.L10UnitTesting.Lab.rpg_lab.Hero;
import OOP.L10UnitTesting.Lab.rpg_lab.Target;
import OOP.L10UnitTesting.Lab.rpg_lab.Weapon;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class HeroTest {

    @Test
    public void testHeroGainsXPWhenTargetDies() {

        //Mocking!
        Weapon weaponMock = Mockito.mock(Weapon.class);
        Target targetMock = Mockito.mock(Target.class);

        //we want the targetmock to be always dead
        Mockito.when(targetMock.isDead()).thenReturn(true);
        Hero hero = new Hero("Pesho",weaponMock);

        hero.attack(targetMock);

        Assert.assertEquals(10, hero.getExperience());
    }

}