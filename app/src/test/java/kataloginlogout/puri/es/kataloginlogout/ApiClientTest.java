package kataloginlogout.puri.es.kataloginlogout;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Puri Garcia on 7/26/2017.
 */
public class ApiClientTest {
    @Test
    public void login() throws Exception {
     ApiClient apiClient = new ApiClient(new MockClock());
     boolean res= apiClient.login("pedro@karumi.com","123456");
     assertEquals(true, res);


    }

    @Test
    public void logout() throws Exception {
        ApiClient apiClient = new ApiClient(new MockClock());
        boolean res= apiClient.logout();
        assertEquals(true, res);

    }

}

class MockClock extends Clock {
    @Override
    public long getCurrentTime(){
        return 1000;
    }
}