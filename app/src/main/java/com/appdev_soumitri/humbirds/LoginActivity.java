package com.appdev_soumitri.humbirds;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    private TextView signupText;
    private EditText etEmail, etPass;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar actionBar=getSupportActionBar();
        assert actionBar!=null;
        actionBar.setTitle("Login");

        signupText=findViewById(R.id.signupText);
        etEmail=findViewById(R.id.etEmailLogin);
        etPass=findViewById(R.id.etPassLogin);

        signupText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Action: ","User chooses to Sign Up");
                startActivity(new Intent(LoginActivity.this,SignUpNewUser.class));
                finish();
            }
        });

        btnLogin=findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email=etEmail.getText().toString().trim();
                String pass=etPass.getText().toString().trim();

                boolean tmp=true;
                if(email.length()==0 || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    etEmail.setError("Invalid email");
                    etEmail.requestFocus();
                    tmp=false;
                }
                if(pass.length()==0) {
                    etPass.setError("password is required");
                    etPass.requestFocus();
                    tmp=false;
                }

                if(tmp) {
                    boolean flag = authenticateLogin(email,pass);
                    if(flag) {
                        Log.d("Auth Stat: ","Login successful");
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                        finish();
                    } else {
                        Toast.makeText(LoginActivity.this, "Authentication failed! Please enter valid credentials ", Toast.LENGTH_LONG).show();
                        etPass.setText("");
                        etEmail.setText("");
                    }
                }
            }
        });
    }

    // function to authenticate and login the user
    private boolean authenticateLogin(String email, String pass) {
        boolean flag=false;



        return flag;
    }
}