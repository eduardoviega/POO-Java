package Questao1;

public class Cliente extends Pessoa{
    private double limiteCompra;
    
    public Cliente(){
        super();
    }
    
    public Cliente(String nome, String endereco, double limite){
        setNome(nome);
        setEndereco(endereco);
        this.limiteCompra = limite;
    }

    public double getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
    }
}
