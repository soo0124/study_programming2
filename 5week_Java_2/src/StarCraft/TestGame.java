package StarCraft;

public class TestGame {
    public static void main(String[] args){
        SCV s1 = new SCV();
        SCV s2 = new SCV();
        SCV s3 = new SCV("건설로봇 준비완료");
        Vulture v1 = new Vulture();
        Vulture v2 = new Vulture("좋아 다덤벼");
        Vulture v3 = new Vulture(4.688);

        System.out.println("벌쳐1기당 차지하는 인구수 :" + Vulture.population); //Static
        System.out.println("SCV1기당 차지하는 인구수 :" + SCV.population);

        System.out.println(v3.speed);
        System.out.println(v1.speed);

        s1.collect("미네랄");
        System.out.println("체력:" + s1.hp);

        s2.attack();
        s2.attack("저그");
        s2.attack("저그", "프로브"); //오버라이딩 매개변수(개수, 타입)에 따라 동작되는 함수가 다름
    }
}
