package exemploInterface.teste;

import exemploInterface.caixa.Checkout;
import exemploInterface.caixa.Compra;
import exemploInterface.impressao.Impressora;
import exemploInterface.impressao.impressoras.ImpressoraHP;
import exemploInterface.pagamento.Cartao;
import exemploInterface.pagamento.Operadora;
import exemploInterface.pagamento.operadoras.Redecard;

public class TesteCheckout {

    public static void main(String[] args) {
        Operadora operadora = new Redecard();
        Impressora impressora = new ImpressoraHP();

        Cartao cartao = new Cartao();
        cartao.setNomeTitular("João M Couves");
        cartao.setNumeroCartao("456");

        Compra compra = new Compra();
        compra.setNomeCliente("João Mendonça Couves");
        compra.setProduto("Sabonete");
        compra.setValorTotal(-1);

        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharCompra(compra, cartao);
    }

}
