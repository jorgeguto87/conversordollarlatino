package modelos;

import com.google.gson.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
        private String moedaConvertida;
        private double valorAConverter;
        private String moedaAConverter;
        private Gson gson = new GsonBuilder().setPrettyPrinting().create();

        public Conversor() {
                // Construtor vazio
        }

        // Getters e Setters (mantenha os que você já tem)

        public String converterMoeda() throws IOException, InterruptedException {
                if (moedaAConverter == null || moedaConvertida == null) {
                        return "Erro: Moeda não selecionada corretamente!";
                }

                String url_str = "https://v6.exchangerate-api.com/v6/4c09df5a2b0c08ee744b7e6b/latest/" + moedaAConverter;

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url_str))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() != 200) {
                        return "Erro na requisição: Código " + response.statusCode();
                }

                String resposta = response.body();
                Moedas minhasMoedas = gson.fromJson(resposta, Moedas.class);

                if (minhasMoedas == null || minhasMoedas.getConversionRates() == null) {
                        return "Erro: Não foi possível obter as taxas de conversão";
                }

                Double taxa = minhasMoedas.getConversionRates().get(moedaConvertida);
                if (taxa == null) {
                        return "Erro: Moeda de destino não encontrada: " + moedaConvertida;
                }

                double conversao = valorAConverter * taxa;

                return String.format("""
            ********************* [RESULTADO] *********************
            Valor original: %.2f %s
            Valor convertido: %.2f %s
            Taxa de câmbio: 1 %s = %.4f %s
            ******************************************************
            """, valorAConverter, moedaAConverter, conversao, moedaConvertida,
                        moedaAConverter, taxa, moedaConvertida);
        }

        // Mantenha seus getters e setters aqui...
        public String getMoedaConvertida() { return moedaConvertida; }
        public void setMoedaConvertida(String moedaConvertida) { this.moedaConvertida = moedaConvertida; }
        public double getValorAConverter() { return valorAConverter; }
        public void setValorAConverter(double valorAConverter) { this.valorAConverter = valorAConverter; }
        public String getMoedaAConverter() { return moedaAConverter; }
        public void setMoedaAConverter(String moedaAConverter) { this.moedaAConverter = moedaAConverter; }
}