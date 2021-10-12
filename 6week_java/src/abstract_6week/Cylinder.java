package abstract_6week;

public class Cylinder extends Circle{
    int height;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("원통을 그리다.");
    }

    @Override
    public double findArea() {
        return super.findArea() * this.height;
    }
}
