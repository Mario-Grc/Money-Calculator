package software.ulpgc.moneycalculator.app;

import software.ulpgc.moneycalculator.io.*;
import software.ulpgc.moneycalculator.model.Currency;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CurrencyLoader loader = new FixerCurrencyLoader(new FixerCurrencyReader(), new FixerCurrencyDeserializer(), new FixerCurrencyAdapter());
        List<Currency> currencies = loader.load();
        for (Currency currency : currencies) {
            System.out.println(currency);
        }
    }
}
