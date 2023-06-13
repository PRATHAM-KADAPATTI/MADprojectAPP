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
public class activity_recipient_profile extends AppCompatActivity {

    private TextView recName, recOrganReq, recBloogGrp, recGender, recPhNo, recEmail;

    Button ViewReport, SuperUrgentList, allocate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipient_profile);

        recName = findViewById(R.id.text_recName); //
        recOrganReq = findViewById(R.id.text_recOrganReq);  //
        recBloogGrp = findViewById(R.id.text_recBloogGrp); //
        recGender = findViewById(R.id.text_recGender);  //
        recPhNo = findViewById(R.id.text_recPhNo);
        recEmail = findViewById(R.id.text_recEmail);

        ViewReport = findViewById(R.id.btn_ViewReport);

        allocate = findViewById(R.id.btn_allocate);
        SuperUrgentList = findViewById(R.id.btn_SuperUrgentList);

        recName.setText(getIntent().getStringExtra("message1"));
        recGender.setText(getIntent().getStringExtra("message7"));
        recBloogGrp.setText(getIntent().getStringExtra("message2"));
        recOrganReq.setText(getIntent().getStringExtra("message8"));
        recPhNo.setText(getIntent().getStringExtra("message5"));
        recEmail.setText(getIntent().getStringExtra("message4"));

   //     ViewReport.setText(getIntent().getStringExtra("message6"));    ////////////////

        ViewReport.setOnClickListener((View.OnClickListener) this);
        SuperUrgentList.setOnClickListener((View.OnClickListener) this);
        allocate.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View v)
    {
        if(v.equals(ViewReport))
        {
            Intent it =  new Intent(this,WebActivity.class);
            startActivity(it);
        }
        else if(v.equals(SuperUrgentList))
        {
            Intent it =  new Intent(this,activity_urgent_list.class);
            startActivity(it);
        }
        else if(v.equals(allocate))
        {
            Intent it =  new Intent(this,activity_allocated_list.class);
            startActivity(it);
        }

    }

}