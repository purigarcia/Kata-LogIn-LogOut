package kataloginlogout.puri.es.kataloginlogout;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Puri Garcia on 7/26/2017.
 */
public class LogInPresenterTest {

    private MockApiClient apiClient = new MockApiClient(new Clock());
    private MockLoginView mockView = new MockLoginView();

    @Test
    public void shouldShowErrorIfThereIsSomethingWrongWhileLogIn() {
        apiClient.setFailOnLogIn(true);
        LogInPresenter presenter = new LogInPresenter(apiClient, mockView);

        presenter.login("pedro@karumi.com", "123");

        assertTrue(mockView.getSomeoneInvokeShowErrorMessage());
    }


            //compruebas que se ha invocado un metodo

}