package com.example.contactbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details_Second_Activity extends AppCompatActivity {

    TextView ContactName,ContactNo;
    ImageView ContactImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_second);

        ContactName = findViewById(R.id.activity_details__second_contname);
        ContactNo = findViewById(R.id.activity_details__second_contno);
        ContactImg = findViewById(R.id.activity_details__second_imgview);

        int pos = getIntent().getIntExtra("Position",0);
        String[] ContName = getIntent().getStringArrayExtra("ConName");
        String[] ContNo = getIntent().getStringArrayExtra("ConNo");
        int[] ConImg = getIntent().getIntArrayExtra("Image");

        ContactName.setText(""+ContName[pos]);
        ContactNo.setText(""+ContNo[pos]);
        ContactImg.setImageResource(Integer.parseInt(""+ConImg[pos]));
    }
}