package estudos.collections.List.ordenacao.objetos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class OrdenacaoObjeto {
    public static void main(String[] args) {
        
        // variaveis
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> lista = new ArrayList<>();

        // adicionar objetos
        System.out.println("Digite nome e idade para adicionar (ou sair para terminar)");
        while(true){
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")){
                break;
            }
            String[] partes = entrada.split(" ");
            String nome = partes[0];
            int idade = Integer.parseInt(partes[1]);
            lista.add(new Pessoa(nome, idade));


        }

        // Ordenar a lista por idade
        lista.sort(Comparator.comparingInt(Pessoa::getIdade));

        // mostrar lista ordenada
        System.out.print("Lista ordenada: " + lista);

    }
}
