package designpatterns.adapter;

import designpatterns.adapter.bankPlatforms.ICICIBankApi;

public class ICICIBankAPIAdapter implements BankAPIAdapter {

    private final ICICIBankApi iciciBankApi;

    public ICICIBankAPIAdapter() {
        this.iciciBankApi = new ICICIBankApi();
    }

    @Override
    public double checkBalance() {
        return iciciBankApi.queryBalance();
    }

    @Override
    public boolean authenticate() {
        return iciciBankApi.checkUser() == 1;
    }

    @Override
    public boolean transaction() {
        return iciciBankApi.transfer() == 1;
    }
}
