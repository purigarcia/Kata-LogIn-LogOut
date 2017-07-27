package kataloginlogout.puri.es.kataloginlogout;

/**
 * Created by Puri Garcia on 7/26/2017.
 */

public class MockLoginView implements LogInView {
    private boolean someoneInvokedShowErrorMessage = false;

    public void showErrorMessage(){
        someoneInvokedShowErrorMessage = true;
    }

    public boolean getSomeoneInvokeShowErrorMessage(){
        return someoneInvokedShowErrorMessage;
    }

    public void showLogOutActivity(){

    }
}
