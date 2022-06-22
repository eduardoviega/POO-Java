package questao3;

public class Lancamento {
    private String descricao;
        private int tipo;
        private double valor;

        public Lancamento(int tipo, String descricao, double valor) {
            this.descricao = descricao;
            this.tipo = tipo;
            this.valor = valor;
        }

        public String getDescricao() { return descricao; }
        public void setDescricao(String descricao) { this.descricao = descricao; }
        public int getTipo() { return tipo; }
        public void setTipo(int tipo) { this.tipo = tipo; }
        public double getValor() { return valor; }
        public void setValor(double valor) { this.valor = valor; }
}
