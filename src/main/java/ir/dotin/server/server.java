package ir.dotin.server;

import java.util.List;

public class server {
    private String port;
    private List<Deposit> deposits;

    public server(String port, List<Deposit> deposits) {
        this.port = port;
        this.deposits = deposits;
    }
}
