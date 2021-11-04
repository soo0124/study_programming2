package interface4_3week;

public class AnonymousDemo1 {
    Dog d = new Dog(){ //무명클래스 - 1회용
        @Override
        public void move() {
            System.out.println("강아지가 뛴다~");
        }

        public void sound(){
            System.out.println("멍 멍");
        }
    };

    public static void main(String[] args) {
        AnonymousDemo1 A1 = new AnonymousDemo1();
        A1.d.move();
        //A1.d.sound();
    }
}
