package lambda;

interface Calc { double Calculate(double d); }
interface Gets { char get(String s, int i); }

public class lambdaTest2 {
    public static void main(String[] args) {
        Calc c;
        Gets g;

        //c = d -> Math.abs(d); //람다 방식
        c = Math::abs; //메소드 레퍼런스 방식 static

        System.out.println(c.Calculate(-9.9));

        //g = (a,b) -> a.charAt(b); //람다식
        g = String::charAt;

        System.out.println(g.get("Hello word", 3));
        System.out.println("Hello word".charAt(2)); //위와 같음

    }
}

//람다식
//x -> Integer.parseInt(x)

//method reference
//Integer::parseInt

//정적 메소르를 참조하는 경우
// 클래스이름::정적메소드
//인스터스 메소드를 참조하는 경우
// 객체이름::인스턴스메소드
//생성자 참조하는 경우
// 클래스이름::new
// 배열타입이름::new