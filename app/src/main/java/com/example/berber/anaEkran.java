package com.example.berber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class anaEkran extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_ekran);
    }
    public void randevu(View view){
        Intent intent = new Intent(anaEkran.this,date.class);
        startActivity(intent);
    }
    public void ara(View view){
    Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:05383964617"));
    startActivity(intent);
    }
    public void konum(View view){
        Intent intent = new Intent(anaEkran.this,MapsActivity.class);
        startActivity(intent);
    }
}