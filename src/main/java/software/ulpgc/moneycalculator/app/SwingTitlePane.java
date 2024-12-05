package software.ulpgc.moneycalculator.app;

import javax.swing.*;
import java.awt.*;

public class SwingTitlePane extends JPanel {

    public SwingTitlePane() {
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(titleLabel());
    }

    private Component titleLabel() {
        JLabel titleLabel = new JLabel("Money Calculator");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        return titleLabel;
    }
}
