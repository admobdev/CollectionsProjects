package ContactList;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ListController service = new ListService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1 -> Add contact
                    2 -> List of contacts
                    3 -> Delete contact
                    4 -> Search contact
                    5 -> Edit contact""");
            switch (sc.nextInt()) {
                case 1 -> service.addContact();
                case 2 -> service.list();
                case 3 -> service.deleteContact();
                case 4 -> service.searchContact();
                case 5 -> service.edit();
            }
        }
    }
}