package kataloginlogout.puri.es.kataloginlogout;

/**
 * Created by Puri Garcia on 7/26/2017.
 */

public class ApiClient {
    private Clock miclock;
    ApiClient(Clock clock){
        miclock = clock;
    }

    public boolean login(String email, String password){
        boolean result = false;
        if (email.equals("pedro@karumi.com") && password.equals("123456")){
            result = true;
        }
        return result;
    }

    public boolean logout(){
        boolean result = false;
        if ((miclock.getCurrentTime()%2) == 0) {
            result = true;
        }
        return result;
    }

}
