package exemploStatic;

public class ModificadorStatic {
        private int tamanho;
        private static int conta = 0; //IMPRIME A CONTAGEM DE 4 VALORES
//        private int conta = 0; //IMPRIME A CONTAGEM DE 1 VALOR

        public ModificadorStatic(){
            conta++;
            System.out.println("Valor = "+conta);
        }

        public static void main(String[] args) {
            ModificadorStatic c = new ModificadorStatic();

            ModificadorStatic dois = new ModificadorStatic();
            ModificadorStatic tres = new ModificadorStatic();
            ModificadorStatic quatro = new ModificadorStatic();
        }
}
