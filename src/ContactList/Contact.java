package ContactList;

public class Contact {
    private String name;
    private String sureName;

    public String getName() {
        return name;
    }

    public Contact(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
    }

    @Override
    public String toString() {
        return "Name: " + name + " SurName: " + sureName;
    }
}

