class Account extends AccountHolder {
    protected double balance = 0;

    public Account( String _name, String _cpf ) {
        super(_name, _cpf);
    }

    public double getBalance (  ) {
       
        return balance;
    }

    public double toWithdraw ( double toWithdraw) {
        if( balance <= 0 ){
            System.out.println("I do not have money");
            return toWithdraw;
        }
        if( toWithdraw > balance ) {
            System.out.println("Insufficient funds");
        }

        balance -= toWithdraw;
        System.out.println( "Withdrawn amount "+toWithdraw) ;
        System.out.println( "Account balance "+balance );
        return toWithdraw;
    }

    public void transfer( double value, Account to ) {
        this.balance -= value;
        to.balance += value;
        System.out.println( "The "+ to.getName( )+" holder account has "+to.balance+" balance now" );
    }   

}
