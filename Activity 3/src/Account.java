public class Account extends AccountHolder {
    private double balance = 0;

    public Account(String _name, String _cpf) {
        super(_name, _cpf);
    }

    public double getBalance (  ) {
       
        return balance;
    }

    public double toWithdraw ( double toWithdraw) {

        return toWithdraw;
    }

    public void transfer( double value, AccountHolder to ) {
        
    }   
}
