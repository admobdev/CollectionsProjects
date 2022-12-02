package Interface;

import java.util.*;

public class Contact {
    private String name;
    private String sureName;

    public String getName() {return name;}
    public Contact(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
    }

    @Override
    public String toString() {
        return "Name: " + name + " SurName: " + sureName;
    }
}

 interface ListController {
    void addContact();
    void list();
    void deleteContact();
    void searchContact();
    void edit();
}
class Main {
    public static void main(String[] args) {
        ListController service = new ListService();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1 -> add\n2 ->list\n3 ->delete\n4 ->search\n5 ->edit");
            switch (sc.nextInt()){
                case 1 -> service.addContact();
                case 2 -> service.list();
                case 3 -> service.deleteContact();
                case 4 -> service.searchContact();
                case 5 -> service.edit();
            }
        }
    }
}