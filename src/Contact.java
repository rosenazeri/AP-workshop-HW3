public class Contact {
    private String group;
    private String email;
    private String firstName;
    private String lastName;
    private PhoneNum phoneNumber;
    private Address address;

    public Contact(String group, String email, String firstName, String lastName, String code, String number, String zip, String country, String city) {
        this.group = group;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = new PhoneNum(code, number);
        this.address = new Address(zip, country, city);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PhoneNum getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNum phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}