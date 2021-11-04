package interface2_6week;

public class SamsungSmartPhone extends Phone implements SMS, Camera{
    String OS = "Android";

    public SamsungSmartPhone(String number, String telecom, String OS) {
        super(number, telecom);
        this.OS = OS;
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS : " + msg + " 전송");
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("수신 SMS : " + msg );
    }

    @Override
    public void takePicture() {
        System.out.println("찰칵 - 삼성");
    }

    @Override
    public void recordVideo() {
        System.out.println("영상 촬영 - 삼성");
    }
}
