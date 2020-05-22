package packagemain;
import packagesystem.*;
public class JavaMain {
    public static void main(String[] args) {
        CadastrarAPeca cp1 = new CadastrarAPeca("Travesseiro",20,10.00,10);
        Estoque e = new Estoque(cp1);
        e.dizerEstoque();
    }
}
