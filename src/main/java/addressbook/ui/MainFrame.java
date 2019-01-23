package addressbook.ui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    /*
        First method in the application invoked by Spring
     */
    public void init() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(600, 400));

        setVisible(true);
        setState(Frame.NORMAL);
        setVisible(true);
    }
}
