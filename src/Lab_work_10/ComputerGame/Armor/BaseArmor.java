package Lab_work_10.ComputerGame.Armor;

import java.util.Random;

public abstract class BaseArmor implements Armor {
    protected int durability;

    public BaseArmor() {
        Random random = new Random();
        this.durability = random.nextInt(MIN_VALUE, MAX_VALUE + 1);
    }

    @Override
    public boolean isBroken() {
        return durability == 0;
    }

    @Override
    public int destroyBy(int enemyDamage) {
        if (enemyDamage <= durability) {
            durability -= enemyDamage;
            return 0;
        }
        durability = 0;
        return enemyDamage - durability;
        //возвращает оставшийся урон
    }

    @Override
    public abstract int getPosition();

    @Override
    public String toString() {
        return getPosition() + ": " + this.getClass().getSimpleName() + ", durability: " +
                durability + ", isBroken: " + isBroken();
    }
}
//return this.getClass().getSimpleName() + ": " + super.getName();