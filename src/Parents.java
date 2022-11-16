import java.util.List;

public class Parents {
    private String name;
    private int age;
    private List<Child> parents;

    public Parents(String name, int age, List<Child> parents) {
        this.name = name;
        this.age = age;
        this.parents = parents;
    }

    @Override
    public String toString() {
        return "Parents{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", parents=" + parents +
                '}';
    }
}


