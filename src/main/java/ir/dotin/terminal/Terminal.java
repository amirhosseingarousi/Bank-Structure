package ir.dotin.terminal;

import java.util.List;

public class Terminal {
    private String id;
    private String type;
    private String serverIp;
    private String port;
    private List<Transaction> transactions;

    public Terminal(String id, String type, String serverIp, String port, List<Transaction> transactions) {
        this.id = id;
        this.type = type;
        this.serverIp = serverIp;
        this.port = port;
        this.transactions = transactions;
    }
}
