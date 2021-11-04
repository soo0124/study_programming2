package interface4_3week;

public class AnonymousDemo2 {
    public static void main(String[] args) {
        Dog d = new Dog(){
            @Override
            public void move() {
                System.out.println("강아지가 뛴다 - 어나니머스2");;
            }
        };
        d.move();
    }
}
