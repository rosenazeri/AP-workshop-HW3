import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    public static ArrayList<Contact> contactList = new ArrayList<>();
    public static boolean addContact(Contact contact) {
        for (Contact contact2 : contactList) {
            if (contact2.getFirstName().equals(contact.getFirstName()) && contact2.getLastName().equals(contact.getLastName())) {
                return false;
            }
        }
        contactList.add(contact);
        return true;
    }

    public static boolean deleteContact(String firstName, String lastName) {
        for (Contact contact : contactList) {
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                contactList.remove(contact);
                return true;
            }
        }
        return false;
    }

    public String findContact(String firstName, String lastName) {
        for (Contact contact : contactList) {
            if (contact.getFirstName().contains(firstName) && contact.getLastName().contains(lastName)) {
                return contact.getPhoneNumber().toString();
            }
        }
        return null;
    }

    public static List<Contact> findContactByGroup(String group) {
        List<Contact> foundContacts = new ArrayList<>();
        for (Contact contact : contactList) {
            if (contact.getGroup().equals(group)) {
                foundContacts.add(contact);
            }
        }
        return foundContacts.isEmpty() ? null : foundContacts;
    }

    public static void printContacts() {
        if (contactList.isEmpty()){
            System.out.println("empty");
            return;
        }
        for (Contact contact : contactList) {
            System.out.println("[" + contact.getFirstName() + " " + contact.getLastName() +"]");
        }
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }
}
