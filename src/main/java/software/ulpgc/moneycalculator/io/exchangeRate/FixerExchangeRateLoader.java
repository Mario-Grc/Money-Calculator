package software.ulpgc.moneycalculator.io.exchangeRate;

import software.ulpgc.moneycalculator.model.Currency;
import software.ulpgc.moneycalculator.model.ExchangeRate;
import software.ulpgc.moneycalculator.pojos.ExchangeRatesGetResponse;

import java.util.Map;

public class FixerExchangeRateLoader implements ExchangeRateLoader {
    private final ExchangeRateReader reader;
    private final ExchangeRateDeserializer deserializer;

    private static final String BASE_CURRENCY = "EUR";

    public FixerExchangeRateLoader(ExchangeRateReader reader, ExchangeRateDeserializer deserializer) {
        this.reader = reader;
        this.deserializer = deserializer;
    }

    @Override
    public ExchangeRate load(Currency from, Currency to) {
        Map<String, Double> rates = ((ExchangeRatesGetResponse) deserializer.deserialize(reader.read())).rates();

        if (from.code().equals(BASE_CURRENCY)) {
            return new ExchangeRate(from, to, rates.get(to.code()));
        } else if (to.code().equals(BASE_CURRENCY)) {
            return new ExchangeRate(from, to, 1 / rates.get(from.code()));
        } else {
            return new ExchangeRate(from, to, calculateRate(from, to, rates));
        }
    }

    private static double calculateRate(Currency from, Currency to, Map<String, Double> rates) {
        double rateFromToBase = 1 / rates.get(from.code());
        double rateBaseToTarget = rates.get(to.code());
        return rateFromToBase * rateBaseToTarget;
    }
}
