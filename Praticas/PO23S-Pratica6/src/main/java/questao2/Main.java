package Questao2;

//Considere a classe Veiculo abaixo:

//public class Veiculo {
//    private int renavam;
//    private String placa;
//    private String cor;
//
//    métodos get e set foram suprimidos, mas eles existem 
//    na implementação da classe.
//}

//Implemente uma classe chamada Carro que herda e estende a 
//classe Veiculo, com os seguintes métodos:

// - getNumeroDePortas e setNumeroDePortas.
// - getPotenciaMotor e setPotenciaMotor.
// - printInformacoes

public class Main {
    public static void main(String[] args) {
//        Teste 1:
        Carro carro1 = new Carro();
        carro1.setRenavam(123456789);
        carro1.setPlaca("AAA-1234");
        carro1.setCor("Preto");
        carro1.setNumeroDePortas(4);
        carro1.setPotenciaMotor(115);
        carro1.printInformacoes();
        
//----------------------------------------------------------//
        	
//        Teste 2:
//        Carro carro1 = new Carro();
//        carro1.setRenavam(123456789);
//        carro1.setPlaca("AAA-1234");
//        carro1.setCor("Preto");
//        carro1.setNumeroDePortas(4);
//        carro1.setPotenciaMotor(115);
//        Veiculo veiculo = (Veiculo) carro1;
//        carro1 = (Carro) veiculo;
//        carro1.printInformacoes();
    }
}