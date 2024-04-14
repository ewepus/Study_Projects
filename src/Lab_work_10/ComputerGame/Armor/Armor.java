package Lab_work_10.ComputerGame.Armor;

public interface Armor {
    public int MIN_VALUE = 5;
    public int MAX_VALUE = 50;

    public boolean isBroken();

    public int destroyBy(int enemyDamage);

    public int getPosition();
}
