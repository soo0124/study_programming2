package generic_method_area;

public class generic_method_2 {
    class Prints{
        //generic method
        public static <T extends Number> void printArray(T[] arr){
            for(T a : arr) System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Double[] d1 = { 3.14, 1.88, 8.14};
        String[] s1 = { "hi", "hello"};
        Integer[] i1 = { 10, 9 ,7};
        Character[] c1 = { 'h', 'i'};

        //Prints.printArray(c1); //extend Number
        //Prints.printArray(s1); //extend Number
        Prints.printArray(d1);
        Prints.printArray(i1);
    }
}
