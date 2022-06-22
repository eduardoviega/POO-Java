package questao1;

//Implemente uma classe chamada Professor, que herda de Pessoa.

//Além de cumprir com os requisitos impostos pelo relacionamento de herança, 
//a classe Professor deve conter o atributo salario e respectivos métodos get e set.

public class Professor extends Pessoa{
    private String nome;
    private String cpf;
    private String rg;
    private double salario;
    
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }
    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getRg() {
        return rg;
    }
    @Override
    public void setRg(String rg) {
        this.rg = rg;
    }
}