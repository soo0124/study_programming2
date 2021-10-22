package StarCraft;

import jdk.swing.interop.SwingInterOpUtils;

public class Vulture {
    // FIELDS, 멤버변수, 속성
    int hp;
    int attackRate;
    double speed;

    public static int population = 2; //인구수

    //Construct 생성자
    public Vulture(int hp, int attackRate, double speed){
        this.hp = hp;
        this.attackRate = attackRate;
        this.speed = speed;
    }

    public Vulture(){
        //중복코드를 위해 다른 생성자 호출
        this(80,20,3.126);

        System.out.println("Alight! bring it on");
    }
    public Vulture(String korean){
        this(80,20,3.126);  //무조건 첫째줄
//        hp = 80;
//        attackRate = 20;
//        speed = 3.126;

        System.out.println(korean);
    }

    public Vulture(double speed){
        this(80,20,speed);
//        hp = 80;
//        attackRate = 20;
//        this.speed = speed; //this 는 실행시점 객체를 의미
    }

    // Methods
    public void attack()
    {
        System.out.println("묵사발을 만들어주마!");
    }
}
