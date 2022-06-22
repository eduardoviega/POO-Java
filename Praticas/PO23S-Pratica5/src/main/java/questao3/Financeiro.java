package questao3;

public class Financeiro {
    double saldo = 0;
    public void processarLancamento(Lancamento lan){
        if(lan.getTipo() == 1){
            System.out.printf("Lançamento: Receber - %s - %.2f\n", lan.getDescricao(), lan.getValor());
            saldo += lan.getValor();
        }else{
            System.out.printf("Lançamento: Pagar - %s - %.2f\n", lan.getDescricao(), lan.getValor());
            saldo -= lan.getValor();
        }
    }
    public void printSaldo(){
        System.out.printf("Saldo = %.2f", saldo);
    }
}