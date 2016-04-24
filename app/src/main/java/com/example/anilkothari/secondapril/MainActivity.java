package com.example.anilkothari.secondapril;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    EditText txtPersonName , txtMobileNumber, txtEmailAddress , txtPassword;
     Button submitButton = (Button) findViewById(R.id.btnSubmit);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPersonName = (EditText) findViewById(R.id.txtName);
        txtMobileNumber = (EditText) findViewById(R.id.txtPhoneNumber);
        txtEmailAddress = (EditText) findViewById(R.id.txtEmailAddress);
        txtPassword = (EditText) findViewById(R.id.txtPassword);




        boolean allMandatoryFieldFilled = false;

        txtPersonName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkSubmitButtonToBeEnabled();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
//        txtMobileNumber.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                checkSubmitButtonToBeEnabled();
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//        txtEmailAddress.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                checkSubmitButtonToBeEnabled();
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//        txtPassword.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                checkSubmitButtonToBeEnabled();
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });



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
