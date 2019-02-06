import addressbook.BuddyInfo;
import org.junit.Before;
import org.junit.Test;
//import org.sqlite.SQLiteConfig;

import javax.persistence.*;

import java.util.List;

import static org.junit.Assert.*;

public class BuddyInfoTest {

    private BuddyInfo buddyInfo;

    private String name = "test";
    private String phonenumber = "5555555";

    @Before
    public void setup() {
        buddyInfo = new BuddyInfo(name, phonenumber);
    }

    @Test
    public void testConstructorValid() {
        assertNotNull("Constructor object should not be null", buddyInfo);
    }

    @Test(expected = NullPointerException.class)
    public void testNullName() {
        buddyInfo = new BuddyInfo(null, phonenumber);
    }

    @Test(expected = NullPointerException.class)
    public void testNullNumber() {
        buddyInfo = new BuddyInfo(name, null);
    }

    @Test
    public void testToString() {
        assertEquals("Should say 'test: 5555555'", "test: 5555555", buddyInfo.toString());
    }

    @Test
    public void persist() {
//        BuddyInfo buddy = new BuddyInfo();
//        buddy.setName("Kshamina");
//        buddy.setPhoneNumber("6135555555");
//
//        // Connect to DB
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");
//        EntityManager em = emf.createEntityManager();
//
//        // New transaction
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        // Persisting buddy object
//        em.persist(buddy);
//        tx.commit();
//
//        // Query buddies in DB
//        Query q = em.createQuery("SELECT b FROM BuddyInfo b");
//
//        @SuppressWarnings("unchecked")
//        List<BuddyInfo> results = q.getResultList();
//
//        System.out.println("List of buddies\n----------------");
//
//        for (BuddyInfo b : results) {
//            System.out.println(b.toString());
//            assertEquals("Kshamina", b.getName());
//        }
//
//        // Closing connection
//        em.close();
//
//        emf.close();
    }
}