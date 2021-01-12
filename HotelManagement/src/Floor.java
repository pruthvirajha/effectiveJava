import java.util.List;

public class Floor {
    private String name;
    private List<Corridor> mainCorridors;
    private List<Corridor> subCorridors;

    public Floor(String name, List<Corridor> mainCorridors, List<Corridor> subCorridors) {
        this.name = name;
        this.mainCorridors = mainCorridors;
        this.subCorridors = subCorridors;
    }
}
