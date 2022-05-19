package questao3;

public class Estagiario implements Funcionario {
    private double CH;
    private String nome;

    public Estagiario(String nome, double CH) {
        this.nome = nome;
        this.CH = CH;
    }
    
    @Override
    public double calcularSalario(){
        return CH * 12.5;
    }
}