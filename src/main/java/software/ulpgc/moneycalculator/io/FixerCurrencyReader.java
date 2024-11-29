package software.ulpgc.moneycalculator.io;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import software.ulpgc.moneycalculator.FixerAPI;

import java.io.IOException;

import static org.jsoup.Connection.Method.GET;

public class FixerCurrencyReader implements CurrencyReader {
    @Override
    public String read() {
        try {
            return read(FixerAPI.getSymbol + FixerAPI.key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String read(String url) throws IOException {
        Connection.Response response = Jsoup.connect(url)
                .ignoreContentType(true)
                .header("accept", "text/*")
                .method(GET)
                .execute();

        return response.body();
    }
}
