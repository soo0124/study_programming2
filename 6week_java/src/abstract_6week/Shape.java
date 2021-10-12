package abstract_6week;

public abstract class Shape {  //abstract:추상  - 추상클래스 선언
    abstract void draw();   //상속인 자식클래스에 무조건 강제 구현 (abstract)

    public double findArea(){ //상속인 자식클래스에 구현을 강제 구현 X
        return 0.0;
    }
//    {
//        System.out.println("도형을 그리다.");
//    };
}

