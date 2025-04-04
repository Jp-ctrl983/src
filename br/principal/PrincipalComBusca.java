package br.principal;

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

        System.out.println(response.body() + "\n\n");

        System.out.println("Se der erro verifique se vc não digitou nada de errado");

    }
}