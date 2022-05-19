package questao4;

//A classe Humano abaixo implementa uma interface chamada CapazDeAssobiar.
//
//public class Humano implements CapazDeAssobiar {        
//    public void assobiar(String assobio){
//        System.out.println(assobio);
//    }        
//}
//
//No entanto, essa interface não foi declarada no programa Java. Declare a interface CapazDeAssobiar para atender o caso de teste abaixo.
//
//Observação:
//
// - declare a interface sem modificador de acesso (ou seja, sem public, private ou protected antes da palavra interface).

public class Main {
    public static void main(String[] args) {
//        Teste 1:
        CapazDeAssobiar geronimo = new Humano();
        geronimo.assobiar("Fiu Fiu!");

//        Teste 2:
//        Humano pedro = new Humano();
//        pedro.assobiar("Fuuuuuu!");

//        Teste 3:
//        CapazDeAssobiar maria = new Humano();
//        maria.assobiar("Fiuiuiuiu!");
    }
}
