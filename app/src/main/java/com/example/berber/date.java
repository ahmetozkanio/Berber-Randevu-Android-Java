package com.example.berber;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class date extends AppCompatActivity {
    Button button;
    CalendarView calendarView;
    TextView textView;
    String tarih;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        button =findViewById(R.id.button);
        textView = findViewById(R.id.textView3);
        calendarView = findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                tarih = (month+1) +"/"+dayOfMonth+"/"+year;
                textView.setText(tarih);
            }
        });
    }
    public void sec(View view){
        Intent intent= new Intent(date.this,randevusecme.class);
        intent.putExtra("date",tarih);
        startActivity(intent);
    }
}