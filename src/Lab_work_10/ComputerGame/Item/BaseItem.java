package Lab_work_10.ComputerGame.Item;

import java.util.Random;

public abstract class BaseItem implements Item {
    protected int quality;
    protected boolean isUsed = false;

    public BaseItem() {
        Random random = new Random();
        this.quality = random.nextInt(MIN_VALUE, MAX_VALUE + 1);
    }

    @Override
    public int use() {
        isUsed = true;
        return quality * 5;
    }

    @Override
    public boolean isUsed() {
        return isUsed;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", quality: " + quality + ", isUsed: " + isUsed();
    }
}
