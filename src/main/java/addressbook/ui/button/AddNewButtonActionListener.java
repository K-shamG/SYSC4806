package addressbook.ui.button;

import addressbook.BuddyInfo;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddNewButtonActionListener extends BuddyTableActionListener {
    public void actionPerformed(ActionEvent e) {
//        names.add("New Item");
//        numbers.add("New Number");
        JTextField name = new JTextField(5);
        JTextField number = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Name: "));
        myPanel.add(name);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Number: "));
        myPanel.add(number);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter Name and Number Values", JOptionPane.OK_CANCEL_OPTION);

        if(result == 0) {
            BuddyInfo b = new BuddyInfo(name.getText(), number.getText());
            buddies.add(b);
        }

        table.revalidate();
    }
}
