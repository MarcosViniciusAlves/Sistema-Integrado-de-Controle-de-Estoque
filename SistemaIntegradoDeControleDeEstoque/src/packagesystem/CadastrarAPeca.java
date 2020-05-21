package packagesystem;

public class CadastrarAPeca {
    private String produto;
    private int quantidade;
    private double preco;
    private double descontoMaximo;


    public CadastrarAPeca() {}

    public CadastrarAPeca(String produto,int quantidade,double preco,double descontoMaximo){
        this.produto = produto;
        this.preco = preco;
        this.descontoMaximo = descontoMaximo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDescontoMaximo() {
        return descontoMaximo;
    }

    public void setDescontoMaximo(double descontoMaximo) {
        this.descontoMaximo = descontoMaximo;
    }
}
