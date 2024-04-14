package Lab_work_10.ComputerGame.Player;

public interface Health {
    public int MAX_HEALTH = 100;
    public boolean isDead();
    public void recoverHealth(int amount);
}
