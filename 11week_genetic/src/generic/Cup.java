package generic;

public class Cup <T>{ //generic class, type이 compile 시점에 검사한다.
    private T beverage;

    public T getBeverage() {
        return beverage;
    }

    public void setBeverage(T beverage) {
        this.beverage = beverage;
    }
}
