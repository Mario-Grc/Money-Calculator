package software.ulpgc.moneycalculator.io;

import software.ulpgc.moneycalculator.model.Currency;

public interface CurrencyDeserializer {
    Object deserialize(String read);
}
