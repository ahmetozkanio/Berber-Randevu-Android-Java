package com.example.berber;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText sifre,kadi;
    TextView textView ;
    Button giris;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sifre = findViewById(R.id.sifre);
        kadi = findViewById(R.id.email);
        giris = findViewById(R.id.giris);
        textView = findViewById(R.id.kayit);
        firebaseAuth = FirebaseAuth.getInstance();

    }
    public void giris(View view){

        String s = sifre.getText().toString();
        String email = kadi.getText().toString();
        firebaseAuth.signInWithEmailAndPassword(email,s).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
            Toast.makeText(MainActivity.this,"Giris Yapildi",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,anaEkran.class);
                startActivity(intent);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(MainActivity.this,e.getLocalizedMessage().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
    public void kayit (View view){
        Intent intent = new Intent(MainActivity.this,kayit.class);
        startActivity(intent);

    }


}