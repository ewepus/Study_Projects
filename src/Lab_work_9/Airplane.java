package Lab_work_9;

public class Airplane extends Vehicle {
    private Integer wingsCount;
    private Integer enginesNumber;
    private boolean isHydroplane;

    public Airplane(Integer passengers, Integer wingsCount, Integer enginesNumber, boolean isHydroplane) {
        super(passengers);
        this.setWingsCount(wingsCount);
        this.setEnginesNumber(enginesNumber);
        this.setHydroplane(isHydroplane);
    }

    public void setWingsCount(Integer wingsCount) {
        if (wingsCount < 0) {
            throw new IllegalArgumentException("Invalid negative number! Argument: wings count");
        }
        if (wingsCount == 0) {
            throw new IllegalArgumentException("Need wings to fly!");
        }
        this.wingsCount = wingsCount;
    }

    public void setEnginesNumber(Integer enginesNumber) {
        if (enginesNumber < 0) {
            throw new IllegalArgumentException("Invalid negative number! Argument: engine count");
        }
        if (enginesNumber != 0 && enginesNumber != 8 && enginesNumber != 10 && enginesNumber != 12) {
            throw new IllegalArgumentException("Invalid engines number!");
        }
        this.enginesNumber = enginesNumber;
    }

    public void setHydroplane(boolean hydroplane) {
        this.isHydroplane = hydroplane;
    }

    @Override
    public String toString() {
        if (!isHydroplane) {
            return "In an Airplane " + passengers + " passengers\n" +
                    "With " + wingsCount + " wings and " + enginesNumber + " engines";
        }
        return "In a Hydroplane " + passengers + " passengers\n" +
                "With " + wingsCount + " wings and " + enginesNumber + " engines";
    }
}
//var_3
