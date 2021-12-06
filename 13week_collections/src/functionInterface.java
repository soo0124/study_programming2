import java.util.Locale;
import java.util.function.*;

public class functionInterface {
    public static void main(String[] args) {
        ToDoubleBiFunction<String, Integer> f2 = (pi, radius) -> Double.parseDouble(pi) * radius * radius; //2개 입력
        double area = f2.applyAsDouble("3.141592",10);
        System.out.println(area);

        Function<Integer, Integer> f1 = n -> n+8; //1개입력 (앞은 입력, 뒤는 출력)
        System.out.println(f1.apply(7));

        BiConsumer<Integer, Integer> c2 = (x, y) -> System.out.println(x + y); //2개입력
        c2.accept(7,9);

        Consumer<String> c1 = n -> System.out.println(n.toUpperCase());
        c1.accept("hello Java");

        Supplier<Double> s1 = () -> 2.71;
        System.out.println(s1.get());

        IntSupplier s2 = () -> (int)(Math.random() * 6) + 1;
        System.out.println(s2.getAsInt());

        Predicate<String> p = Predicate.isEqual("Test");
        System.out.println(p.test("test"));
        System.out.println(p.test("Test"));

        IntPredicate odd = x -> x % 2 == 1;
        System.out.println(odd.test(11) ? "홀수" : "짝수");
    }
}
