import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class CollectionDemo4 {
    //값을 삽입, 삭제할때는 LinkedList > ArrayList
    //값을 찾거나,검색할때는 LinkedList < ArrayList

    public static void main(String[] args) {
        long s, e;
        ArrayList<Integer>  al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        s = System.nanoTime();

        for (int i=0; i<100000; i++)
        {
            al.add(0,i);
        }
        e = System.nanoTime();
        System.out.println(e-s);

        s = System.nanoTime();
        for (int i=0; i<100000; i++)
        {
            ll.addFirst(i);
        }
        e = System.nanoTime();
        System.out.println(e-s);
    }
}
