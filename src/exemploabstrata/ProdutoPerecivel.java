package exemploabstrata;

public class ProdutoPerecivel extends Produto {

    String dataValidade;

    public void imprimirDescricao() {
        System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
    }
}
