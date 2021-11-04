package Second;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.random()); // 0.1~0.9999
        System.out.println(Math.log10(100)); //return type: double
        System.out.println(Math.pow(2, 10)); //pow: 거듭제곱
        System.out.println(Math.max(13, 2)); //큰수가 return
        System.out.println(Math.PI);
        System.out.println(Math.E);

        String S = new String("HELLO"); //읽기전용에 적합
        System.out.println(S);
        System.out.println(S.hashCode());
        S = S + "~";
        System.out.println(S);
        System.out.println(S.hashCode());

        StringBuilder sb = new StringBuilder("HELLO");  //같은객체사용 - 변화하는 값일경우 적합 (오버헤드 발생 X)
        System.out.println(sb);
        System.out.println(sb.hashCode());
        sb.append("~");
        System.out.println(sb);
        System.out.println(sb.hashCode());
    }
}
