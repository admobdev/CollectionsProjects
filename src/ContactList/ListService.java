package ContactList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListService implements ListController {
    private List<Contact> contactList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void addContact() {
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Phone number: ");
        String phoneNum = sc.next();
        phoneNum.replaceAll("(...)(..)(...)(..)(..)","+$1($2)$3-$4-$5");
        Contact obj = new Contact(name, phoneNum);
        contactList.add(obj);
    }

    @Override
    public void list() {
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    @Override
    public void deleteContact() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i + 1) + " - > " + contactList.get(i));
        }
        contactList.remove(sc.nextInt() - 1);
    }

    @Override
    public void searchContact() {
        System.out.println("Name: ");
        String name = sc.next();
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().contains(name)) {
                System.out.println(contactList.get(i));
            }
        }
    }

    @Override
    public void edit() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i + 1) + " - > " + contactList.get(i));
        }
        contactList.remove(sc.nextInt() - 1);
        System.out.println("New Contact name: ");
        String name = sc.next();
        System.out.println("New Contact phone number: ");
        String phoneNumber = sc.next();

        contactList.set(sc.nextInt() - 1, new Contact(name, phoneNumber));
    }
}

