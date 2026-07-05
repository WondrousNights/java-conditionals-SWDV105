package models;

public class Employee {

    public int id;
    public String name;
    public String title;
    public boolean active;

    public Employee(int id, String name, String title, boolean active) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.active = active;
    }
}