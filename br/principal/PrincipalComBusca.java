package br.principal;

import br.com.alura.java_orientacao_a_objeto.exception.ErroConvertException;
import br.com.alura.java_orientacao_a_objeto.modelo.Titulo;
import br.com.alura.java_orientacao_a_objeto.modelo.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);

        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        String busca = "";
        do {
            System.out.println("O que vc deseja assistir: ");
            busca = scan.nextLine().toLowerCase();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=2b316357";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json + "\n\n");

                //Titulo title = gson.fromJson(json, Titulo.class);
                TituloOmdb dadosOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(dadosOmdb + "\n\n");

                Titulo meuTitulo = new Titulo(dadosOmdb);
                // System.out.println("Object: " + meuTitulo);

                titulos.add(meuTitulo);

            } catch (NumberFormatException erro) {
                System.out.println("Aconteceu um erro: " + erro.getMessage() + "\n");
            } catch (IllegalArgumentException | NullPointerException err) {
                System.out.println("Aconteceu erro de argumento: " + err.getMessage());
            } catch (ErroConvertException error) {
                System.out.println(error.getMensagem());
            }
        } while (!busca.equalsIgnoreCase("Sair"));

        System.out.println(titulos);

        File file = new File("Filme.json");
        file.createNewFile();
        Scanner scanner = new Scanner(file);

        FileWriter escrever = new FileWriter(file);
        escrever.write(gson.toJson(titulos));
        escrever.close();

        if (file.exists()) {
            do {
                String linha = scanner.nextLine();
                System.out.println(linha);
            } while (scanner.hasNextLine());
        }
    }
}
