package Questao1;

public class Funcionario extends Pessoa{
    private double salario;
    
    public Funcionario(){
        super();
    }
    
    public Funcionario(String nome, String endereco, double salario){
        setNome(nome);
        setEndereco(endereco);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}