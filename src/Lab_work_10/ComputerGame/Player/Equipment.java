package Lab_work_10.ComputerGame.Player;

import Lab_work_10.ComputerGame.Armor.Armor;
import Lab_work_10.ComputerGame.Weapon.Weapon;

public interface Equipment {
    public int CLOTHES_COUNT = 3;
    public boolean change(Weapon weapon);
    public void dress(Armor armor);
}
