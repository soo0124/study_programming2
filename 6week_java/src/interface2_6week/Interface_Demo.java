package interface2_6week;
/*
추상클래스와 비슷한점
: 인터페이스는 추상클래스처럼 객체 생성이 불가
: 추상클래스처럼 인터페이스도 필드, 추상 메서드를 갖을 수 있음

추상클래스와 다른점
: 추상클래스와 다르게 일반(구현)메서드, 생성자를 가질수 없다.
: 예외적으로 default 메서드, static 메소드는 구현 메서드를 가질수 있다.
: extends 대신 implements 키워드 사용 해서 인터페이스 구현

인터페이스 사용이유
: 다형성 지원위해 사용,
: 다중상속을 지원 X, 다중상속 비슷하게 구현하는 경우에 인터페이스 사용.
 */

public class Interface_Demo {
    public static void main(String[] args) {
        SamsungSmartPhone galaxyUltra = new SamsungSmartPhone("010 8330 2328","SKT","Android");
        AppleSmartPhone IPhone13 = new AppleSmartPhone("010 1111 2222", "KT");
        SamsungSmartPhone galaxyA10 = new SamsungSmartPhone("010 1234 5678","LG","타이젠");

        IPhone13.sendMessage("안녕 나는 아이폰 샀어");
        IPhone13.receiveMessage("뭐샀냐 프로?");

        galaxyUltra.takePicture();
        System.out.println(galaxyA10.OS);
        galaxyA10.receiveMessage("오늘 볼수 있어?");

        SMS.deleteAll();
        IPhone13.deleteBackup();
    }
}
