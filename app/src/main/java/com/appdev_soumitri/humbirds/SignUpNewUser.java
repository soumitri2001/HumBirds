package com.appdev_soumitri.humbirds;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.gms.common.SignInButton;

import org.w3c.dom.Text;

public class SignUpNewUser extends AppCompatActivity {

    private EditText etEmail,etPass,etAge,etName;
    private RadioGroup gender;
    private RadioButton M,F,O;
    private TextView loginText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_new_user);

        ActionBar actionBar=getSupportActionBar();
        assert actionBar!=null;
        actionBar.setTitle("Sign Up");

        loginText=findViewById(R.id.loginText);

        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Action: ","user chooses to login");
                startActivity(new Intent(SignUpNewUser.this,LoginActivity.class));
                finish();
            }
        });

        etName=findViewById(R.id.etNameNew);
        etAge=findViewById(R.id.etAgeNew);
        etEmail=findViewById(R.id.etEmailNew);
        etPass=findViewById(R.id.etPassNew);
        gender=findViewById(R.id.gender);
        M=findViewById(R.id.male);
        F=findViewById(R.id.female);
        O=findViewById(R.id.other);



    }
}