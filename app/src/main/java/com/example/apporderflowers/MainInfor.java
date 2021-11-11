package com.example.apporderflowers;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainInfor extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        findViewById(R.id.imageView).setOnClickListener(v -> thanhToan());
        findViewById(R.id.imageView2).setOnClickListener(v -> thanhToan());
        findViewById(R.id.imageView3).setOnClickListener(v -> thanhToan());

    }

    private void thanhToan() {
        startActivity(new Intent(this,MainThanhToan.class));
    }

}
