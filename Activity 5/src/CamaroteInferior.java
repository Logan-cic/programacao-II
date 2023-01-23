class CamaroteInferior extends Vip{

    private String localizacao = "";
    private double valorCamaroteInferior = 40;

    public CamaroteInferior(double valor, String localizacao) {
        super(valor);
        this.localizacao = localizacao;
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

    public double valorCamaroteInferior() {
        return super.getValor() + valorCamaroteInferior;
    }

    
}
