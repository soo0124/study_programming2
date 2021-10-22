package interface4_3week;

public class Local_Demo {
    public static void main(String[] args) {
        class Puppy extends Dog{
            @Override
            public void move() {
                System.out.println("강아지가 뛴다");;
            }
        }

        Dog d = new Puppy();
        d.move();
    }
}
