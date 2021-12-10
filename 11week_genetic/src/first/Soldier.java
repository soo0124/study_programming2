package first;

public class Soldier <K, V>{
    private K name;
    private V grade;

    public Soldier(K name, V grade) {
        this.name = name;
        this.grade = grade;
    }

    public K getName() {
        return name;
    }

    public V getGrade() {
        return grade;
    }
}
