package Lab_work_10.ComputerGame.Player;

import Lab_work_10.ComputerGame.Item.Item;

public interface Inventory {
    public int ITEMS_COUNT = 5;
    public boolean putInto(Item item, int position);
    public int useItem(int position);
}
