package Lab_work_10.ComputerGame.Weapon;

public class Sword extends BaseWeapon {
    private final int SWORD_DISTANCE = 2;

    public Sword() {
    }

    @Override
    public int getDistance() {
        return SWORD_DISTANCE;
    }
}
