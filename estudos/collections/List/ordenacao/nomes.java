package estudos.collections.List.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class nomes {
    public static void main(String[] args) {
        // variaveis
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        // adicionar elementos
        System.out.println("Digite os nomes que quer add a lista");
        while (true) { 
            String entrada = scanner.nextLine();
            if(entrada.equalsIgnoreCase("sair")){
                break;
            }
            lista.add(entrada);
            
        }

        // teste lista nao ordenada
        System.out.println("Lista não ordenada: " + lista);

        // ordenar a lista
        Collections.sort(lista);

        // teste lista ordenada
        System.out.println("Lista Ordenada: " + lista);


    }
}
