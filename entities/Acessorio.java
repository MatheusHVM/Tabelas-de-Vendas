package entities;

public class Acessorio {

    private int id;
    private String marca;
    private double preco;

    public Acessorio(int id, String marca, double preco) {
        this.id = id;
        this.marca = marca;
        this.preco = preco;
    }

    public int getId(){
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }
}
