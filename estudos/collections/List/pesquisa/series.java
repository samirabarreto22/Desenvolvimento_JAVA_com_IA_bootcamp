package estudos.collections.List.pesquisa;

import java.util.ArrayList;
import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        
        // variaveis
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        
        // adicionar elementos 
        System.out.println("Digite uma serie para add a lista");
        while (true) { 
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")){
                break;
            }
            lista.add(entrada);
        }

        // teste lista
        System.out.println("Lista de series" + lista);

        // Buscar elementos
        System.out.println("digite uma string para buscar");
        String buscar = scanner.nextLine();
        int posicao = lista.indexOf(buscar);

        // mostrar resultado da busca
        if (posicao >= 0){
            System.out.println("Elemento encontrado na posição: " + posicao);

        }else{
            System.out.println("Elemento nao encontrado");
        }

        // procura todas as posicoes que a ocorrencia esta
        System.out.println("Digite uma string para buscar:");
        String buscarAll = scanner.nextLine();
        ArrayList<Integer> posicoesAll = new ArrayList<>();

        // Percorrer a lista e encontrar todas as posições do elemento
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(buscarAll)) {
                posicoesAll.add(i);
            }
        }

        // Mostrar resultado da busca
        if (!posicoesAll.isEmpty()) {
            System.out.println("Elemento encontrado nas posições: " + posicoesAll);
        } else {
            System.out.println("Elemento não encontrado.");
        }


    }
}
