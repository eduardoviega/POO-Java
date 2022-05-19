package questao3;

//Em uma determinada organização há três tipos de funcionários: Professor, Estagiário e Técnico.
//
//Para calcular o salário de cada um deles é necessário seguir as regras abaixo:
//Professor: CH (carga horária) * 60.0
//Estagiário: CH * 12.50
//Técnico: CH * 40.0
//
//Para padronizar o cálculo do salário do funcionário foi definida a interface abaixo:
//
//public interface Funcionario{
//    public double calcularSalario();
//}
//
//Declare as classes Professor, Estagiario e Tecnico para atender o caso de teste abaixo.
//
//Observações:
//Além do atributo CH, os funcionários também têm o atributo nome.
//
//Não declare a interface Funcionario, ela já está disponível no código-fonte da questão.

public class Main {
    public static void main(String args[]){
//      Teste 1:  
        Funcionario funcs[] = {
            new Professor("Prof A", 52),
            new Professor("Prof B", 42),
            new Tecnico("Tec 1", 40),
            new Estagiario("Est 1", 6)
        };

       for (int i=0; i<funcs.length; i++){
          System.out.println(funcs[i].calcularSalario());   	
       }
       
//     Teste 2:  
//        Funcionario funcs[] = {
//            new Professor("Prof A", 58.5),
//            new Tecnico("Tec 1", 160),
//            new Estagiario("Est 1", 80)
//        };
//
//        for (int i=0; i<funcs.length; i++){
//            System.out.println(funcs[i].calcularSalario());
//        }

//     Teste 3:
//        Funcionario funcs[] = {
//            new Professor("Prof A", 1),
//            new Tecnico("Tec 1", 1),
//            new Estagiario("Est 1", 1)
//        };
//
//        for (int i=0; i<funcs.length; i++){
//            System.out.println(funcs[i].calcularSalario());
//        }
    }
}
