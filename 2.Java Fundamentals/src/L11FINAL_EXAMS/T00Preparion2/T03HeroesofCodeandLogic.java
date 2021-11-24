package L11FINAL_EXAMS.T00Preparion2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T03HeroesofCodeandLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> namesAndHP = new LinkedHashMap<>();
        Map<String, Integer> namesAndMP = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] hero = scanner.nextLine().split("\\s");
            String name = hero[0];
            int hp = Integer.parseInt(hero[1]);
            int mp = Integer.parseInt(hero[2]);

            namesAndHP.put(name, hp);
            namesAndMP.put(name, mp);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" - ");
            String command = tokens[0];
            String heroName = tokens[1];

            switch (command) {
                case "CastSpell":
                    int neededMP = Integer.parseInt(tokens[2]);
                    String spellName = tokens[3];
                    int currentMP = namesAndMP.get(heroName);

                    if (currentMP >= neededMP) {
                        int MPleft = currentMP - neededMP;
                        namesAndMP.put(heroName, MPleft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n", heroName, spellName, MPleft);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
                    }
                    break;

                case "TakeDamage":
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];

                    int currentHP = namesAndHP.get(heroName);

                    int leftHP = currentHP - damage;
                    if (leftHP > 0) {
                        namesAndHP.put(heroName, leftHP);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", heroName, damage,
                                attacker, leftHP);
                    } else {
                        namesAndMP.remove(heroName);
                        namesAndHP.remove(heroName);
                        System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                    }
                    break;

                case "Recharge":
                    int amountRecharge = Integer.parseInt(tokens[2]);
                    int currentMp = namesAndMP.get(heroName);

                    if (currentMp + amountRecharge > 200) {
                        namesAndMP.put(heroName, 200);
                        System.out.printf("%s recharged for %d MP!\n", heroName, 200 - currentMp);
                    } else {
                        namesAndMP.put(heroName, amountRecharge + currentMp);
                        System.out.printf("%s recharged for %d MP!\n", heroName, amountRecharge);

                    }

                    break;
                case "Heal":
                    int amountHeal = Integer.parseInt(tokens[2]);
                    int currentHp = namesAndHP.get(heroName);

                    int allHeal = amountHeal + currentHp;
                    if (allHeal > 100) {
                        namesAndHP.put(heroName, 100);
                        System.out.printf("%s healed for %d HP!\n", heroName, 100 - currentHp);
                    } else {
                        namesAndHP.put(heroName, allHeal);
                        System.out.printf("%s healed for %d HP!\n", heroName, amountHeal);

                    }
                    break;

            }

            input = scanner.nextLine();
        }

        namesAndHP
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.<String, Integer>comparingByKey()))
                .forEach(e1 -> System.out.printf("%s\n  HP: %d\n  MP: %d\n", e1.getKey(), e1.getValue(),
                        namesAndMP.get(e1.getKey())));
    }
}
