package interface2_6week;

public class AppleSmartPhone extends Phone implements SMS, Camera{
    String OS = "IOS";

    public AppleSmartPhone(String number, String telecom) {
        super(number, telecom);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("ios message send : " + msg);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("ios receive send : " + msg);
    }

    @Override
    public void takePicture() {
        System.out.println("찰칵");
    }

    @Override
    public void recordVideo() {
        System.out.println("녹화 시작!");
    }
}
