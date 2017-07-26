package kataloginlogout.puri.es.kataloginlogout;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Puri Garcia on 7/26/2017.
 */
public class ApiClientTest {
    @Test
    public void login() throws Exception {
     ApiClient apiClient = new ApiClient(new Clock());
     boolean res= apiClient.login("pedro@karumi.com","123456");
     assertEquals(true, res);


    }

    @Test
    public void shpuldLogoutBeSuccesfulIfSecondIsEven() throws Exception {
        ApiClient apiClient = new ApiClient(new MockClock(1000));
        boolean res= apiClient.logout();
        assertEquals(true, res);

    }

    @Test
    public void shpuldLogoutFailIfSecondIsOdd() throws Exception {
        ApiClient apiClient = new ApiClient(new MockClock(1001));
        boolean res= apiClient.logout();
        assertEquals(false, res);

    }

}

class MockClock extends Clock {

    private int fixedTime;
    MockClock(int timeToSend){
        fixedTime = timeToSend;
    }

    @Override
    public long getCurrentTime(){
        return fixedTime;
    }
}