public class SavingsAccount extends Account{

    public SavingsAccount(String _name, String _cpf) {
        super(_name, _cpf);
        
    }

    public static void main(String[] args) {
        SavingsAccount poupanca = new SavingsAccount("Logan", "033.775.332-76");
        poupanca.balance = 100;
        poupanca.toWithdraw(25);
    }
    
}
