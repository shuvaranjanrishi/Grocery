package com.shuvaranjanrishi.grocery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class RegisterSellerActivity extends AppCompatActivity {

    //UI Views
    private ImageButton backBtn, gpsBtn;
    private ImageView profileIv;
    private EditText nameEt, shopNameEt, phoneEt, deliveryFeeEt, countryEt, stateEt, cityEt, addressEt,
            emailEt, passwordEt, cPasswordEt;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_seller);


        //init ui views
        backBtn = findViewById(R.id.backBtn);
        gpsBtn = findViewById(R.id.gpsBtn);
        profileIv = findViewById(R.id.profileIv);
        nameEt = findViewById(R.id.nameEt);
        shopNameEt = findViewById(R.id.shopNameEt);
        phoneEt = findViewById(R.id.phoneEt);
        deliveryFeeEt = findViewById(R.id.deliveryFeeEt);
        countryEt = findViewById(R.id.countryEt);
        stateEt = findViewById(R.id.stateEt);
        cityEt = findViewById(R.id.cityEt);
        addressEt = findViewById(R.id.addressEt);
        emailEt = findViewById(R.id.emailEt);
        passwordEt = findViewById(R.id.passwordEt);
        cPasswordEt = findViewById(R.id.cPasswordEt);
        registerBtn = findViewById(R.id.registerBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        gpsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //detect current location
            }
        });

        profileIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pick image
            }
        });

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //register user
            }
        });
    }
}