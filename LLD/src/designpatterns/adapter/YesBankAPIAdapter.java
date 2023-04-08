package designpatterns.adapter;

import designpatterns.adapter.bankPlatforms.YesBankApi;

public class YesBankAPIAdapter implements BankAPIAdapter {

    private final YesBankApi yesBankApi;

    public YesBankAPIAdapter() {
        this.yesBankApi = new YesBankApi();
    }

    @Override
    public double checkBalance() {
        return yesBankApi.checkBalance();
    }

    @Override
    public boolean authenticate() {
        return yesBankApi.authenticateUser();
    }

    @Override
    public boolean transaction() {
        return yesBankApi.transaction();
    }
}
