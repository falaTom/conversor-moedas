package org.example; // Isso é muito importante para o Main te encontrar!

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {
    public double buscaTaxa(String moedaBase, String moedaAlvo) {
        // COLOQUE SUA CHAVE DENTRO DAS ASPAS ABAIXO
        String chave = "b224052bf1835bd3adce0419";
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + chave + "/pair/" + moedaBase + "/" + moedaAlvo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            // Aqui usamos o Record para mapear o JSON da API
            var json = new Gson().fromJson(response.body(), MoedaDTO.class);
            return json.conversion_rate();
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter a cotação: " + e.getMessage());
        }
    }
}

// O record deve ficar fora da classe ConsultaMoeda ou em outro arquivo
record MoedaDTO(double conversion_rate) {}