import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>(); //LILO

        s1.push(5);
        s1.push(1);
        s1.push(3);

        System.out.println(s1.pop()); //삭제하고 꺼내기
        System.out.println(s1.peek()); //유지상태에서 꺼내기

        for (Integer i : s1) System.out.println(i);



//        List<String> soldier = List.of("차병호", "성윤모", "강찬석");
//        System.out.println(soldier.contains("차병호"));
//        System.out.println(soldier.contains("최일국"));
//        System.out.println(soldier.indexOf("성윤모"));
//
//        List<String> s1 = new ArrayList<>(soldier); // List: 부모, ArrayList: 자식
//        s1.add("김민석");
//        s1.add("김상훈");
//
//        List<String> s2 = new ArrayList<>(soldier);
//        s2.remove("성윤모");
//        s2.add("지호진");
//
//        System.out.println(s1.containsAll(s2)); //output -> true "성윤모"는 없지만 "차병호"는 있기에
//
//        s1.removeIf(r -> r.endsWith("석"));
//        s1.replaceAll(x -> "신병:" + x);
//        s1.forEach(s-> System.out.print(s + " "));

    }
}
