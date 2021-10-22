package MyMath;

public class Prime {
    public static boolean primecheck(int num)
    {
        if(num == 1) return false;

        for (int i=2; i<num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
