package com.company;

import java.util.Scanner;

interface Prime{
    public static boolean isPrime(int num)
    {
        if(num == 1) return false;

        for(int i=2; i<num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}

class Game implements Prime{
    int random(){
        int randomNum = (int)(Math.random()*100);

        return randomNum;
    }

    int roll(){

        int d_number = (int)(Math.random()*6)+1;

        return d_number;
    };

//    int firstGame() {
//
//    };
//    int secondGame() {
//
//    };
//
//    int thirdGame() {
//
//    };
}

class Player {

    final String chamgaja[] = {
            "장수현","고명진","김도현","김범수","김수현",
            "박승민","박태수","신종현","안혜원","이건명",
            "이승재","정의손","정희재","조동휘","최서영",
            "최승규","함동균","허은화","김하늘","김민지",
            "임유빈","이상연","이수진","박경원","김근미",
            "김다예","김동한","김민준","김승구","김정태",
            "김정훈","문철현","방기승","어경태","유진규",
            "이상혁","이세정","이승윤","이주희","임진성",
            "장재은","최현욱","한성욱","함범진","김태간"
    };

    public int roll(){
        int pesron_number = (int)(Math.random()*10);

        return pesron_number;
    };

    int chamga_number = 45; //참가인원
    int victory = 100000000; //총 상금
}

public class jsh12194085 {
    public static void main(String[] args) {
        System.out.println("=============게임시작============");
        Player P = new Player();
        Game G = new Game();

        System.out.println(P.chamgaja);


        System.out.println("주사위 2 ~ 7 게임");
        Scanner input = new Scanner(System.in);

    }
}
