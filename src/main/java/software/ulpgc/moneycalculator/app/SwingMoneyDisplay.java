package software.ulpgc.moneycalculator.app;

import software.ulpgc.moneycalculator.model.Money;
import software.ulpgc.moneycalculator.view.MoneyDisplay;

import javax.swing.*;
import java.awt.*;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay {
    private final JLabel moneyLabel;

    public SwingMoneyDisplay() {
        this.add(moneyLabel = createLabel());
        this.setBackground(Color.DARK_GRAY);
    }

    private JLabel createLabel() {
        JLabel label = new JLabel();
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        label.setForeground(Color.WHITE);
        return label;
    }

    @Override
    public void display(Money money) {
        moneyLabel.setText(money.toString());
    }
}
