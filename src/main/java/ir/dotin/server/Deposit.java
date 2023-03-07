package ir.dotin.server;

import java.math.BigDecimal;

public class Deposit {
    private String id;
    private String customer;
    private BigDecimal initialBalance;
    private BigDecimal upperBound;

    public Deposit(String id, String customer, BigDecimal initialBalance, BigDecimal upperBound) {
        this.id = id;
        this.customer = customer;
        this.initialBalance = initialBalance;
        this.upperBound = upperBound;
    }


}
