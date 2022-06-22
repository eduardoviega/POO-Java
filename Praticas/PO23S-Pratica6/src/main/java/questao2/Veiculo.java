package Questao2;

public class Veiculo {
    private int renavam;
    private String placa;
    private String cor;

    public Veiculo(int renavam, String placa, String cor){
        this.renavam = renavam;
        this.placa = placa;
        this.cor = cor;
    }
    
    public Veiculo(){
    }
       
    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getRenavam() {
        return renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }
}