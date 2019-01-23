package addressbook.ui.button;

import addressbook.AddressBook;
import addressbook.BuddyInfo;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.List;

public abstract class BuddyTableActionListener implements ActionListener {
    protected JTable table;
    protected List buddies;
    protected AddressBook book;

    public void setBuddies(List buddies) {
        this.buddies = buddies;
    }

    public AddressBook getBook() {
        return book;
    }

    public void setBook(AddressBook ablist) {
        this.book = book;
    }


    public void setTable(JTable buddyTable) {
        this.table = buddyTable;
    }
}
