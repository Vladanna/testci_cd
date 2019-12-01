import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class CashBackTestClass {

    @ParameterizedTest
    @CsvFileSource(resources = "testData.csv", numLinesToSkip = 1)
    public void passedTest(int input, int expected) {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int summUntilCaskBack = cashbackHackService.remain(input);
        Assertions.assertEquals(expected, summUntilCaskBack);

    }

    @Test
    public void zeroFailedTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(0));
        Assertions.assertEquals("amount must be greater than zero", exception.getMessage());
    }
}
