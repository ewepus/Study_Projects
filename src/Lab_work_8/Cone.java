package Lab_work_8;

public class Cone {
    private final int diameter;
    private final int height;

    public Cone(int diameter, int height) {
        this.diameter = Math.abs(diameter);
        this.height = Math.abs(height);
    }

    public int getArea() {
        int radius = diameter / 2;
        double generatrix = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return (int) Math.round(Math.PI * radius * generatrix + Math.PI * (radius * radius));
    }

    public int getVolume() {
        double numberThree = 3;
        return (int) Math.round(diameter * height / numberThree);
    }

    public boolean isEqualAreas(Cone cone) {
        return this.getArea() == cone.getArea();
    }

    public boolean isEqualVolumes(Cone cone) {
        return this.getVolume() == cone.getVolume();
    }
}
//var_4