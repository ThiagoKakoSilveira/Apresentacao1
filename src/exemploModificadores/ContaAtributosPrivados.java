package exemploModificadores;

public class ContaAtributosPrivados {
    private String titular;
    private int numero;
    private double saldo;
    private String cpf;
    private boolean contaValida;

    private final double serialDaConta;

    public ContaAtributosPrivados(){
        serialDaConta =  Math.random();
    }

    public ContaAtributosPrivados(String titular, int numero, double saldo, String cpf) {
        serialDaConta =  Math.random();
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;

        if (testaCpf(cpf)){
            this.cpf = cpf;
            contaValida=true;
        }else{
            contaValida=false;
        }
    }

    public void saca(double valor) {
        this.saldo = this.saldo - valor;
    }

    public void sacaTestandoSaldo(double valor) {
        if (valor > this.saldo){
            System.out.println("Saca excede o limite da conta!");
        } else {
            this.saldo = this.saldo - valor;
        }
    }

    private boolean testaCpf(String cpf){
        if(cpf.length() > 8){
            return true;
        }else {
            return false;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isContaValida() {
        return contaValida;
    }

    public void setContaValida(boolean contaValida) {
        this.contaValida = contaValida;
    }
}
