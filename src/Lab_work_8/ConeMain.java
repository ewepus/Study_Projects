package Lab_work_8;

import java.util.Scanner;

public class ConeMain {
    public static Cone createCone(int diameter, int height) {
        Cone cone = new Cone(diameter, height);

        System.out.println("Area = " + cone.getArea());
        System.out.println("Volume = " + cone.getVolume());

        return cone;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diameter = sc.nextInt();
        int height = sc.nextInt();
        Cone coneFirst = createCone(diameter, height);

        diameter = sc.nextInt();
        height = sc.nextInt();
        Cone coneSecond = createCone(diameter, height);

        if (coneFirst.isEqualAreas(coneSecond)) {
            System.out.println("Area is equal");
        } else System.out.println("Area is not equal");

        if (coneFirst.isEqualVolumes(coneSecond)) {
            System.out.println("Volume is equal");
        } else System.out.println("Volume is not equal");
    }
}
//var_4