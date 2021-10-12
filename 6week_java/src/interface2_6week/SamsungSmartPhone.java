package interface2_6week;

public class SamsungSmartPhone extends Phone implements SMS, Camera{
    String OS = "Android";

    public SamsungSmartPhone(String number, String telecom, String OS) {
        super(number, telecom);
        this.OS = OS;
    }
}
