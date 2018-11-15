package Teste;

import java.util.List;

public class teste {

    public static void main(String[] args) {
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();

        System.out.println("Adicionando Palavras! ");
        /*  conjunto.adiciona("palavra");
       conjunto.adiciona("computador");
       conjunto.adiciona("apostila");
       conjunto.adiciona("instrutor");
       conjunto.adiciona("mesa");
       conjunto.adiciona("telefone"); */
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");
        
        List<String> palavras = conjunto.pegaTodas();
        for(String palavra : palavras){
            System.out.println(palavra);
        }

      //  conjunto.remove("apostila");
      

        /*   if(!conjunto.contem("apostila")){
           System.out.println("Erro: não tem a seguinte palavra: apostila! ");
       }
       
       if(conjunto.contem("apostila")){
           System.out.println("Erro: não tem a seguinte palavra: apostila! ");
       }
       
       if(conjunto.tamanho() != 5){
           System.out.println("Erro: o tamanho do conjunto deveria ser 5! ");
       } */
    }
}
