package Questao1;

public class main {

    public static void main(String[] args) {
        Veiculo veiculos[] = new Veiculo[4];
        veiculos[0] = new Moto();
        veiculos[1] = new Carro();
        veiculos[2] = new Carro();
        veiculos[3] = new Moto();    

        veiculos[0].setCor("Verde");
        veiculos[0].setPlaca("CCC-5566");

        veiculos[1].setCor("Prata");
        veiculos[1].setPlaca("BBB-2234");

        veiculos[2].setCor("Branco");
        veiculos[2].setPlaca("AAA-1234");

        veiculos[3].setCor("Azul");
        veiculos[3].setPlaca("DDD-9932");

        DetalheVeiculos detalhes = new DetalheVeiculos(veiculos);
        detalhes.printVeiculos();
    }
}
