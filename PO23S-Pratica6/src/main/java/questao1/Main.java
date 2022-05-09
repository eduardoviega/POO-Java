package Questao1;

//A lista abaixo apresenta cinco entidades, com seus respectivos atributos e tipos de dados:

// - Gerente(nome:string, endereco:string, salario:double, departamento:string)
// - Funcionario(nome:string, endereco:string, salario:double)
// - Dependente(nome:string, endereco:string, idade:int)
// - Pessoa(nome:string, endereco:string)
// - Cliente(nome:string, endereco:string, limiteCompra:double)

//Identifique os relacionamentos de herança entre as entidades acima e implemente uma classe 
//Java para cada entidade. As classes devem possuir métodos get e set para todos os atributos e 
//construtores para atender o caso de teste abaixo. Observação: esta questão tem outros casos 
//de teste para verificar se os relacionamentos de herança foram corretamente implementados.

public class Main {

    public static void main(String[] args) {
//        Teste 1:
        Pessoa p1 = new Cliente("José", "Rua Centro", 1000.0);
        Pessoa p2 = new Funcionario("Maria", "Rua Principal", 3500.0);
        Pessoa p3 = new Dependente("Pedro", "Rua Principal", 9);
        Pessoa p4 = new Gerente("Carlos", "Rua Alfreda", 12000.0, "Vendas");

        Cliente c = (Cliente) p1;
        Funcionario f = (Funcionario) p2;
        Dependente d = (Dependente) p3;
        Gerente g = (Gerente) p4;

        System.out.println(c.getLimiteCompra());
        System.out.println(f.getSalario());
        System.out.println(d.getIdade());
        System.out.println(g.getDepartamento());

//----------------------------------------------------------------------------//

//        Teste 2:
//        Pessoa p1 = new Cliente("José", "Rua Centro", 1000.0);
//        Pessoa p2 = new Funcionario("Maria", "Rua Principal", 3500.0);
//        Pessoa p3 = new Dependente("Pedro", "Rua Principal", 9);
//        Funcionario p4 = new Gerente("Carlos", "Rua Alfreda", 12000.0, "Vendas");
//
//        Cliente c = (Cliente) p1;
//        Funcionario f = (Funcionario) p2;
//        Dependente d = (Dependente) p3;
//        Gerente g = (Gerente) p4;
//
//        System.out.println(c.getNome());
//        System.out.println(f.getNome());
//        System.out.println(d.getNome());
//        System.out.println(g.getNome());

//----------------------------------------------------------------------------//
//        Teste3:
//        Pessoa p1 = new Cliente("José", "Rua Centro", 1000.0);
//        Pessoa p2 = new Funcionario("Maria", "Rua Principal", 3500.0);
//        Pessoa p3 = new Dependente("Pedro", "Rua Principal", 9);
//        Pessoa p4 = new Gerente("Carlos", "Rua Alfreda", 12000.0, "Vendas");
//
//        Cliente c = (Cliente) p1;
//        Funcionario f = (Funcionario) p2;
//        Dependente d = (Dependente) p3;
//        Gerente g = (Gerente) p4;
//
//        System.out.println(c.getEndereco());
//        System.out.println(f.getEndereco());
//        System.out.println(d.getEndereco());
//        System.out.println(g.getEndereco());
    }
}
