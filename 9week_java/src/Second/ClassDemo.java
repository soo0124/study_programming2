package Second;

class Garbage{
    public int id;

    public Garbage(int id) {
        this.id = id;
        System.out.println(id + "생성");
    }

    protected void finalize(){
        System.out.println(id + "소멸");
    }
}

public class ClassDemo {
    public static void main(String[] args) {
//        long begin = System.nanoTime();
//        int sum = 0;
//        for(int k=1; k<10000000; k++) {
//            sum = sum + k;
//        }
//        long end = System.nanoTime(); //성능 테스트할떄 주로 사용
//        System.out.println(end);
//        System.out.println(begin);
//        System.out.println(end - begin);

        for (int k=0; k<5; k++) {
            new Garbage(k);
        }

        System.gc(); //소멸순서는 무작위

    }
}
