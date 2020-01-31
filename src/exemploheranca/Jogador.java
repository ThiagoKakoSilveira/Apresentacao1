package exemploheranca;

public class Jogador extends Pessoa{

    private boolean aindaJoga;
    private int qntdGols;
    private final double CODIGOINTERNODOCLUBE;

    public Jogador(){
        CODIGOINTERNODOCLUBE = Math.random();

    }
    public Jogador(boolean aindaJoga, int qntdGols){
        CODIGOINTERNODOCLUBE = Math.random();
        this.setQntdGols(qntdGols);
        this.setAindaJoga(aindaJoga);
    }

    public void dizerSeAindaJoga() {

        System.out.println("Ainda joga? " + aindaJoga);
    }

    public boolean isAindaJoga() {
        return aindaJoga;
    }

    public void setAindaJoga(boolean aindaJoga) {
        this.aindaJoga = aindaJoga;
    }

    public int getQntdGols() {
        return qntdGols;
    }

    public void setQntdGols(int qntdGols) {
        if (qntdGols<=0){
            this.qntdGols = 0;
        }else{
            this.qntdGols = qntdGols;
        }
    }

    public double getCODIGOINTERNODOCLUBE() {
        return CODIGOINTERNODOCLUBE;
    }

    public void dizerQntsGolFez(){
        System.out.println("Eu já fiz "+qntdGols+ ehPlural());
    }

    private String ehPlural(){
        if (qntdGols>1){
            return " gols";
        }else{
            return " gol";
        }
    }
}
