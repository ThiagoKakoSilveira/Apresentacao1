package exemploInterface.pagamento.operadoras;

import exemploInterface.pagamento.Autorizavel;
import exemploInterface.pagamento.Cartao;
import exemploInterface.pagamento.Operadora;

public class Redecard implements Operadora {

    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("456")
                && autorizavel.getValorTotal() < 200;
    }

}
