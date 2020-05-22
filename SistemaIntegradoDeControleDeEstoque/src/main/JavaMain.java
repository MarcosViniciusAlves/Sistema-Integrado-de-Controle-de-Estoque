package main;
import system.*;
public class JavaMain {
    public static void main(String[] args) {
        CadastrarAPeca cp1 = new CadastrarAPeca("banana",999,2.00,5);
        Estoque e = new Estoque(cp1);

        e.dizerEstoque();
        e.baixaNoEstoque(200,"banana");
        e.dizerEstoque();
    }
}
