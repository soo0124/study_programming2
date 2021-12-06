package generic_method_area;

public class generic_method {
    class Prints{
        //generic method
        public static <T> void printArray(T[] arr){
            for(T a : arr) System.out.println(a);
        }

        public static <T> T getFirst(T[] arr) { //return 타입에 타입을 줄수있다.
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Double[] d1 = { 3.14, 1.88, 8.14};
        String[] s1 = { "hi", "hello"};
        Integer[] i1 = { 10, 9 ,7};

        Prints.printArray(s1);
        Prints.printArray(d1);
        Prints.printArray(i1);
        Character[] c1 = { 'h', 'i'};

        System.out.println(Prints.getFirst(c1));

    }
}
