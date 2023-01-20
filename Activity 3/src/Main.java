// import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        CurrentAccount Logan = new CurrentAccount("Logan", "036.878.090-76");
        Logan.balance = 100;
        Logan.toWithdraw(200);

        SavingsAccount poupanca = new SavingsAccount("Logan", "033.775.332-76");
        poupanca.balance = 100;
        poupanca.toWithdraw(25);
        SavingsAccount poupanca1 = new SavingsAccount("Logan", "033.775.332-76");
        poupanca.transfer(50, poupanca1);
        System.out.println(poupanca.balance);
    }
}
