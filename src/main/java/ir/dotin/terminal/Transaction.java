package ir.dotin.terminal;

public class Transaction {
    private String id;
    private String type;
    private String amount;
    private String depositId;

    public Transaction(String id, String type, String amount, String depositId) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.depositId = depositId;
    }
}
