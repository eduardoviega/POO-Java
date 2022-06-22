package questao1;

//Crie uma classe chamada MinhaClasse que implementa a interface MinhaInterface.
//Observe o caso de teste abaixo (entradas e saídas) e forneça implementação para todos os métodos da interface.

public class Main {
    public static void main(String args[]){
//        Teste 1:
        String minhaFrase = "";
        MinhaInterface myInterface = new MinhaClasse();
        myInterface.setFrase(minhaFrase);
        myInterface.concatenar("Aluno de Programação");
        myInterface.concatenar(" Java");
        int tam = myInterface.tamanho();
        System.out.printf("Frase: %s, Tam: %d", myInterface.getFrase(), myInterface.tamanho());

//        Teste 2:
//        String minhaFrase = "Aluno";
//        MinhaInterface myInterface = new MinhaClasse();
//        myInterface.setFrase(minhaFrase);
//        myInterface.concatenar(" de Programação OO");
//        int tam = myInterface.tamanho();
//        System.out.printf("Frase: %s, Tam: %d", myInterface.getFrase(), myInterface.tamanho());
    }
}
