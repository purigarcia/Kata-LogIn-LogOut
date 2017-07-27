package kataloginlogout.puri.es.kataloginlogout;

/**
 * Created by Puri Garcia on 7/27/2017.
 */

public class MockApiClient extends ApiClient {

    private boolean failOnLogIn = false;

    MockApiClient(Clock clock) {
        super(clock);
    }

    public void setFailOnLogIn(boolean failOnLogIn) {
        this.failOnLogIn = failOnLogIn;
    }

    @Override
    public boolean login(String email, String pass) {
        if(failOnLogIn) {
            return false;
        } else {
            return true;
        }
    }

}