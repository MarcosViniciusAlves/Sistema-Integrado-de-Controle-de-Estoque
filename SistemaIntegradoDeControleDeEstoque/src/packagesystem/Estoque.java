package packagesystem;

public class Estoque {
    private CadastrarAPeca[] cadastrarAPecas;

    public Estoque () {}
    public Estoque (CadastrarAPeca... cadastrarAPecas) {
        this.cadastrarAPecas = cadastrarAPecas;
    }

    public void dizerEstoque(){
        if(this.cadastrarAPecas != null) {
            System.out.println("/Produto / Quantidade / preco do produto / desconto maximo/");
            for(CadastrarAPeca peca : cadastrarAPecas) {
                System.out.print("/"+peca.getProduto()+"/"+peca.getQuantidade()+"/"+peca.getPreco()+"RS/"+peca.getDescontoMaximo()+"%/");
            }
            System.out.println();
        }

    }
    public void baixaNoEstoque (int quantidade,String nomeDoProduto) {
        for(CadastrarAPeca peca : cadastrarAPecas) {
            if(peca.getProduto().equals(nomeDoProduto)) {
                peca.setPreco(peca.getPreco() - quantidade);
                return;
            }
        }
    }
    public CadastrarAPeca[] getCadastrarAPecas() {
        return cadastrarAPecas;
    }
}
