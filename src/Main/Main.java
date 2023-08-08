package Main;

import ClassFolder.Circle;
import ClassFolder.Company.*;
import ClassFolder.Cuboid;
import ClassFolder.Cylinder;
import ClassFolder.Rectangle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Circle-----------------------");
        Circle circle = new Circle(0);
        Circle circle1 = new Circle(12);

        System.out.println("Circle: " + circle);
        System.out.println("Circle1: " + circle1);
        System.out.println("Circle 1 Area: " + circle1.getArea());

        System.out.println("Cylinder-----------------------");
        Cylinder cylinder1 = new Cylinder(0, 0);
        System.out.println("Cylinder1: " + cylinder1);

        Cylinder cylinder2 = new Cylinder(10, 23);
        System.out.println("Cylinder2 Area: " + cylinder2.getArea());
        System.out.println("Cylinder2 Volume: " + cylinder2.getVolume());

        System.out.println("Rectangle-----------------------");

        Rectangle rectangle1 = new Rectangle(0, 0);
        Rectangle rectangle2 = new Rectangle(10, 15);

        System.out.println("Rectangle1: " + rectangle1);
        System.out.println("Rectangle2: " + rectangle2);
        System.out.println("Rectangle 2 Area: " + rectangle2.getArea());

        System.out.println("Cuboid-----------------------");

        Cuboid cuboid1 = new Cuboid(0, 0, 0);
        Cuboid cuboid2 = new Cuboid(12, 10, 10);

        System.out.println("Cuboid1: " + cuboid1);
        System.out.println("Cuboid2: " + cuboid2);
        System.out.println("Cuboid 1 Volume: " + cuboid1.getVolume());
        System.out.println("Cuboid 2 Volume: " + cuboid2.getVolume());

        System.out.println("Company-----------------------");

        Employee janitor = new Employee(1, "cem", 1000);
        janitor.work();
        System.out.println(janitor);
        janitor.work();
        System.out.println(janitor);

        HRManager hrManager1 = new HRManager(2, "Ali", 5000);
        hrManager1.work();
        System.out.println(hrManager1);
        hrManager1.work();
        System.out.println(hrManager1);

        JuniorDeveloper junior1 = new JuniorDeveloper(5, "Johny", 1500);
        JuniorDeveloper junior2 = new JuniorDeveloper(6, "Bobby", 1600);
        JuniorDeveloper junior3 = new JuniorDeveloper(12, "Vlad", 1000);
        junior1.work();
        junior2.work();

        MidDeveloper mid1 = new MidDeveloper(7, "Liza", 2000);
        MidDeveloper mid2 = new MidDeveloper(8, "Teresa", 2200);
        mid1.work();
        mid2.work();

        SeniorDeveloper senior1 = new SeniorDeveloper(9, "Ronald", 2500);
        SeniorDeveloper senior2 = new SeniorDeveloper(11, "Sam", 2700);
        senior1.work();
        senior2.work();

        HRManager hrManager2 = new HRManager(4, "Tom", 6000,
                new JuniorDeveloper[5], new MidDeveloper[4], new SeniorDeveloper[3]);

        hrManager2.addEmployee(0, junior1);
        hrManager2.addEmployee(1,junior2);
        hrManager2.addEmployee(0,mid1);
        hrManager2.addEmployee(1,mid2);
        hrManager2.addEmployee(0,senior1);
        hrManager2.addEmployee(1,senior2);

        //Arrayleri yazdırabilmek için toStringin overload hali ile Arrays.toString çağırılır.
        System.out.println("Juniors: " + Arrays.toString(hrManager2.getJuniorDevelopers()));
        System.out.println("Mids: " + Arrays.toString(hrManager2.getMidDevelopers()));
        System.out.println("Seniors: " + Arrays.toString(hrManager2.getSeniorDevelopers()));

        //null=> boş array döner çünkü hrManager1'in işealım methodu çalıştırılması ayrıca constructorı da doldurulmadı (58. satır)
        System.out.println("Juniors: " + Arrays.toString(hrManager1.getJuniorDevelopers()));

        hrManager2.addEmployee(0,junior3);
    }
}