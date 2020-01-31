package exemploModificadores;

public class Conta {
    String titular;
    int numero;
    double saldo;

    // ..

    void saca(double valor) {
        this.saldo = this.saldo - valor;
    }

    void sacaTestandoSaldo(double valor) {
        if (valor > this.saldo){
            System.out.println("Saca excede o limite da conta!");
        } else {
            this.saldo = this.saldo - valor;
        }
    }
}
