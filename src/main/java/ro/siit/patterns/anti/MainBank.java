package ro.siit.patterns.anti;

import java.util.UUID;

public class MainBank {
    public static void main(String[] args) {
        BankAccountHolder bankAccountHolder = new BankAccountHolder();
        // bankAccountHolder.id = UUID.randomUUID();
        // bankAccountHolder.setId(UUID.randomUUID());
        bankAccountHolder.setName("John Doe");
        BankAccountBuilder bankAccountBuilder = new BankAccountBuilder();
        BankAccount bankAccount = bankAccountBuilder.setHolder(bankAccountHolder)
                .setInitialBalance(100.0)
                .build();
        bankAccountHolder.listBankAccounts();
    }
}
