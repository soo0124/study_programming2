package interface_6week;

interface Day{
    //인터페이스 필드들은, 기본적으로 Public Static Final로 동작
    String MON = "월", TUE = "화", WED = "수", THUR = "목", FRI = "금", SAT = "토", SUN = "일";
}

//class Day{ - 매칭이 안됨 static이 없어서
//    String MON = "월", TUE = "화", WED = "수", THUR = "목", FRI = "금", SAT = "토", SUN = "일";
//}

public class DayDemo {
    public static void main(String[] args) {
        //Day.MON = "어떤요일"; //final: 값을 바꿀수없음
        System.out.println(Day.MON); //static으로 접근허용
    }
}
