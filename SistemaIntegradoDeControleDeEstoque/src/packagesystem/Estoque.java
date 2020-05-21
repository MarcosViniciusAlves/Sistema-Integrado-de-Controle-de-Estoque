package packagesystem;

public class Estoque {
    private CadastrarAPeca[] cadastrarAPecas;

    public void dizerEstoque(){
        if(this.cadastrarAPecas != null) {
            System.out.println(" | P R O D U T O |    | Q U A N T I D A D E |   | P R E C O |      | D E S C O N T O . M A X |");
            for(CadastrarAPeca peca : cadastrarAPecas) {
                System.out.print("   |"+peca.getProduto()+"| |"+peca.getQuantidade()+"| |"+peca.getPreco()+"|  |"+peca.getDescontoMaximo()+"|");
            }
            System.out.println();
        }

    }

    public CadastrarAPeca[] getCadastrarAPecas() {
        return cadastrarAPecas;
    }

    public void setCadastrarAPecas(CadastrarAPeca... cadastrarAPecas) {
        this.cadastrarAPecas = cadastrarAPecas;
    }
}
