package lambda;

//Lambda: (타입 매개변수 ...) -> { 실행문; 실행문; ...} - 구조
interface Positive { int pos(int x); } //함수형 interface
interface Prints { void Print(); }

public class lambdaTest {
    public static void main(String[] args) {
        Positive po;
        Prints pr;

        //변수에 람다식 담기 가능 [다같은 표현]
        po = (int n) -> { return n+1; };
        po = (n) ->  {return n+1;}; //타입 유추 가능 int 삭제
        po = n -> {return  n+1;};
        po = (int n) -> n+1;
        po = n -> n+1;

        pr = () ->  {   //인수가 없는 타입은 ()를 꼭써야함 !
            System.out.println("HI~");
        };

        pr = () -> System.out.println("HI~");
        pr.Print();
    }
}
