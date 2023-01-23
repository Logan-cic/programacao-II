public class Vip extends Ingresso{
    private double valorAdicional = 10;

    public Vip(double valor) {
        super(valor);
    }

    public double getValorAdicional() {
        return super.getValor() + valorAdicional;
    }

    public void setValorAdicional( ) {
        this.valorAdicional = 10;
    }

    @Override
    public void imprimeValor() {
       System.out.println(getValorAdicional());
        
    }
    public static void main(String[] args) {
        Vip a = new Vip(10);
        a.imprimeValor();
    }
}
