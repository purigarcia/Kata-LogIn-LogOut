package kataloginlogout.puri.es.kataloginlogout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements LogInView {

    private LogInPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final ApiClient apiclient = new ApiClient(new Clock());
        presenter = new LogInPresenter(apiclient, this);

        final EditText emailText = (EditText)findViewById(R.id.email);
        final EditText passwordText = (EditText)findViewById(R.id.password);
        final Button buttonLogOut = (Button)findViewById(R.id.buttonLogOut);
        final Button buttonLogin = (Button)findViewById(R.id.buttonLogin);
        final TextView errorMessage = (TextView)findViewById(R.id.errorMessage);

        buttonLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                presenter.login(emailText.getText().toString(), passwordText.getText().toString());

                /*boolean result = apiclient.login(emailText.getText().toString(), passwordText.getText().toString());

                if (result) {
                    buttonLogOut.setVisibility(View.VISIBLE);
                    emailText.setVisibility(View.INVISIBLE);
                    passwordText.setVisibility(View.INVISIBLE);
                    buttonLogin.setVisibility(View.INVISIBLE);
                } else {
                    errorMessage.setVisibility(View.VISIBLE);
                }*/
            }
        });

        emailText.addTextChangedListener(new TextWatcher() {
             @Override
             public void beforeTextChanged(CharSequence s, int start, int count, int after) {

             }

             @Override
             public void onTextChanged(CharSequence s, int start, int before, int count) {

             }

             @Override
             public void afterTextChanged(Editable s) {
                 if(s.length()!=0 && passwordText.getText().length()!=0){
                     buttonLogin.setEnabled(true);
                 }
             }
         }
        );


        passwordText.addTextChangedListener(new TextWatcher() {
             @Override
             public void beforeTextChanged(CharSequence s, int start, int count, int after) {

             }

             @Override
             public void onTextChanged(CharSequence s, int start, int before, int count) {

             }

             @Override
             public void afterTextChanged(Editable s) {
                 if(s.length()!=0 && emailText.getText().length()!=0){
                     buttonLogin.setEnabled(true);
                 }
             }
         }
        );
    }


    @Override
    public void showErrorMessage() {
        final TextView errorMessage = (TextView)findViewById(R.id.errorMessage);
        errorMessage.setVisibility(View.VISIBLE);
    }

    @Override
    public void showLogOutActivity() {
        final EditText emailText = (EditText)findViewById(R.id.email);
        final EditText passwordText = (EditText)findViewById(R.id.password);
        final Button buttonLogOut = (Button)findViewById(R.id.buttonLogOut);
        final Button buttonLogin = (Button)findViewById(R.id.buttonLogin);
        buttonLogOut.setVisibility(View.VISIBLE);
        emailText.setVisibility(View.INVISIBLE);
        passwordText.setVisibility(View.INVISIBLE);
        buttonLogin.setVisibility(View.INVISIBLE);

    }
}
