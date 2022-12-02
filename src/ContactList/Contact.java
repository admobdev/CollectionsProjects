package ContactList;

public class Contact {
    private String name;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Phone number: " + phoneNumber;
    }
}

