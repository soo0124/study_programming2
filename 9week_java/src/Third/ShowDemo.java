package Third;
//9주차 과제, 12194085 장수현
public class ShowDemo {
    public static void main(String[] args) {
        showclass test = new showclass();

        show(new String("1"));
        show (new StringBuilder("inha"));
        show(new StringBuffer("동네 한바퀴"));

        test.Show(new String("객체를 통한 문자열출력"));
    }

    public static void show(Object word) {
        System.out.println(word);
    }
}

class showclass{
    public void Show(Object word) {
        System.out.println(word);
    }
}
