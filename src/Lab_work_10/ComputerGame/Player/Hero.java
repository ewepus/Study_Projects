package Lab_work_10.ComputerGame.Player;

import Lab_work_10.ComputerGame.Armor.Armor;
import Lab_work_10.ComputerGame.Item.Item;
import Lab_work_10.ComputerGame.Weapon.Weapon;

import java.util.Arrays;
import java.util.Random;

public abstract class Hero implements Player, Health, Equipment, Inventory {
    protected String username;
    protected int health;
    protected Weapon weapon;
    protected Armor[] armour = new Armor[CLOTHES_COUNT];
    protected Item[] items = new Item[ITEMS_COUNT];

    public Hero(String username) {
        if (username != null) {
            this.username = username;
            this.health = MAX_HEALTH;
        } else throw new IllegalArgumentException("Invalid name");
    }

    private void loseHealth(int amount) {
        health -= amount;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public int damage(int enemyDamage) {
        Random random = new Random();
        Armor target = armour[random.nextInt(0, 3)];

        if (!target.isBroken()) {
            target.destroyBy(enemyDamage - enemyDamage / 2);
            loseHealth(enemyDamage / 2);
            return enemyDamage / 2;
        }
        loseHealth(enemyDamage);
        return enemyDamage;
        //возвращает полученный урон
    }

    @Override
    public boolean isDead() {
        return health <= 0;
    }

    @Override
    public void recoverHealth(int amount) {
        if (MAX_HEALTH - health < amount) {
            health = 100;
        } else health += amount;
    }

    @Override
    public void dress(Armor armor) {
        armour[armor.getPosition() - 1] = armor;
    }

    @Override
    public boolean putInto(Item item, int position) {
        items[position] = item;
        return true;
    }

    @Override
    public abstract int action(Hero enemy, int distance);

    @Override
    public abstract boolean change(Weapon weapon);

    @Override
    public abstract int useItem(int position);

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + getUsername() + ", health: " +
                health + ", weapon: " + weapon.toString() +
                ", inventory: " + Arrays.toString(items);
    }

    public int getHealth() {
        return health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor[] getArmour() {
        return armour;
    }

    public Item[] getItems() {
        return items;
    }
}
