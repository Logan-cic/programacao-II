public class CurrentAccount extends Account{
    private double overdraft;

    public CurrentAccount( String _name, String _cpf ) {
        super(_name, _cpf);
        this.overdraft = 200;
    }

    @Override
    public double toWithdraw ( double toWithdraw ) {
        double currentValue;
        currentValue = overdraft - toWithdraw;
        if( balance == 0 && toWithdraw <= overdraft) {
            System.out.println("You have "+currentValue);
            System.out.println("Withdrawn amount "+toWithdraw);
            return toWithdraw;
        }
        if(balance > 0){
            return super.toWithdraw(toWithdraw);
        }
        System.out.println("Invalid value");
        return toWithdraw;
    }  
    public static void main(String[] args) {
        CurrentAccount conta = new CurrentAccount("Logan", "033.775.332-76");
        conta.balance = 100;
        conta.toWithdraw(40);
    }
}
