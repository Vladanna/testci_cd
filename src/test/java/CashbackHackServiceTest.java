import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class CashbackHackServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "testData.csv", numLinesToSkip = 1)
    public void shouldReturnAmountBeforeCashbackIfPurchases(int amountOfPurchase, int expectedAmountUntilCashback) {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amountBeforeCashback = cashbackHackService.remain(amountOfPurchase);
        Assertions.assertEquals(expectedAmountUntilCashback, amountBeforeCashback);

    }

    @Test
    public void shouldReturnErrorIfNoPurchase() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(0));
        Assertions.assertEquals("amount must be greater than zero", exception.getMessage());
    }
}
