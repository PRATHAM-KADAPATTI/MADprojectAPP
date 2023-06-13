package com.example.madprojectapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class activity_docter_login extends AppCompatActivity {

    EditText editDocUser, editDocPass;
    Button btnSignin, btnSingup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docter_login);

        editDocUser = (EditText)findViewById(R.id.edit_docUser);
        editDocPass = (EditText)findViewById(R.id.edit_docPass);
        btnSignin = (Button)findViewById(R.id.btn_signin);
        btnSingup = (Button)findViewById(R.id.btn_singup);

        btnSignin.setOnClickListener(this);
        btnSingup.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        if(v.equals(btnSignin))
        {
            String msg1 = editDocUser.getText().toString();
            String msg2 = editDocPass.getText().toString();
            Intent it = new Intent(activity_docter_login.this,activity_dashboard.class);
            it.putExtra("message", msg1);
            it.putExtra("message", msg2);
            startActivity(it);
        }
        else if(v.equals(btnSingup))
        {
            Intent it = new Intent(activity_docter_login.this,activity_docter_register.class);
            startActivity(it);
        }
    }

}