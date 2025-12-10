public abstract class AccountDecorator implements BankAccountDecorator {

    protected BankAccountDecorator decoratedAccount;

    public AccountDecorator(BankAccountDecorator decoratedAccount) {
        this.decoratedAccount = decoratedAccount;
    }

    @Override
    public String showAccountType() {
        return decoratedAccount.showAccountType();
    }

    @Override
    public double getInterestRate() {
        return decoratedAccount.getInterestRate();
    }

    @Override
    public double getBalance() {
        return decoratedAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return decoratedAccount.showBenefits();
    }

    @Override
    public double computeBalanceWithInterest() {
        return decoratedAccount.computeBalanceWithInterest();
    }

    @Override
    public String showInfo() {
        return decoratedAccount.showInfo();
    }
}
