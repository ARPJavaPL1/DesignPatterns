package solid.dip;

public class Portfolio {
    private StockExchange stockExchange;
    private double value;

    public Portfolio(StockExchange stockExchange) {
        this.stockExchange = stockExchange;
    }

    public double getValue() {
        return value;
    }

    // TODO: metody obłsugi portfela

    void add(int count, String symbol) {
        value += stockExchange.currentPrice(symbol) * count;
    }
}
