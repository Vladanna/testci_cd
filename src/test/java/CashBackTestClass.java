import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CashBackTestClass {


    @Test
    public void firstPassedTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int summUntilCaskBack = cashbackHackService.remain(500);
        Assertions.assertEquals(500,summUntilCaskBack);

    }

    @Test
    public void secondFailedTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int summUntilCaskBack = cashbackHackService.remain(1000);
        Assertions.assertEquals(0,summUntilCaskBack);
    }

}
