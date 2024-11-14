package ro.siit.patterns.anti;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BankAccountHolder {
    private UUID id = UUID.randomUUID();
    private String name;
    private List<BankAccount> bankAccounts = new ArrayList<>();

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        // validate id already exists
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public void listBankAccounts() {
        for (BankAccount bankAccount : bankAccounts) {
            System.out.println(bankAccount);
        }
    }
}
