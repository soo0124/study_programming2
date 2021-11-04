package interface4_3week;

public class Out_Demo2 {
    private String x = "외부";

    void y(){
        int k = 5; //final type (=읽기전용)
        //OutDemo 클래스의 '메소드' 안에 선언된 지역클래스
        class LocalClass{
            String z = "내부";
            String q = x;

            public void r(){
                System.out.println("지역" + k);
                //k = 10; //바꿀수없음
            }
        }

        LocalClass L1 = new LocalClass();
        System.out.println(L1.z);
        L1.r();
    }

    public static void main(String[] args) {
        Out_Demo2 o = new Out_Demo2();
        o.y();
    }
}
