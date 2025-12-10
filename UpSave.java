public class UpSave extends AccountDecorator {

    public UpSave(BankAccountDecorator decoratedAccount) {
        super(decoratedAccount);
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04; // 4%
    }

    @Override
    public String showBenefits() {
        return decoratedAccount.showBenefits() + ", With Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        return decoratedAccount.getBalance() +
               (decoratedAccount.getBalance() * getInterestRate());
    }
}
