package first;

import object.Cup;

public class GeneticClassDemo1 {
    public static void main(String[] args) {
        Cup c = new Cup();

        c.setBeverage(new Boricha());
        Boricha b1 = (Boricha) c.getBeverage();

        c.setBeverage(new Beer());
        Beer b2 = (Beer) c.getBeverage();
    }
}
