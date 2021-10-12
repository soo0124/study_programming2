package interface_6week;

public class Day2Demo implements Day{
    public static void main(String[] args) {
        System.out.println(Day.SAT); //같은 패키지라 가능
        System.out.println(SAT); //implements Day 지정으로 인해 SAT만 써도 가능
    }
}
