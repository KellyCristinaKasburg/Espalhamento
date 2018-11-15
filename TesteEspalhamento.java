package Teste;

public class TesteEspalhamento {
    
    public static void main(String[] args) {
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
        
        for (int i = 0; i < 100; i++) {
            conjunto.adiciona(" " + 1);
        }
        
        conjunto.imprimeTabela();
    }
}
