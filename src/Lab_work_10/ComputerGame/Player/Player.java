package Lab_work_10.ComputerGame.Player;

public interface Player {
    public String getUsername();
    public int damage(int enemyDamage);
    public int action(Hero enemy, int distance);
}
