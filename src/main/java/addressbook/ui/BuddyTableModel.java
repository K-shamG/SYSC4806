package addressbook.ui;

import addressbook.AddressBook;
import addressbook.BuddyInfo;

import java.util.List;
import javax.swing.table.AbstractTableModel;


public class BuddyTableModel extends AbstractTableModel {
    List buddies;
    AddressBook book;

    public BuddyTableModel() {
        book = new AddressBook();
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public int getColumnCount() {
        return 1;
    }

    public String getColumnName(int column) {
        if(column == 0) return "Name";
        else return "Phone Number";
    }

    public int getRowCount() {
        return buddies.size();
    }

    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        buddies.set(rowIndex, value);
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return buddies.get(rowIndex);
    }

    public List getBuddies() {
        return buddies;
    }

    public void setBuddies(List buddies) {
        this.buddies = buddies;
    }

}
