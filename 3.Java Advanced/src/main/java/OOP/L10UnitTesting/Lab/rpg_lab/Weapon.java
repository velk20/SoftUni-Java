package OOP.L10UnitTesting.Lab.rpg_lab;

public interface Weapon {
    int getAttackPoints();

    int getDurabilityPoints();

    void attack(Target target);
}
