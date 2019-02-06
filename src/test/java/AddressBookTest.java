import addressbook.AddressBook;
import addressbook.BuddyInfo;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.*;
import java.util.List;

import static org.junit.Assert.*;

public class AddressBookTest {
    private AddressBook addressBook;

    private BuddyInfo b1;
    private BuddyInfo b2;
    private BuddyInfo b3;

    private String name = "test";
    private String phonenumber = "5555555";

    @Before
    public void setup() {
        addressBook = new AddressBook();
        b1 = new BuddyInfo(name, phonenumber);
        b2 = new BuddyInfo(name, phonenumber);
        b3 = new BuddyInfo(name, phonenumber);
    }

    @Test
    public void testConstructor() {
        AddressBook a = new AddressBook();
        assertNotNull(a);
    }

    @Test
    public void testAddBuddy() {
        addressBook.addBuddy(b1);
        assertEquals("Size should now be 1", 1, addressBook.size());
    }

    @Test
    public void testAddTwoBuddy() {
        addressBook.addBuddy(b2);
        addressBook.addBuddy(b3);
        assertEquals("Size should now be 2", 2, addressBook.size());
    }

    @Test
    public void testRmBuddy() {
        addressBook.addBuddy(b1);
        addressBook.removeBuddy(0);
        assertEquals("Size should now be 0", 0, addressBook.size());
    }

    @Test
    public void testRmTwoBuddies() {
        addressBook.addBuddy(b1);
        addressBook.addBuddy(b2);
        addressBook.removeBuddy(0);
        addressBook.removeBuddy(1);
        assertEquals("Size should now be 1", 1, addressBook.size());
    }

    @Test
    public void testRmInvalidIndex() {
        assertEquals("Should return null", null, addressBook.removeBuddy(10));
    }

    @Test
    public void testClear(){
        addressBook.clear();
        assertEquals("addressbook.AddressBook should be empty", 0, addressBook.size());
    }

    @Test
    public void persist() {
//        BuddyInfo buddy1 = new BuddyInfo();
//        buddy1.setName("Kshamina1");
//        buddy1.setPhoneNumber("6135555555");
//
//        BuddyInfo buddy2 = new BuddyInfo();
//        buddy2.setName("Kshamina2");
//        buddy2.setPhoneNumber("3333333333");
//
//        AddressBook book = new AddressBook();
//        Long id = new Long(943849032);
//        book.setId(id);
//        book.addBuddy(buddy1);
//        book.addBuddy(buddy2);
//
//        // Connect to DB
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");
//        EntityManager em = emf.createEntityManager();
//
//        // New transaction
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        // Persist buddies in address book
////        for(addressbook.BuddyInfo buddy: book.getBuddies()) {
////            em.persist(buddy);
////        }
//        em.persist(book);
//        tx.commit();
//
//        // Query buddies in DB
//        Query q = em.createQuery("SELECT addrBook from AddressBook addrBook");
//        @SuppressWarnings("unchecked")
//        List<AddressBook> ab = q.getResultList();
//
//        System.out.println("List of buddies\n----------------");
//
//        for (AddressBook b : ab) {
//            List<BuddyInfo> buddies = b.getBuddies();
//            int x = 1;
//            for(BuddyInfo bud : buddies) {
//                System.out.println(bud.getName() + " (phone number=" + bud.getPhoneNumber() + ")");
//                assertEquals("Kshamina" + x, bud.getName());
//                x++;
//            }
//        }
//
//        // Closing connection
//        em.close();
//
//        emf.close();
    }

}