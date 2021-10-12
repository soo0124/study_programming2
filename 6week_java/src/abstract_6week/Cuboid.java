package abstract_6week;

public class Cuboid extends Rectangle {
    int height;

    public Cuboid(int width, int length, int height) {
        super(width, length);   //부모클래스의 생성자 (항상 첫줄에 배치)
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("직육면체를 그리다.");
    }
    public double findVolume(){
        return width * length * height;
    }
}
