import java.util.Arrays;
import java.util.List;

public class CollectionDemo2 {
    public static void main(String[] args) {
        String[] soldiers =  {"박민석1", "차병호3" , "김상훈2", "최일구4"};

        List<String> soldiers2 = Arrays.asList(soldiers); //배열 -> list 변환

        soldiers2.set(1,"장수현");
        //soldiers2.add("지호진"); //추가 X, 배열을 리스트로 변경했으므로, 크기를 변경 할 수 X (Exception)

        for(String s : soldiers2) System.out.print(s + " ");
        System.out.println();

        soldiers2.sort((s1, s2) -> s1.length() - s2.length());

        for(String s : soldiers2) System.out.print(s + " ");
        System.out.println();

        String[] soldiers3 = soldiers2.toArray(new String[0]);//List -> 배열
        for (int i=0; i < soldiers3.length; i++)
        {
            System.out.print(soldiers3[i] + " " + "xxxx");
        }
        System.out.println();

        List<String> grades = List.of("이병","일병","상병","준위"); //of 메서드 : 변하면 X

        grades.forEach(g -> System.out.print(g + " "));
    }
}
