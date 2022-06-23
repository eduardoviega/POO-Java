package utfpr.banco;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<ContaBancaria> contas;
    
    public Banco(String nome){
        this.nome = nome;
        this.contas = new ArrayList<>();
    }
    
    public void adicionar(ContaBancaria novaConta){
        if (novaConta.getNumero() == 0){
            System.out.println("Erro: conta tem que ter um número!");
        } else {
            this.contas.add(novaConta);
        }
    }
    
    public ContaBancaria getConta(int numero){
        for (ContaBancaria conta : contas){
            if (conta.getNumero() == numero){
                return conta;
            }
        }
        return null;
    }
    
    public void listarContas(){
        System.out.println("Banco: " + this.nome);
        System.out.println("Lista de contas...");
        for (ContaBancaria conta : contas){
            System.out.println(conta.getInformacoes());
        }
    }
    
    public ArrayList<ContaBancaria> getAllAccounts() {
        return contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    static public ContaBancaria maiorSaldo(ArrayList<ContaBancaria> contas){
    ContaBancaria maiorSaldo = contas.get(0);
        
        for(int i = 0; i < contas.size(); i++){
           
            if(contas.get(i).getSaldo() > maiorSaldo.getSaldo()){
                maiorSaldo = contas.get(i);
            }
        }
        return maiorSaldo; 
    }
    
    static public String saldoMedio(ArrayList<ContaBancaria> contas){
    double saldoMedio = 0;
    double saldoTotal = 0;
        
        for(int i = 0; i < contas.size(); i++){
        saldoTotal = saldoTotal + contas.get(i).getSaldo();
        }
        saldoMedio = saldoTotal / (contas.size());
        return String.valueOf("R$: " + saldoMedio); 
    }
    
    static public ContaBancaria menorSaldo(ArrayList<ContaBancaria> contas){
    ContaBancaria menorSaldo = contas.get(0);
        
        for(int i = 0; i < contas.size(); i++){
           
            if(contas.get(i).getSaldo() < menorSaldo.getSaldo()){
                menorSaldo = contas.get(i);
            }
        }
        return menorSaldo; 
    }
    
    static public ArrayList<ContaPoupanca> listaDeContasPoupanca(ArrayList<ContaBancaria> contas){
    ArrayList<ContaPoupanca> listaDeContas = new ArrayList<ContaPoupanca>();
        for(int i = 0; i < contas.size(); i++){
            if(contas.get(i) instanceof ContaPoupanca){
                listaDeContas.add((ContaPoupanca) contas.get(i));
            }
        }
    return listaDeContas;
    }
    
    static public ArrayList<ContaCorrente> listaDeContasCorrente(ArrayList<ContaBancaria> contas){
    ArrayList<ContaCorrente> listaDeContas = new ArrayList<ContaCorrente>();
        for(int i = 0; i < contas.size(); i++){
            if(contas.get(i) instanceof ContaCorrente){
                listaDeContas.add((ContaCorrente) contas.get(i));
            }
        }
    return listaDeContas;
    }
    
    static public String saldoMedioContaPoupanca(ArrayList<ContaPoupanca> contasPoupanca){
    double saldoMedio = 0;
    double saldoTotal = 0;
    
        for(int i = 0; i < contasPoupanca.size(); i++){
        saldoTotal = saldoTotal + contasPoupanca.get(i).getSaldo();
        }
        
        saldoMedio = saldoTotal / (contasPoupanca.size());
        return String.valueOf("R$: " + saldoMedio); 
    }
    
    static public String saldoMedioContaCorrente(ArrayList<ContaCorrente> contasCorrente){
    double saldoMedio = 0;
    double saldoTotal = 0;
    
        for(int i = 0; i < contasCorrente.size(); i++){
        saldoTotal = saldoTotal + contasCorrente.get(i).getSaldo();
        }
        
        saldoMedio = saldoTotal / (contasCorrente.size());
        return String.valueOf("R$: " + saldoMedio); 
    }
    
    
    
}
