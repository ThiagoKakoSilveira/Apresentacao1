package exemploheranca;

public class TestaHeranca {
    public static void main(String[] args) {
        Jogador j = new Jogador();
        j.nome = "Ronaldo";
        j.idade = 33;

        j.seApresentar();
        j.dizerSeAindaJoga();

        Pessoa p = new Pessoa();
        p.nome="Severino";
        p.idade = 57;
        p.seApresentar();
//        p.dizerSeAindaJoga();

    }
}
