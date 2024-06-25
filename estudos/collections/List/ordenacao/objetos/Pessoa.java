package estudos.collections.List.ordenacao.objetos;

public class Pessoa {
    
    // variaveis
    private String nome;
    private int idade;

    // construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // getters and setters
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    @Override
    public String toString(){
        return nome + " (" + idade + ")";
    }
}
