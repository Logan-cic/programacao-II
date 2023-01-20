class AccountHolder {
    private String name;
    private String cpf; 

    public AccountHolder( String _name, String _cpf ) {
        this.name = _name;
        this.cpf = _cpf;
    }

    public String getName( ) {
        return name;
    }

    public String getCpf( ) {
        return cpf;
    }
}
