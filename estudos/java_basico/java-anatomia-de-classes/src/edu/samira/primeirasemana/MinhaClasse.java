package edu.samira.primeirasemana;
public class MinhaClasse {
    
    public static void main(String[] args) {
        System.out.println("Hello World");

        String primeiroNome = "Samira";
        String segundoNome = "Barreto";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
