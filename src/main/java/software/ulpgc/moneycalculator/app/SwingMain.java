package software.ulpgc.moneycalculator.app;

import software.ulpgc.moneycalculator.io.*;
import software.ulpgc.moneycalculator.model.Currency;

import java.util.List;

public class SwingMain {
    public static void main(String[] args) {
        CurrencyLoader loader = new FixerCurrencyLoader(new FixerCurrencyReader(), new FixerCurrencyDeserializer(), new FixerCurrencyAdapter());
        List<Currency> currencies = loader.load();
        MainFrame frame = new MainFrame(currencies);
        frame.setVisible(true);
    }
}
