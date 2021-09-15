import java.util.Scanner;
/*
//(ver0.1)
public class ReviewDemo01 {
    public static void main(String[] args) {
        // 예제1, 소수여부 판정 프로그램
        Scanner sc = new Scanner(System.in); //입력받는 변수 설언 (Scanner class - 키보드 입력)
        int number = sc.nextInt();
        int cnt = 0;

        for (int i=1; i<=number; i++) {
            if(number % i == 0) cnt++;
        }

        if(cnt == 2) System.out.println(number + "은 소수!");
        else System.out.println(number + "은 소수가 아닙니다.");
    }
}
///////////////////////////////////////////////////////////////////////////////

//(ver0.2)
public class ReviewDemo01 {
    public static void main(String[] args) {
        // 예제2, 소수여부 판정 프로그램
        Scanner sc = new Scanner(System.in); //입력받는 변수 설언 (Scanner class - 키보드 입력)
        int number = sc.nextInt();
        int cnt = 0;

        for (int i=2; i<=number; i++) { //반복 감소 (2회)
            if(number % i == 0) cnt++;
        }

        if(cnt == 2) System.out.println(number + "은 소수!"); //카운트가 0이 유지되면 true
        else System.out.println(number + "은 소수가 아닙니다.");
    }
}

///////////////////////////////////////////////////////////////////////////////

//가독성을 높인 코드 (ver0.3)
public class ReviewDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true; // 변수 is, 주로 bool값`

        for(int i=2; i<number; i++) {
            if(number % i == 0) isPrime = false;
        }

        if(isPrime) System.out.println(number + "는 소수");
        else System.out.println(number + "는 소수가 아니다.");
    }
}

///////////////////////////////////////////////////////////////////////////////

//가독성, 효율성 높인 코드 (ver0.4)
public class ReviewDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true; // 변수 is, 주로 bool값`

        for(int i=2; i<number; i++) {
            if(number % i == 0) {
                isPrime = false;
                break;  //불필요한 반복 횟수 감소 (성능 UP)
            }
            System.out.println(i);
        }
        if(isPrime) System.out.println(number + "는 소수");
        else System.out.println(number + "는 소수가 아니다.");
    }
}
*/

//WHILE + 삼항 연산 (ver0.5)
public class ReviewDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true; // 변수 is, 주로 bool값
        int i = 2;

        while(i<number) {
            if(number % i == 0) {
                isPrime = false;
                break;
            }
            //System.out.println(i);
            i++;
        }
        System.out.println(number + (isPrime ? "는 소수" : "는 소수가 아닙니다.")); //삼항 연산자
    }
}



