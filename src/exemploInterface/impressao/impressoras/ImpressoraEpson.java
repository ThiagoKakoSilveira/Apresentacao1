package exemploInterface.impressao.impressoras;

import exemploInterface.impressao.Impressora;
import exemploInterface.impressao.Imprimivel;

public class ImpressoraEpson implements Impressora {

    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println(imprimivel.getCabecalhoPagina());
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println(imprimivel.getCorpoPagina());
        System.out.println();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("==                   HP                   ==");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
    }

}
