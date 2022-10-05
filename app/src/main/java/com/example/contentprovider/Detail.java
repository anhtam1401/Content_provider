package com.example.contentprovider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.contentprovider_linh.R;

public class Detail extends AppCompatActivity {
    TextView txtTen, txtPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtTen = (TextView) findViewById(R.id.textviewTen);
        txtPhone = (TextView) findViewById(R.id.textviewPhone);


        Intent intent = getIntent();
        String Ten = intent.getStringExtra("ten");
        txtTen.setText(Ten);

        String Noidung = intent.getStringExtra("phone");
        txtPhone.setText(Noidung);




    }
}
