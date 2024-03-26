import java.util.Comparator;

public class Minion{
    private String name;
    private Integer age;
    private int eyes;

    public Minion(String name, Integer age,int eyes) {
        this.name = name;
        this.age = age;
        this.eyes = eyes;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Minion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}

