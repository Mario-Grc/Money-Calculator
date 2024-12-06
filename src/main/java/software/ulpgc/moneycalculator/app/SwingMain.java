package software.ulpgc.moneycalculator.app;

import software.ulpgc.moneycalculator.io.currency.*;
import software.ulpgc.moneycalculator.model.Currency;

import java.util.List;

public class SwingMain {
    public static void main(String[] args) {
        CurrencyLoader loader = new FixerCurrencyLoader(new FixerCurrencyReader(), new FixerCurrencyDeserializer(), new FixerCurrencyAdapter());
        List<Currency> currencies = loader.load();
        MainFrame frame = new MainFrame(currencies);
//        frame.put("Calculate", ) TODO añadir el comando para calcular
        frame.setVisible(true);
    }
}
