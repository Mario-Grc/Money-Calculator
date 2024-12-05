package software.ulpgc.moneycalculator.app;

import software.ulpgc.moneycalculator.control.Command;
import software.ulpgc.moneycalculator.model.Currency;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainFrame extends JFrame {
    private final Map<String, Command> commands;
    private final List<Currency> currencies;
    private SwingCurrencyDialog currencyDialog;
    private SwingMoneyDialog moneyDialog;

    public MainFrame(List<Currency> currencies) {
        this.currencies = currencies;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Money Calculator");
        this.setResizable(false);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.commands = new HashMap<>();
        this.add(titlePane());
        this.add(centerPanel());
    }

    private Component centerPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(moneyDialog = new SwingMoneyDialog(new SwingCurrencyDialog(currencies)));
        panel.add(currencyDialog = new SwingCurrencyDialog(currencies));

        return panel;
    }

    private Component titlePane() {
        return new SwingTitlePane();
    }

}
