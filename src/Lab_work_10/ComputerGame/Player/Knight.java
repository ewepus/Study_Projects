package Lab_work_10.ComputerGame.Player;

import Lab_work_10.ComputerGame.Item.BaseItem;
import Lab_work_10.ComputerGame.Item.Food;
import Lab_work_10.ComputerGame.Item.HealthPotion;
import Lab_work_10.ComputerGame.Item.Item;
import Lab_work_10.ComputerGame.Weapon.Weapon;

public class Knight extends Hero {
    private final int MAX_STRENGTH = 100;
    private int strength;
    private int forcePower = 1;

    public Knight(String username) {
        super(username);
        this.strength = MAX_STRENGTH;
    }

    @Override
    public int action(Hero enemy, int distance) {
        if (distance <= weapon.getDistance() && strength >= 20) {
            strength -= 20;
            return enemy.damage(weapon.getPower() * forcePower);
        }
        return 0;
    }

    @Override
    public boolean change(Weapon weapon) {
        super.weapon = weapon;
        return true;
    }

    @Override
    public int useItem(int position) {
        if (items[position] instanceof HealthPotion healthPotion) {
            int amount = healthPotion.use();
            recoverHealth(amount);
            return amount;
        }

        if (items[position] instanceof Food food) {
            int amount = food.use();
            if (MAX_STRENGTH - this.strength < amount) {
                this.strength = 100;
            } else this.strength += amount;
            return amount;
        }
        return 0;
    }

    public int getStrength() {
        return strength;
    }
}
