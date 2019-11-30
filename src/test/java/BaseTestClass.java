import org.junit.jupiter.api.Test;


public class BaseTestClass {


    @Test
    public void registryTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        cashbackHackService.remain(0);

    }

    @Test
    public void authTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        cashbackHackService.remain(10000000);
    }

}
