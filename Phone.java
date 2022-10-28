package IOBinary;

import java.io.Serializable;

public class Phone implements Serializable{
    private   String id;
    private String name;
    private String color;
    private int cost;

    public Phone() {
    }

    public Phone(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Phone(String id, String name, String color, int cost) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
