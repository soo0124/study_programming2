import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Double> List = Arrays.asList(2.17, 3.14, 0.99);

        Iterator<Double> it = List.iterator(); //반복자 리턴
        while (it.hasNext()) {                 //꺼냄
            System.out.print(it.next() + " ");
        }
        System.out.println();

        for(Double D : List) System.out.println(D + ""); //foreach 방식
        System.out.println();
    }
}
