package abstract_6week;

public class Rectangle extends Shape { //Shape을 상속받는다. (=자식클래스)
    int width, length;

    public Rectangle(int width, int length) { //constructor(생성자) Alt+Insert 단축키
        this.width = width;
        this.length = length;
    }

    @Override
    void draw() {
        System.out.println("사각형을 그리다.");
    }

    @Override
    public double findArea() {  //Ctrl + O
        return width * length;
    }
}
