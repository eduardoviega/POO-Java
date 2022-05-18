package questao3;

public class Tecnico implements Funcionario{
    private double CH;
    private String nome;

    public Tecnico(String nome, double CH) {
        this.nome = nome;
        this.CH = CH;
    }

    @Override
    public double calcularSalario(){
        return CH * 40;
    }
}