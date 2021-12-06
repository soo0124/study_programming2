package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class StringDemoTest {
    public static void main(String[] args) {
        String[] strings = { "Hi", "Hello baby", "Hello soohyun"};

        Arrays.sort(strings); // 알파벳 순서대로 출력

//        Arrays.sort(strings, new Comparator<String>() { //문자열 길이순서로 출력
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        Arrays.sort(strings, (o1, o2) -> o1.length() - o2.length()); //*람다식 적용

        for(String s: strings) System.out.println(s);
    }
}
