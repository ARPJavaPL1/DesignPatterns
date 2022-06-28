package solid.dip;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.anyString;

public class PortfolioTests {

    @Test
    public void givenFiveCDProjectTotalShouldBe500() {

        StockExchange stockExchange = Mockito.mock(StockExchange.class);
        Mockito.when(stockExchange.currentPrice(anyString())).thenReturn(100d);

        Portfolio portfolio = new Portfolio(stockExchange);
        portfolio.add(5, "CDPR");
        Assertions.assertEquals(500d, portfolio.getValue());
    }
}
