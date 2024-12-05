package software.ulpgc.moneycalculator.app;

import software.ulpgc.moneycalculator.model.Money;
import software.ulpgc.moneycalculator.view.MoneyDialog;

import javax.swing.*;
import java.awt.*;

public class SwingMoneyDialog extends JPanel implements MoneyDialog {
    private final JTextField amountField;
    private final SwingCurrencyDialog currencyDialog;

    public SwingMoneyDialog(SwingCurrencyDialog currencyDialog) {
        this.add(this.amountField = amountField());
        this.add(this.currencyDialog = currencyDialog);
        this.setBackground(Color.DARK_GRAY);
    }

    private JTextField amountField() {
        JTextField amountField = new JTextField(10);
        amountField.setFont(new Font("arial", Font.PLAIN, 12));
        return amountField;
    }

    @Override
    public Money get() {
        return new Money(stringToInteger(amountField.getText()), currencyDialog.get());
    }

    private double stringToInteger(String string) {
        return Double.parseDouble(string);
    }
}
