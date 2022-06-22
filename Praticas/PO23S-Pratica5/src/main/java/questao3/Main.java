package questao3;

//Implemente uma classe chamada Financeiro que tem por objetivo processar lançamentos de contas a pagar ou receber de 
//uma pessoa física. A classe Financeiro deve fornecer um método para receber um lançamento, verificar se o tipo é pagar 
//ou receber e, com base no tipo,incrementar ou decrementar o saldo do financeiro da pessoa. A cada lançamento processado 
//uma linha contendo as seguintes informações deve ser impressa na saída padrão: Lançamento: TIPO - DESCRIÇÃO - VALOR. 
//A classe Financeiro também deve fornecer um método para imprimir na saída padrão o saldo do financeiro da pessoa.
//
//A classe que representa um lançamento já está implementada, veja o código abaixo:
//
//class Lancamento {
//    private String descricao;
//    private int tipo;
//    private double valor;
//
//    public Lancamento(int tipo, String descricao, double valor) {
//        this.descricao = descricao;
//        this.tipo = tipo;
//        this.valor = valor;
//    }
//
//    public String getDescricao() { return descricao; }
//    public void setDescricao(String descricao) { this.descricao = descricao; }
//    public int getTipo() { return tipo; }
//    public void setTipo(int tipo) { this.tipo = tipo; }
//    public double getValor() { return valor; }
//    public void setValor(double valor) { this.valor = valor; }
//}

public class Main {
    public static void main(String args[]){
        //Teste 1
        System.out.println("Teste 1:");
        int Receber1 = 1, Pagar1 = 0;
        Financeiro financeiro1 = new Financeiro();
        Lancamento lanc11 = new Lancamento(Receber1, "Salario", 1000.99);
        Lancamento lanc12 = new Lancamento(Pagar1, "Luz", 250.56);
        Lancamento lanc13 = new Lancamento(Pagar1, "Água", 180.19);
        financeiro1.processarLancamento(lanc11);
        financeiro1.processarLancamento(lanc12);
        financeiro1.processarLancamento(lanc13);
        financeiro1.printSaldo();
        
        //Teste 2
        System.out.println("\n\nTeste 2:");
        int Receber2 = 1, Pagar2 = 0;
        Financeiro financeiro2 = new Financeiro();
        Lancamento lanc21 = new Lancamento(Receber2, "Salario", 1000.99);
        Lancamento lanc22 = new Lancamento(Receber2, "Megasena", 22250.56);
        Lancamento lanc23 = new Lancamento(Receber2, "Bingo", 1800.19);
        financeiro2.processarLancamento(lanc21);
        financeiro2.processarLancamento(lanc22);
        financeiro2.processarLancamento(lanc23);
        financeiro2.printSaldo();
        
        //Teste 3
        System.out.println("\n\nTeste 3:");
        int Receber3 = 1, Pagar3 = 0;
        Financeiro financeiro3 = new Financeiro();
        Lancamento lanc31 = new Lancamento(Pagar3, "Funcionário", 1500.99);
        Lancamento lanc32 = new Lancamento(Pagar3, "Luz", 250.56);
        Lancamento lanc33 = new Lancamento(Pagar3, "Água", 180.19);
        financeiro3.processarLancamento(lanc31);
        financeiro3.processarLancamento(lanc32);
        financeiro3.processarLancamento(lanc33);
        financeiro3.printSaldo();
        
        //Teste 4
        System.out.println("\n\nTeste 4:");
        int Receber4 = 1, Pagar4 = 0;
        Financeiro financeiro4 = new Financeiro();
        Lancamento lanc41 = new Lancamento(Receber4, "Ganhei", 1000.99999);
        Lancamento lanc42 = new Lancamento(Pagar4, "Perdi", 1000.99999);
        financeiro4.processarLancamento(lanc41);
        financeiro4.processarLancamento(lanc42);
        financeiro4.printSaldo();
    }
}
