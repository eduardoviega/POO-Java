package questao3;

public class Professor implements Funcionario{
    private double CH;
    private String nome;

    public Professor(String nome, double CH) {
        this.nome = nome;
        this.CH = CH;
    }
    
    @Override
    public double calcularSalario(){
        return CH * 60;
    }
}