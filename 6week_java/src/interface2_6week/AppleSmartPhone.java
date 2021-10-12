package interface2_6week;

public class AppleSmartPhone extends Phone implements SMS, Camera{
    String OS = "IOS";

    public AppleSmartPhone(String number, String telecom) {
        super(number, telecom);
    }
}
