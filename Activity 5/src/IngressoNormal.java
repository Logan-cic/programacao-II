import static java.lang.System.out;

public class IngressoNormal extends Ingresso{

    public IngressoNormal(double valor) {
        super(valor);
    }

    @Override
    public void imprimeValor() {
        System.out.println(getValor());
    }

    public void imprimeIngressoNormal() {
        out.println("Esse é o ingresso normal. Valor: "+ valor);
    }


    public static void main(String[] args) {
        IngressoNormal teste = new IngressoNormal(10);
        teste.imprimeIngressoNormal();
    }
    
}
