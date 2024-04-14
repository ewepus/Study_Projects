package Lab_work_10.ComputerGame.Weapon;

import java.util.Random;

public abstract class BaseWeapon implements Weapon {
    protected int power;

    public BaseWeapon() {
        Random random = new Random();
        this.power = random.nextInt(MIN_VALUE, MAX_VALUE + 1);
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public abstract int getDistance();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", power: " + getPower() + ", distance: " + getDistance();
    }
}
