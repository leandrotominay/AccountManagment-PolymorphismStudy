package application;

import entities.BusinessAccount;

public class Main {

    public static void main(String[] args) {

        BusinessAccount account = new BusinessAccount(3301, "Leandro Ramos", 0.0, 500.0);

        System.out.println(account.getBalance());
    }
}
