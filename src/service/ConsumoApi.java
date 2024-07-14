package service;

import com.google.gson.Gson;
import modelo.Monedas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

    public Monedas buscarMoneda(String monedaBase, String monedaObjetivo) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/03026b7a3edb509e2ddfdee3/pair/" + monedaBase + "/" + monedaObjetivo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);

        } catch (Exception e) {
            throw new RuntimeException("No se encontro la Moneda");
        }

    }
}
