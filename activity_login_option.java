package com.example.madprojectapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class activity_login_option extends AppCompatActivity {

    Button btnDocLogin ;
    Button btnRecLogin ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_option);

        btnDocLogin = (Button) findViewById(R.id.btn_doc);
        btnRecLogin = (Button) findViewById(R.id.btn_doc);

//        now we are seeting what to happen on the button click
// First button

        btnDocLogin.setOnClickListener(this);
        btnRecLogin.setOnClickListener(this);
    }


//  @Override
    public void onClick(View v)
    {
        if(v.equals(btnDocLogin))
        {
            Intent it = new Intent(activity_login_option.this,activity_docter_login.class);
            startActivity(it);
        }
        else if(v.equals(btnRecLogin))
        {
            Intent it = new Intent(activity_login_option.this,activity_recipient_login.class);
            startActivity(it);
        }
    }


}