import java.util.Scanner;

public class main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int op, op1;
        try (Scanner enter = new Scanner(System.in)) {
            IngressoNormal ingresso = new IngressoNormal(40);

            System.out.printf("\n1 - Ingresso Normal\n2 - Vip\n");
            System.out.printf("\nEscolha uma opção: ");
            op = enter.nextInt();

            System.out.println();
            switch(op) {
                case 1:
                  System.out.println("Você acaba de adquirir um ingresso do tipo normal");
                  ingresso.imprimeValor();
                  break;
                case 2:
                  System.out.printf("\n1 - Camarote Superior\n2 - Camarote inferior\n");
                  System.out.printf("\nEscolha uma opção: ");
                  op1 = enter.nextInt();
                    if(op1 == 1){
                        System.out.println("\nVocê acaba de adquirir um ingresso\npara o camarote superior.");
                        CamaroteSuperior cs = new CamaroteSuperior(80, "34B");
                        System.out.println("Localização: Poltrona "+cs.getLocalizacao());
                        System.out.println("Valor: "+cs.valorCamaroteSuperior());  
                        return;
                    }
                    System.out.println("\nVocê acaba de adquirir um ingresso\npara o camarote inferior.");
                        CamaroteInferior ci = new CamaroteInferior(60, "26A");
                        System.out.println("Localização: Poltrona "+ci.getLocalizacao());
                        System.out.println("Valor: "+ci.valorCamaroteInferior());  

                  break;
                default:
                  return;
              }
        }
    }
}
