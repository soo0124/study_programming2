package interface3_3week;

import interface2_6week.Camera;

class Icon{
    interface Touchable { //중첩 인터페이스 (클래스 in 클래스)
        void touch();
    }
}

public class Tablet_Demo implements Icon.Touchable, Camera {
    @Override
    public void touch() {
        System.out.println("태블릿 아이콘 터치!");
    }

    @Override
    public void takePicture() {
        System.out.println("태블릿 사진촬영!");
    }

    @Override
    public void recordVideo() {
        System.out.println("태블릿 동영상촬영!");
    }

    public static void main(String[] args) {
        Tablet_Demo app = new Tablet_Demo();
        app.touch();
        app.recordVideo();
    }
}
