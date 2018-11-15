package Teste;

import java.util.List;

public class TesteRemove {
    
    public static void main(String[] args) {
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();

        System.out.println("Removendo Palavras! ");
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");
        
        List<String> palavras = conjunto.pegaTodas();
        
        System.out.println("Antes de Remover ");
        for(String palavra: palavras){
            System.out.println(palavra);
        }
        
        conjunto.remove("Rafael");
        
        palavras = conjunto.pegaTodas();
        
        System.out.println("Depois de Remover ");
        for(String palavra: palavras){
            System.out.println(palavra);
        }
    }
}
