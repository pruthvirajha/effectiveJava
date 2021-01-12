import java.util.List;

public class Corridor {
    private String name;
    private List<Light> lights;
    private List<AirCooler> airCoolers;

    public Corridor(String name, List<Light> lights, List<AirCooler> airCoolers) {
        this.name = name;
        this.lights = lights;
        this.airCoolers = airCoolers;
    }
}