package First;

class Lion {
    String name;

    public Lion(String name) {
        this.name = name;
    }
}

class Tiger {
    String name;

    public Tiger(String name) {
        this.name = name;
    }

    public String toString(){
        return "어흥!";
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        Lion L1 = new Lion("심바");
        Lion L2 = new Lion("엘사");
        Tiger T1 = new Tiger("티거");

        System.out.println(L1);  //default값 : toString();
        System.out.println(L2.toString()); //toString 메소드 출력 (객체생성 메모리주소 = 해쉬코드)
        System.out.println(T1.toString());

        Class Lion = L2.getClass();
        System.out.println(Lion.getName()); //위치정보를 가진 Class 호출
        System.out.println(Lion.getSimpleName()); //이름만 출력
        System.out.println(Lion.getTypeName());
        System.out.println(Lion.getPackage().getName());
    }
}
