package modelos;

import java.util.Map;

public class Moedas {
    String result;
    String base_code;
    Map<String, Double> conversion_rates;

    public Map<String, Double> getConversionRates() {
        return conversion_rates;
    }
}