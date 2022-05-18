package Questao1;

public class DetalheVeiculos {
    private Veiculo[] veiculo;
    
    public DetalheVeiculos(Veiculo[] v) {
        this.veiculo = v;
    }
    
    public void printVeiculos() {
        for(Veiculo veiculo : this.veiculo) {
            if(veiculo instanceof Moto) {
                System.out.println("Moto: " + ((Moto)veiculo).getPlaca() + " - " + ((Moto)veiculo).getCor() + " - 2");
            } else if(veiculo instanceof Carro) {
                System.out.println("Carro: " + ((Carro)veiculo).getPlaca() + " - " + ((Carro)veiculo).getCor() + " - 4");
            }
        }
    }
}
