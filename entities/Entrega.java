package entities;

public class Entrega {
    private int id;
    private String empresa;
    private double preco;
    private String prazoEntrega;

    public Entrega(int id, String empresa, double preco, String prazoEntrega) {
        this.id = id;
        this.empresa = empresa;
        this.preco = preco;
        this.prazoEntrega = prazoEntrega;
    }

    public int getId() {
        return id;
    }

    public String getEmpresa(){
        return empresa;
    }

    public double getPreco() {
        return preco;
    }

    public String getPrazoEntrega() {
        return prazoEntrega;
    }
}
