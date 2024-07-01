package finalexam.task4;

public class Farmer {
    private String name;
    private String farmName;

    public Farmer(String name, String farmName) {
        this.name = name;
        this.farmName = farmName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    @Override
    public String toString() {
        return "Farmer [name=" + name + ", farmName=" + farmName + "]";
    }
}

