package Questao2;

public class Carro extends Veiculo{
    private int numeroDePortas;
    private int potenciaMotor;
        
    public Carro(){
        super();
    }
    
    public Carro(int numeroDePortas, int potenciaMotor){
        this.numeroDePortas = numeroDePortas;
        this.potenciaMotor = potenciaMotor;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
    
    public void printInformacoes(){
        System.out.println("Renavam: " + getRenavam() + ", Placa: " + getPlaca() + ", Cor: " + getCor() + ", NumeroDePortas: " + getNumeroDePortas() + ", PotenciaMotor: " + getPotenciaMotor());
    }
}