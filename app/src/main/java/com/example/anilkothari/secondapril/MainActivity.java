package com.example.anilkothari.secondapril;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    EditText txtPersonName , txtMobileNumber, txtEmailAddress , txtPassword;
    TextView activeField;

    Button submitButton;
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPersonName = (EditText) findViewById(R.id.txtName);
        txtMobileNumber = (EditText) findViewById(R.id.txtPhoneNumber);
        txtEmailAddress = (EditText) findViewById(R.id.txtEmailAddress);
        txtPassword = (EditText) findViewById(R.id.txtPassword);


        activeField = (TextView) findViewById(R.id.textView);

        submitButton = (Button) findViewById(R.id.btnSubmit);


        boolean allMandatoryFieldFilled = false;

        txtPersonName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.v(TAG,"beforeTextChanged");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                activeField.setText("Editing Person Name");
                checkSubmitButtonToBeEnabled();
                Log.v(TAG,"onTextChanged");

            }

            @Override
            public void afterTextChanged(Editable s) {
                activeField.setText("Registration Form");
                Log.v(TAG,"afterTextChanged");

            }
        });
        txtMobileNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                activeField.setText("Editing Mobile Number");
                checkSubmitButtonToBeEnabled();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        txtEmailAddress.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                activeField.setText("Editing Email Address");
                checkSubmitButtonToBeEnabled();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        txtPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                activeField.setText("Editing password");
                checkSubmitButtonToBeEnabled();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



     }

    public void checkSubmitButtonToBeEnabled(){

        boolean isNameNonEmpty =  !txtPersonName.getText().toString().trim().isEmpty();
        boolean isEmailAddressNonEmpty =  !txtEmailAddress.getText().toString().trim().isEmpty();
        boolean isPhoneNumberNonEmpty =  !txtMobileNumber.getText().toString().trim().isEmpty();
        boolean isPasswordNonEmpty =  !txtPassword.getText().toString().trim().isEmpty();

        boolean submitButtonToBeEnable = isNameNonEmpty && isEmailAddressNonEmpty && isPhoneNumberNonEmpty && isPasswordNonEmpty;
        submitButton.setEnabled(submitButtonToBeEnable);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
