package Teste;

public class TesteGenerico {

    public static void main(String[] args) {
        ConjuntoEspalhamentoGenerico conjunto
                = new ConjuntoEspalhamentoGenerico();

        conjunto.adiciona("Rafael");
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");
        
        System.out.println(conjunto.pegaTodos());
    }
}
