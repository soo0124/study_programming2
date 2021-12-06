package lambda;

interface NewSoldier<T> { T getSoldier(T o); }

public class homework {
    public static void main(String[] args) {
        NewSoldier<String> s;

        s = x -> {
            String name = x;
            return name;
        };

        s = String::toString;

        String s1 = s.getSoldier("성윤모");
        System.out.println(s1);
    }
}
