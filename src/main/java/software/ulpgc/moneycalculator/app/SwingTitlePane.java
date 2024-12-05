package software.ulpgc.moneycalculator.app;

import javax.swing.*;
import java.awt.*;

public class SwingTitlePane extends JPanel {

    public SwingTitlePane() {
        this.setBackground(Color.DARK_GRAY);
        this.add(titleLabel());
    }

    private Component titleLabel() {
        JLabel titleLabel = new JLabel("Money Calculator", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        titleLabel.setForeground(Color.WHITE);
        return titleLabel;
    }
}
