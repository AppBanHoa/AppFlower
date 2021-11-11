package com.example.apporderflowers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class MainActivity2 extends AppCompatActivity {

    private GoogleSignInClient mGoogleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        findViewById(R.id.logout).setOnClickListener(v -> signOut());
        findViewById(R.id.button).setOnClickListener(v -> viewInfo());
        findViewById(R.id.button2).setOnClickListener(v -> viewInfo());
        findViewById(R.id.button3).setOnClickListener(v -> viewInfo());
        findViewById(R.id.button4).setOnClickListener(v -> viewInfo());
    }

    private void viewInfo() {
        startActivity(new Intent(this,MainInfor.class));
    }

    private void signOut() {
        mGoogleSignInClient.signOut()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        logout();
                    }
                });
    }

    private void logout() {
        startActivity(new Intent(this,MainActivity.class));
    }
    }
