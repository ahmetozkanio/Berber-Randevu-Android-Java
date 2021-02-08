package com.example.berber;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class kayit extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    EditText kadi,sifre,sifre2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit);
        sifre = findViewById(R.id.sifre);
        kadi = findViewById(R.id.email);
        sifre2 = findViewById(R.id.sifre2);

        firebaseAuth = FirebaseAuth.getInstance();
    }




    public void kayitol(View view){
        String s = sifre.getText().toString();
        String s2 = sifre2.getText().toString();
        String email = kadi.getText().toString();
        if (s.equals(s2)){

        firebaseAuth.createUserWithEmailAndPassword(email,s).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Toast.makeText(kayit.this,"Hesap Olusturuldu Giris Yapabilirsiniz",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(kayit.this,MainActivity.class);
                startActivity(intent);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(kayit.this,e.getLocalizedMessage().toString(),Toast.LENGTH_LONG).show();
            }
        });
        }
        else{Toast.makeText(kayit.this,"Sifre Uyusmuyor",Toast.LENGTH_LONG).show();}

    }
}