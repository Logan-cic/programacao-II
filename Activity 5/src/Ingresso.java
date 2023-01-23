abstract class Ingresso {
    protected double valor = 20;

    public Ingresso( double valor) {
        setValor(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract void imprimeValor();
}
