public class Trade {

    private String type;

    private String ticker;

    private int amount;

    public Trade(String type, String ticker, int amount) {
        this.type = type;
        this.ticker = ticker;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public String getTicker() {
        return ticker;
    }

    public int getAmount() {
        return amount;
    }
}