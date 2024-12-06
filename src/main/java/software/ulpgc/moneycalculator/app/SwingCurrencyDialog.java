package software.ulpgc.moneycalculator.app;

import software.ulpgc.moneycalculator.view.CurrencyDialog;
import software.ulpgc.moneycalculator.model.Currency;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class SwingCurrencyDialog extends JPanel implements CurrencyDialog {
    private final List<Currency> currencies;
    private final JComboBox<Currency> comboCurrency;

    public SwingCurrencyDialog(List<Currency> currencies) {
        this.currencies = currencies;
        this.add(comboCurrency = comboCurrency());
        this.setBackground(Color.DARK_GRAY);
    }

    private JComboBox<Currency> comboCurrency() {
        JComboBox<Currency> comboBox = new JComboBox<>();
        for (Currency currency : currencies) {
            comboBox.addItem(currency);
        }
        return comboBox;
    }

    @Override
    public Currency get() {
        return currencies.get(comboCurrency.getSelectedIndex());
    }
}
