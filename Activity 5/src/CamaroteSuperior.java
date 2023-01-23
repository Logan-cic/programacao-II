public class CamaroteSuperior extends Vip {

    private String localizacao = "";
    private double valorCamarote = 50;

    public CamaroteSuperior(double valor, String localizacao) {
        super(valor);
        this.localizacao = localizacao;

    }

    public double valorCamaroteSuperior() {
        return super.getValor() + valorCamarote;
    }


    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void localizacao(){
        System.out.println(getLocalizacao());
    }
}
