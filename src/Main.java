import java.util.List;

public class Main {
    public static void main(String[] args) {


        Child child = new Child("Kurmanbek", 13);
        Child child1 = new Child("romeo", 23);
        Child child2 = new Child("juletta", 20);
        Child child3 = new Child("dastan", 10);
        Child[] a = {child, child1, child2, child3};


        Parents parents = new Parents("DASTAN", a.length, List.of(a));
        House house = new House(7, "lelina", parents);

        System.out.println(house);
    }
}