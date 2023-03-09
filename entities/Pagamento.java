package entities;

public class Pagamento {

    private int id;
    private String formaPagamento;
    private double porcentagem;

    private int parcela;

    public Pagamento(int id, String formaPagamento, double porcentagem, int parcela) {
        this.id = id;
        this.formaPagamento = formaPagamento;
        this.porcentagem = porcentagem;
        this.parcela = parcela;
    }

    public int getId() {
        return id;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public double getPorcentagem(){
        return porcentagem;
    }

    public int getParcela(){
        return parcela;
    }
}
