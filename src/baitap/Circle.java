package baitap;

public class Circle {
    private int id;
    private double radius;
    private static final double PI = 3.14;
    private static int idIncrement = 1;
    public static int countObj = 0;
    public static double maxRadius = 0;
    public static double sumS = 0;


    public Circle( double radius) {
        this.id = idIncrement;
        this.radius = radius;
        idIncrement++;
        countObj++;

        if (radius > maxRadius){
            maxRadius = radius;
        }
        double s = getDientich();
        sumS = sumS + s;
    }


    public double getDientich(){
        return PI * Math.pow(this.radius, 2);
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        this.id = id;
        return id;
    }

    public double getRadius() {
        return radius;
    }

    public double setRadius() {
        this.radius = radius;
        return 0;
    }

}
class Main {
    public static void main(String[] args) {
        Circle ck1 = new Circle(5.6);
        System.out.println(ck1.getId());
        Circle ck2 = new Circle(5.4);
        System.out.println(ck2.getId());
        Circle ck3 = new Circle(5.3);
        System.out.println(ck3.getId());
        System.out.println("Số lượng đối tượng của lớp Circle là" + Circle.countObj);
        System.out.println("Hình tròn có bán kính lớn nhất là" + Circle.maxRadius);
        System.out.println("Diện tích các hình tròn là" + Circle.sumS);
    }
}

