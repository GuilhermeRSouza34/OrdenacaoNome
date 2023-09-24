import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class OrdenarNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        while (true) {
            System.out.println("Digite um nome (ou 'ordenar' para ordenar os nomes): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("ordenar")) {
                Collections.sort(nomes);
                System.out.println("Nomes ordenados em ordem alfabética:");
                for (String nomeOrdenado : nomes) {
                    System.out.println(nomeOrdenado);
                }
                break;
            } else {
                nomes.add(nome);
            }
        }

        scanner.close();
    }
}






