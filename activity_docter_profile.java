package com.example.madprojectapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class activity_docter_profile extends AppCompatActivity {

    private TextView docName, Spec, HospName, docUsername;
    Button docLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docter_profile);

        docName = findViewById(R.id.text_docName); //
        Spec = findViewById(R.id.text_Spec);  //
        HospName = findViewById(R.id.text_HospName); //
        docUsername = findViewById(R.id.text_docUsername);

        docLogout = findViewById(R.id.btn_docLogout);

        docName.setText(getIntent().getStringExtra("message1"));
        Spec.setText(getIntent().getStringExtra("message5"));
        HospName.setText(getIntent().getStringExtra("message6"));
        docUsername.setText(getIntent().getStringExtra("message2"));

        docLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it =  new Intent(this,activity_docter_register.class);
                startActivity(it);
            }
        });
    }
}