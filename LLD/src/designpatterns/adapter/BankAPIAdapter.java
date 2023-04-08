package designpatterns.adapter;

public interface BankAPIAdapter {
    double checkBalance();
    boolean authenticate();
    boolean transaction();
}
