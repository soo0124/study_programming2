package interface3_3week;

//중첩클래스: 1) 멤버클래스, 2)지역클래스

public class Out_Demo {

    private String s1 = "비밀";
    public String s2 = "외부";

    class InClass{ //멤버클래스 (데모클래스 입장에서)
        String s2 = "내부";

        public void test1() {
            System.out.println(s2); //내부
            System.out.println(s1); //비밀
            System.out.println(Out_Demo.this.s2); //외부
        }
    }

    public static void main(String[] args) {
        Out_Demo o = new Out_Demo();
        Out_Demo.InClass oi = o.new InClass();

        System.out.println(oi.s2);
        oi.test1();
    }
}
