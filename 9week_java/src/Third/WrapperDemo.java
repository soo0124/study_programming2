package Third;
//int short long float double char boolean byte
//primitive 자료형 <-> Wrapper Class (boxing & unboxing)
//Wrapper class 사용이유
// 1) 기본타입의 값을 박싱해서 포장객체로 만드는 것 - 클래스처럼 사용하기위함
// 2) 문자열을 기본타입으로 변환할때 많이사용
public class WrapperDemo {
    public static void main(String[] args) {
        //Boxing
        Double d1 = new Double(3.99);
        Double d2 = Double.valueOf("3.99");
        Double d3 = new Double("3.99");

        //Un Boxing
        double v1 = d1.doubleValue();
        double v2 = d2.doubleValue();
        double v3 = d3.doubleValue();

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);


        Integer i1 = 99;    //Auto Boxing
        int int1 = i1;

        System.out.println(int1);

        //String to primitive type
        float f1 = Float.parseFloat("7.1F");
        boolean b1 = Boolean.parseBoolean("false");
        System.out.println(f1);
        System.out.println(b1);

        Integer is1 = 200;
        Integer is2 = 200;

        System.out.println(is1 == is2); //false 단 - byte, short , int 128이하의 수는 캐시에서 꺼내오기에 같게 true로 처리(예외상황)
        System.out.println(is1.intValue() == is2.intValue());
        System.out.println(is1.equals(is2));
    }
}
