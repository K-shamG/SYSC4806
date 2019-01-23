package addressbook;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "addressbook.BuddyInfo")
public class BuddyInfo {
    @Id
    private String name;
    private String phoneNumber;

    private AddressBook book;

    public BuddyInfo() {
        
    }

    public BuddyInfo(String name, String phoneNumber) {
        if(name == null || phoneNumber == null) {
            throw new NullPointerException("Input(s) cannot be done");
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @ManyToOne
    public AddressBook getBook() {
        return book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.phoneNumber;
    }

}
