package exemploheranca;

public class Tecnico extends Pessoa {
    private int qntdPlantel;

    public void quantosComanda(){
        System.out.println("Atualmente tem "+this.qntdPlantel+" comandados");
    }
}
