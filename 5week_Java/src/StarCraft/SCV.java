package StarCraft;

import jdk.swing.interop.SwingInterOpUtils;

public class SCV {
    // FIELDS, 멤버변수, 속성 [instance variable]
    int hp;
    int attackRate;
    double speed;

    //STATIC Field [class variable]
    public static int population = 1; //인구수

    //Construct 생성자
    public SCV(){
        hp = 60;
        attackRate = 5;
        speed = 2.344;

        System.out.println("SVC GOOD TO GO SIR");
    }

    public SCV(String korean){ //매개변수 생성자
        hp = 60;
        attackRate = 5;
        speed = 2.344;

        System.out.println(korean);
    }

    // Methods
    public void collect(String item) //미네랄 or 가스(매개변수)
    {
        System.out.println(item + "자원을 채취한다.");
    }

    public void build()
    {
        System.out.println( "건물을 짓는다.");
    }

    public void fix()
    {
        System.out.println("수리한다.");
    }

    public void attack()
    {
        System.out.println("공격한다.");
    }
    public void attack(String tribe)
    {
        System.out.println(tribe + "를 공격한다.");
    }

    public void attack(String tribe, String unit)
    {
        System.out.println(tribe + "의" + unit + "를 공격한다.");
    }
}
