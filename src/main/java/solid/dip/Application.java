package solid.dip;

public class Application {
    public static void main(String[] args) {

        Portfolio portfolio
                = new Portfolio(new WarsawStockExchange());

        Portfolio portfolio1
                = new Portfolio(new TokioStockExchange());
    }
}
