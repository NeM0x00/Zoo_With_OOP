import java.util.Scanner;

public class Animals {

    private String name ;
    private boolean hasTale;
    private String color ;
    private int legs ;

    public Animals(String name, boolean hasTale, String color, int legs) {
        this.name = name;
        this.hasTale = hasTale;
        this.color = color;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getHasTale() {
        return hasTale;
    }

    public void setHasTale(boolean hasTale) {
        this.hasTale = hasTale;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}

