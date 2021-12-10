package first;

public class SoldierDemo {
    public static void main(String[] args) {
        Soldier<String, String> s1 = new Soldier<>("장수현","대위");
        Soldier<String, String> s2 = new Soldier<>("김태간","소장");

        Soldier<String, Integer> s3 = new Soldier<>("최태간",4587);

        System.out.println(s2.getGrade() + "~ " +s2.getName());
    }
}
