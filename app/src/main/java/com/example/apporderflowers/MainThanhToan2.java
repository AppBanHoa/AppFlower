package com.example.apporderflowers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainThanhToan2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanhtoan2);
        Button btn= findViewById(R.id.btnvetrangchu);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt= new Intent(getApplicationContext(), ListFlowers.class);
                startActivity(myInt);
            }
        });
        findViewById(R.id.btn_map).setOnClickListener(v -> viewMap());
    }

    private void viewMap() {
        startActivity(new Intent(this,MainGooglemap.class));
    }
}
