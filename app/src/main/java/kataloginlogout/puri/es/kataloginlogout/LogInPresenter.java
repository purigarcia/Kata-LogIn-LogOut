package kataloginlogout.puri.es.kataloginlogout;

/**
 * Created by Puri Garcia on 7/26/2017.
 */

public class LogInPresenter {
    private final ApiClient apiclient;
    private final LogInView view;

    public LogInPresenter(ApiClient apiclient, LogInView view) {
        this.apiclient = apiclient;
        this.view = view;
    }

    public void login(String email, String pass){

        if(apiclient.login(email, pass)) {
            view.showLogOutActivity();
        } else {
            view.showErrorMessage();
        }
    }

}
