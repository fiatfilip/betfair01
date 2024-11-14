package ro.siit.patterns.anti;

import java.util.UUID;

public class BankAccountBuilder {
    private String iban = UUID.randomUUID().toString();
    private BankAccountHolder holder;
    private double initialBalance = 0.0;

    public BankAccountBuilder setHolder(BankAccountHolder holder) {
        this.holder = holder;
        return this;
    }
    public BankAccountBuilder setIban(String iban) {
        this.iban = iban;
        return this;
    }

    public BankAccountBuilder setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
        return this;
    }

    public BankAccount build() {
        BankAccount bankAccount = new BankAccount(iban, initialBalance, holder);
        holder.addBankAccount(bankAccount);
        return bankAccount;
    }
}
