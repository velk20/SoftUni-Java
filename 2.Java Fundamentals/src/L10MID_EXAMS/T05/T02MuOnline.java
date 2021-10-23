package L10MID_EXAMS.T05;

import java.util.*;

public class T02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rooms = scanner.nextLine().split("\\|");
        int initialHealth = 100;
        int initialBitcoin = 0;
        boolean youAreDead = false;

        for (int i = 0; i < rooms.length; i++) {
            if (!youAreDead) {

                String[] currentRoom = rooms[i].split(" ");
                switch (currentRoom[0]) {
                    case "potion":
                        int heal = Integer.parseInt(currentRoom[1]);
                        if (initialHealth + heal <= 100) {
                            initialHealth += heal;
                        }
                        else {
                            heal = 100 - initialHealth;
                            initialHealth = 100;
                        }
                        System.out.printf("You healed for %d hp.\n", heal);
                        System.out.printf("Current health: %d hp.\n", initialHealth);
                        break;

                    case "chest":
                        int money = Integer.parseInt(currentRoom[1]);
                        initialBitcoin += money;
                        System.out.printf("You found %d bitcoins.\n", money);
                        break;

                    default:
                        String monster = currentRoom[0];
                        int attack = Integer.parseInt(currentRoom[1]);
                        initialHealth -= attack;
                        if (initialHealth > 0) {
                            System.out.printf("You slayed %s.\n", monster);
                        } else {
                            System.out.printf("You died! Killed by %s.\n", monster);
                            System.out.printf("Best room: %d\n", i + 1);
                            youAreDead = true;
                            break;
                        }

                }
            }
            else break;
        }

        if (!youAreDead) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d\n",initialBitcoin);
            System.out.printf("Health: %d\n",initialHealth);
        }
    }
}
