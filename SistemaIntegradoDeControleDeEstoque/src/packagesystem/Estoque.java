package packagesystem;

public class Estoque {
    private CadastrarAPeca[] cadastrarAPecas;

    public Estoque() {
    }

    public Estoque(CadastrarAPeca... cadastrarAPecas) {
        this.cadastrarAPecas = cadastrarAPecas;
    }

    public void dizerEstoque() {
        if (this.cadastrarAPecas != null) {

            System.out.println("");

            System.out.println("/Produto / Quantidade / preco do produto / desconto maximo/");

            for (CadastrarAPeca peca : cadastrarAPecas) {

                System.out.print("/" + peca.getProduto() + "/" + peca.getQuantidade() + "/" + peca.getPreco() + "RS/" + peca.getDescontoMaximo() + "%/");

            }
            System.out.println("");
        } else {

            System.out.println("O estoque esta vazio");

        }

    }

    public void baixaNoEstoque(int quantidadeDeSaida, String nomeDoProduto) {
        if (this.cadastrarAPecas != null) {

            for (CadastrarAPeca peca : cadastrarAPecas) {

                if (peca.getProduto().equals(nomeDoProduto)) {

                    peca.setQuantidade(peca.getQuantidade() - quantidadeDeSaida);

                    return;

                }

            }
        } else {

            System.out.println("o estoque nao possui intens para dar baixa");

        }

    }

    public CadastrarAPeca[] getCadastrarAPecas() {
        return this.cadastrarAPecas;
    }
}
