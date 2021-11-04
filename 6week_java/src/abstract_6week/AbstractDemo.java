package abstract_6week;

public class AbstractDemo {
    public static void main(String[] args) {
        //Shape s1 = new Shape(); 추상클래스 객체생성 X
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(5);
        c1.draw();
        System.out.println(c1.findArea()); //Shape(부모)의 함수를 리턴
        c2.draw();
        System.out.println(c2.findArea());

        Rectangle r1 = new Rectangle(10,5);
        r1.draw();
        System.out.println(r1.findArea());

        Cuboid cb1 = new Cuboid(10, 10, 5);
        cb1.draw();
        System.out.println(cb1.findVolume());

        Cylinder cl1 = new Cylinder(10,5);
        cl1.draw();
        System.out.println(cl1.findArea());
    }
}
