public class Project {

    private String name;
    private String description;
    private double initialCost = 0;

    public String elevatorPitch() {
        return name + " ($" + initialCost + ")" + " : " + description;
    }

    public Project() {
    }

    public Project(String name) {
    }

    public Project(String name, String description) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public void setCost(double cost) {
        this.initialCost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return description;
    }

    public double getCost() {
        return initialCost;
    }
}