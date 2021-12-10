package first;

import generic.Cup;

public class GeneticClassDemo2 {
    public static void main(String[] args) {
        //Cup<Beer> c = new Cup<Beer>(); 8번줄이랑 같음
        Cup<Beer> c = new Cup<>();
        Cup<Boricha> d = new Cup<>();

        c.setBeverage(new Beer());
        //c.setBeverage(new Boricha()); //Beer타입에 Boricha 못담음
        Beer b1 = c.getBeverage(); //casting 필요 없어짐 generic 쓰면

        d.setBeverage(new Boricha());
        Boricha b2 = d.getBeverage();
    }
}
