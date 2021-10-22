package interface4_3week;

public class MemberDemo {
    class Puppy extends Dog{
        @Override
        public void move() {
            System.out.println("강아지가 뛴다~");
        }

        public void sound(){
            System.out.println("멍 멍");
        }
    }

    Puppy p1 = new Puppy();
    Puppy p2 = new Puppy();

    public static void main(String[] args) {
        MemberDemo m1 = new MemberDemo();
        m1.p1.move();
        m1.p2.sound();
    }
}
