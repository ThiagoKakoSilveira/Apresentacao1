package exemploInterface.pagamento.operadoras;

import exemploInterface.pagamento.Autorizavel;
import exemploInterface.pagamento.Cartao;
import exemploInterface.pagamento.Operadora;

public class Cielo implements Operadora {

    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123")
                && autorizavel.getValorTotal() < 100;
    }
}
