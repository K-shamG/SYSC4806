package addressbook;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {
    @Id
    @GeneratedValue
    private Long id;
    private List<BuddyInfo> buddies;

    public AddressBook() {

        this.buddies = new ArrayList<BuddyInfo>();
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addBuddy(BuddyInfo buddy) {
        if(buddies != null){
            buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int i) {
        if(i >= 0 && i < this.buddies.size()) {
            return buddies.remove(i);
        }
        return null;
    }

    public int size() {
        return buddies.size();
    }

    public void clear() {
        buddies.clear();
    }

    @Override
    public String toString() {
        String buddyList = "My Address Book \n";
        for (int i = 0; i < buddies.size(); i++) {
            buddyList += buddies.get(i).toString() + "\n";
        }
        return buddyList;
    }

//    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
//    public List<BuddyInfo> getBuddies() {
//        return buddies;
//    }

    public void setBuddies(List<BuddyInfo> buddies) {
        this.buddies = buddies;
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        BuddyInfo buddy1 = new BuddyInfo("Kshamina", "6133333333");
        BuddyInfo buddy2 = new BuddyInfo("Kshamina2", "6134444444");
        book.addBuddy(buddy1);
        book.addBuddy(buddy2);

        System.out.print(book.toString());
    }

}
