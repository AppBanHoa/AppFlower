package com.example.apporderflowers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainThanhToan extends AppCompatActivity {
    private TextView soLuong, donGia;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanhtoan);
        Button btn= findViewById(R.id.btnthanhtoan);
        soLuong = findViewById(R.id.soluong);
        donGia = findViewById(R.id.dongia);
        findViewById(R.id.btncong).setOnClickListener(v -> tangSoLuong());
        findViewById(R.id.btntru).setOnClickListener(v -> giamSoLuong());
        findViewById(R.id.btnthanhtoan).setOnClickListener(v -> thanhToan2());
    }

    private void thanhToan2() {
        startActivity(new Intent(this, MainThanhToan2.class));
    }

    private void giamSoLuong() {
        int so = 0;
        try {
            so = Integer.parseInt((String) soLuong.getText());
        } catch (Exception e) {
            Toast.makeText(this, "So luong loi", Toast.LENGTH_SHORT).show();
        }
        if (so > 1)
            so -= 1;
        soLuong.setText(so + "");
        donGia.setText(so * 1000000 + "VND");
    }

    private void tangSoLuong() {
        int so = 0;
        try {
            so = Integer.parseInt((String) soLuong.getText());
        } catch (Exception e) {
            Toast.makeText(this, "So luong loi", Toast.LENGTH_SHORT).show();
        }
        so += 1;
        soLuong.setText(so + "");
        donGia.setText(so * 1000000 + "VND");
    }
}
