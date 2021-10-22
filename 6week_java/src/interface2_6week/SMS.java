package interface2_6week;

public interface SMS {
    //필드, 메서드 등
    void sendMessage(String msg);
    void receiveMessage(String msg);

    static void deleteAll(){  //static 메서드 경우, 중괄호를 갖을수 있음.
        System.out.println("문자 모두 삭제!");
    }

    default void deleteBackup(){
        System.out.println("문자 모두 백업!");
    }
}
