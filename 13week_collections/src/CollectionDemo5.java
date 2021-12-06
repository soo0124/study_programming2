//Map = python의 dictionary

import java.util.HashMap;
import java.util.Map;

public class CollectionDemo5 {
    public static void main(String[] args) {
        Map<String, Integer> mans = Map.of("최일구", 4, "박민석", 2, "차병호",1,"성윤모",1,"김상훈",3);
        System.out.println(mans);
        System.out.println(mans.size());

        for (String index : mans.keySet())
            System.out.println(index + "은 계급이 " + mans.get(index) + "개 입니다.");

        //mans.put("심우진", 7); //error : 추가삭제 불가능
        System.out.println("------------------------------");
        Map<String, Integer> mans2 = new HashMap<>(mans);

        mans2.put("심우진", 7);
        mans2.remove("성윤모");
        //mans2.clear(); //All Elements Delete
        for (String index : mans2.keySet())
            System.out.println(index + "은 계급이 " + mans2.get(index) + "개 입니다.");
    }
}
