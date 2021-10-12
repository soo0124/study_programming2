package MyMath;

public class Dice {
    public int roll(){

        int d_number = (int)(Math.random()*6)+1;

        return d_number;
    }
}
