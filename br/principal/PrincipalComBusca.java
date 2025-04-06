package br.principal;

import br.com.alura.java_orientacao_a_objeto.modelo.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner  scan = new Scanner(System.in);
        System.out.println("O que vc deseja assistir: ");
        String busca = scan.nextLine();

        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=2b316357";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json + "\n\n");

        Gson gson = new Gson();

        Titulo title = gson.fromJson(json, Titulo.class);
        System.out.println(title);
    }
}