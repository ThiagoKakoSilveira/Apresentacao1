package exemploModificadores;

public class TestaConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.saldo = 1000.0;
        minhaConta.saca(50000); // saldo é só 1000!!
    }
}
