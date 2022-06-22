package Questao1;

public class Gerente extends Funcionario{
    private String departamento;
    
    public Gerente(){
        super();
    }
    
    public Gerente(String nome, String endereco, double salario, String departamento){
        setNome(nome);
        setEndereco(endereco);
        setSalario(salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
