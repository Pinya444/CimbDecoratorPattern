public class GSave extends AccountDecorator {

    public GSave(BankAccountDecorator decoratedAccount) {
        super(decoratedAccount);
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 0.025; // 2.5%
    }

    @Override
    public String showBenefits() {
        return decoratedAccount.showBenefits() + ", GSave Transfer";
    }

    @Override
    public double computeBalanceWithInterest() {
        return decoratedAccount.getBalance() + 
               (decoratedAccount.getBalance() * getInterestRate());
    }
}
