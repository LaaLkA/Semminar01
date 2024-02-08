package main;

public class Owner {
    String name;
    String sex;

    public Owner(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String toString() {
        return String.format("Name of owner: %s", name);
    }

    public String getOwner() {
        return name;
    }
}
