import java.util.List;

public class House {
    private int number;
    private String addresses;
    Parents parents;

    public House(int number, String addresses, Parents parents) {
        this.number = number;
        this.addresses = addresses;
        this.parents = parents;
    }

    @Override
    public String toString() {
        return "House{" +
                "number=" + number +
                ", addresses='" + addresses + '\'' +
                ", parents=" + parents +
                '}';
    }
}
