package Lab_work_10.ComputerGame.Player;

import Lab_work_10.ComputerGame.Armor.Armor;
import Lab_work_10.ComputerGame.Armor.Boots;
import Lab_work_10.ComputerGame.Armor.Dress;
import Lab_work_10.ComputerGame.Armor.Helmet;
import Lab_work_10.ComputerGame.Item.Food;
import Lab_work_10.ComputerGame.Item.HealthPotion;
import Lab_work_10.ComputerGame.Weapon.Sword;
import Lab_work_10.ComputerGame.Weapon.Weapon;

import java.util.Random;

public class Main {
    public static Random random = new Random();

    public static Knight createKnight(String username) {
        Armor boots = new Boots();
        Armor dress = new Dress();
        Armor helmet = new Helmet();
        Weapon sword = new Sword();

        Knight knight = new Knight(username);

        knight.dress(boots);
        knight.dress(dress);
        knight.dress(helmet);

        knight.change(sword);

        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(2);
            if (number == 0) {
                HealthPotion healthPotion = new HealthPotion();
                knight.putInto(healthPotion, i);
            } else {
                Food steak = new Food();
                knight.putInto(steak, i);
            }
        }

        return knight;
    }

    public static void main(String[] args) {
        Knight player = createKnight("ewepu");
        Knight enemyKnight = createKnight("Enemy knight");

        int distance = 4;
        int foodCount = 0;
        boolean flee = false;

        while (!player.isDead() && !enemyKnight.isDead()) {
            System.out.println("Ход игрока");
            if (distance > player.weapon.getDistance()) {
                distance--;
                System.out.println("Расстояние уменьшено до: " + distance);
                System.out.println();
            } else {

                for (int i = 0; i < player.items.length; i++) {
                    if (player.items[i] instanceof Food food) {
                        foodCount++;
                    }
                }
                if (foodCount == 0 && player.getStrength() < 20) {
                    flee = true;
                    break;
                }
                if (player.getStrength() <= 40) {
                    for (int i = 0; i < player.items.length; i++) {
                        if (player.items[i] instanceof Food food) {
                            if (!food.isUsed()) {
                                int amount = player.useItem(i);
                                System.out.println("Восстановлено: " + amount + " сил");
                                System.out.println("Запас сил: " + player.getStrength());
                                System.out.println();
                                break;
                            }
                        }
                    }
                }
                System.out.println("Вы нанесли врагу: " + player.action(enemyKnight, distance) + " урона");
                System.out.println("У врага осталось: " + enemyKnight.getHealth() + " здоровья");
                System.out.println("У вас осталось: " + player.getStrength() + " сил");
                System.out.println();
            }

            if (enemyKnight.isDead()) break;
            System.out.println("Ход врага");
            if (distance > enemyKnight.weapon.getDistance()) {
                distance--;
                System.out.println("Расстояние уменьшено до: " + distance);
                System.out.println();
            } else {
                System.out.println("Враг нанёс вам: " + enemyKnight.action(player, distance) + " урона");
                System.out.println("У вас осталось: " + player.getHealth() + " здоровья");
                System.out.println("У врага осталось: " + enemyKnight.getStrength() + " сил");
                System.out.println();
            }
        }

        if (flee) {
            System.out.println("Вы сбежали!");
        } else {
            if (player.isDead()) {
                System.out.println("Вы проиграли!");
            } else System.out.println("Вы победили!");
        }
    }
}