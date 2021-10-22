package MyMath;

import java.util.PropertyResourceBundle;

public class TestMath {
    public static void main(String[] args) {
        Dice d = new Dice();
        int number = d.roll();
        boolean isPrime = Prime.primecheck(number);

        System.out.println("주사위 : " + number);
        System.out.println(isPrime? "소수 O" : "소수 X" );
        //System.out.println(primeNumber? "소수 O" : "소수 X" );
        //System.out.println(Math.random());
    }
}
