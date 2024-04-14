import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            if (input.equals("show")) {
                phoneBook.printContacts();
            } else {
                String[] command = input.split("-");
                String[] info = command[1].split(" ");
                if (command[0].equals("contacts ") && info[0].equals("a")) {
                    System.out.println("please enter contact's group:");
                    String group = scanner.nextLine();
                    System.out.println("please enter contact's email");
                    String email = scanner.nextLine();
                    System.out.println("please enter contact's country code");
                    String code = scanner.nextLine();
                    System.out.println("please enter contact's phone number");
                    String number = scanner.nextLine();
                    System.out.println("please enter contact's zip code");
                    String zip = scanner.nextLine();
                    System.out.println("please enter contact's country");
                    String country = scanner.nextLine();
                    System.out.println("please enter contact's city");
                    String city = scanner.nextLine();
                    Contact contact1 = new Contact(group, email, info[1], info[2], code, number, zip, country, city);
                    if (phoneBook.addContact(contact1)) {
                        System.out.println("ok");
                    } else {
                        System.out.println("not-allowed");
                    }
                } else if (command[0].equals("contacts ") && info[0].equals("r")) {
                    if (phoneBook.deleteContact(info[1], info[2])) {
                        System.out.println("ok");
                    } else {
                        System.out.println("not-found");
                    }
                } else if (command[0].equals("show ") && info[0].equals("g")) {
                    List<Contact> foundContacts = phoneBook.findContactByGroup(info[1]);
                    if (foundContacts == null) {
                        System.out.println("not-found");
                    } else {
                        for (Contact contact : foundContacts) {
                            System.out.printf("Contact { \ngroup: %s \nemail: %s \nfirstName: %s \nlastName: %s \n  phone number: %s \n address: %s \n}\n", contact.getGroup(), contact.getEmail(), contact.getFirstName(), contact.getLastName(), contact.getPhoneNumber().toString(), contact.getAddress().toString());
                        }
                    }
                } else if (command[0].equals("show ") && info[0].equals("c")) {
                    for (Contact contact : phoneBook.getContactList()) {
                        if (contact.getFirstName().equals(info[1]) && contact.getLastName().equals(info[2])) {
                            System.out.printf("Contact { \ngroup: %s \nemail: %s \nfirstName: %s \nlastName: %s \n phone number: %s \n address: %s \n}\n", contact.getGroup(), contact.getEmail(), contact.getFirstName(), contact.getLastName(), contact.getPhoneNumber().toString(), contact.getAddress().toString());
                            break;
                        }
                    }
                }
            }
        }
    }
}