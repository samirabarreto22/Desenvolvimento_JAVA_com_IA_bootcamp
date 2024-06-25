package estudos.collections.List.operacoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Inteiro {
    public static void main(String[] args) {
        
        // variaveis
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        // operações basicas de um list

        // adicionar elementos em uma list
        System.out.println("Digite um numero inteiro para adicionar na lista");
        while (true){ // loop infinito ate encontrar a condicao break
            String entrada = scanner.next();
            if (entrada.equalsIgnoreCase("sair")){
                break;
            }
            try {
                int numero = Integer.parseInt(entrada);
                lista.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida");
            }
        }
        // teste add
        System.out.println("pós adicionar" + lista);

        // remover elementos da list (apenas 1 ocorrencia)
        System.out.println("Digite um numero para remover");
        int numRemover = scanner.nextInt();
        lista.remove((Integer) numRemover);

         // teste remover
         System.out.println("pós remover 1 ocorrencia" + lista);

        // remover elementos da list (todas as ocorrencias)
        // obs: iteraçaõ de tras pra frente
        System.out.println("Digite um numero para remover");
        int numRemoverAll = scanner.nextInt();
        for (int i = lista.size() - 1; i >=0; i--){
            if (lista.get(i) == numRemoverAll){
                lista.remove(i);
            }
        }
         // teste remocer todas as ocorrencias
         System.out.println("pós remover todas as ocorrencias" + lista);

        // atualizar elementos na list
        System.out.println("Digite a posição e o novo valor para atualizar");
        int posicao = scanner.nextInt();
        int novoValor = scanner.nextInt();
        if (posicao >= 0 && posicao < lista.size()){
            lista.set(posicao, novoValor);
        }else{
            System.out.println("Posição invalida");
        }

         // teste atualizar
         System.out.println("pós atualizar um valor" + lista);


        // TESTES
        // adicionar


        
        

    }
}

