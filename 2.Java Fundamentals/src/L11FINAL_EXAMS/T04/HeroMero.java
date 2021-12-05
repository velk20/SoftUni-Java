package L11FINAL_EXAMS.T04;


import java.util.*;

public class HeroMero {
    private static class Hero {
        private String name;
        private int health;
        private int mana;

        public Hero(String name, int health, int mana) {
            this.name = name;
            this.health = health;
            this.mana = mana;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getMana() {
            return mana;
        }

        public void setMana(int mana) {
            this.mana = mana;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Hero> heroList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int hp = Integer.parseInt(tokens[1]);
            int mp = Integer.parseInt(tokens[2]);

            Hero hero = new Hero(name, hp, mp);
            heroList.add(hero);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" - ");
            String command = tokens[0];
            if (command.equals("CastSpell")) {
                String heroName = tokens[1];
                int neededMP = Integer.parseInt(tokens[2]);
                String spellName = tokens[3];
                Hero currentHero = getHero(heroName, heroList);
                int indexOfCurrentHero = heroList.indexOf(currentHero);
                int currentHeroMana = currentHero.getMana();

                if (currentHeroMana >= neededMP) {
                    heroList.remove(indexOfCurrentHero);
                    currentHero.setMana(currentHeroMana - neededMP);
                    heroList.add(currentHero);
                    System.out.printf("%s has successfully cast %s and now has %d MP!\n", heroName, spellName,
                            currentHero.getMana());
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
                }

            } else if (command.equals("TakeDamage")) {
                String heroName = tokens[1];
                int damage = Integer.parseInt(tokens[2]);
                String attacker = tokens[3];

                Hero currentHero = getHero(heroName, heroList);
                int indexOfCurrentHero = heroList.indexOf(currentHero);

                int currentHeroHealth = currentHero.getHealth();

                heroList.remove(indexOfCurrentHero);
                currentHero.setHealth(currentHeroHealth - damage);

                if (currentHero.getHealth() <= 0) {
                    System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                } else {
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n"
                            , heroName, damage, attacker, currentHero.getHealth());
                    heroList.add(currentHero);
                }


            } else if (command.equals("Recharge")) {
                String heroName = tokens[1];
                int manaRecharge = Integer.parseInt(tokens[2]);

                Hero currentHero = getHero(heroName, heroList);
                int indexOfCurrentHero = heroList.indexOf(currentHero);

                int currentHeroMana = currentHero.getMana();
                heroList.remove(indexOfCurrentHero);
                if (currentHeroMana + manaRecharge >= 200) {
                    currentHero.setMana(200);
                    heroList.add(currentHero);
                    System.out.printf("%s recharged for %d MP!\n", heroName, 200 - currentHeroMana);

                } else {
                    currentHero.setMana(currentHeroMana + manaRecharge);
                    heroList.add(currentHero);
                    System.out.printf("%s recharged for %d MP!\n", heroName, manaRecharge);
                }
            } else if (command.equals("Heal")) {
                String heroName = tokens[1];
                int healthRecharge = Integer.parseInt(tokens[2]);

                Hero currentHero = getHero(heroName, heroList);
                int indexOfCurrentHero = heroList.indexOf(currentHero);

                int currentHeroHP = currentHero.getHealth();
                heroList.remove(indexOfCurrentHero);
                if (currentHeroHP + healthRecharge >= 100) {
                    currentHero.setHealth(100);
                    heroList.add(currentHero);
                    System.out.printf("%s healed for %d HP!\n", heroName, 100 - currentHeroHP);

                } else {
                    currentHero.setHealth(currentHeroHP + healthRecharge);
                    heroList.add(currentHero);
                    System.out.printf("%s healed for %d HP!\n", heroName, healthRecharge);

                }
            }


            input = scanner.nextLine();

        }

        Collections.sort(heroList,
                Comparator.comparing(Hero::getHealth).reversed().thenComparing(Comparator.comparing(Hero::getName)));
        heroList.forEach(e -> System.out.println(e.getName() + "\n" + " HP: " + e.getHealth() + "\n" + " MP: " + e.getMana()));
    }

    public static Hero getHero(String name, List<Hero> heroList) {
        for (Hero myHero : heroList) {
            if (myHero.getName().equals(name)) {
                return myHero;
            }
        }
        return null;
    }
}
