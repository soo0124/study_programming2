package Third;

import java.util.Random;

public class UtillDemo {
    public static void main(String[] args) {
        //System.out.println((int)(Math.random()*6)+ 1);
        Random r = new Random();
        System.out.println(r.nextInt(6)+1);   //0~6사이 값 출력
    }
}
