package com.example.berber;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;

public class randevusecme extends AppCompatActivity {
        Button button;
        TextView textView,tarih;
        ToggleButton c930,c945,c10,c1015,c1030,c1045,c11,c1115,c1130,c1145,
                c12,c1215,c1230,c1245,c13,c1315,c1330,c1345,c14,c1415,c1430,c1445,c15,c1515,c1530,c1545
                ,c16,c1615,c1630,c1645,c17,c1715,c1730,c1745;
        private  FirebaseAuth firebaseAuth;
       private FirebaseFirestore firebaseFirestore;
        String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randevusecme);
        textView = findViewById(R.id.textView2);
        tarih = findViewById(R.id.tarih);
        button = findViewById(R.id.button);


        firebaseFirestore = firebaseFirestore.getInstance();
        firebaseAuth = firebaseAuth.getInstance();

        Bundle depo = getIntent().getExtras();
        if (depo != null) {

            String tarih1 = depo.getString("date");
            tarih.append(" " + tarih1);}
        else{
            tarih.setText("Tarihi Secmediniz");
        }
        c930 =findViewById(R.id.dokuz30);
        c945 =findViewById(R.id.dokuz45);
        c10 =findViewById(R.id.on); c1015 =findViewById(R.id.on15);c1030 =findViewById(R.id.on30);c1045 =findViewById(R.id.on45);
        c11 =findViewById(R.id.onbir); c1115 =findViewById(R.id.onbir15);c1130 =findViewById(R.id.onbir30);c1145 =findViewById(R.id.onbir45);
        c12 =findViewById(R.id.oniki); c1215 =findViewById(R.id.oniki15);c1230 =findViewById(R.id.oniki30);c1245 =findViewById(R.id.oniki45);
        c13 =findViewById(R.id.onuc); c1315 =findViewById(R.id.onuc15);c1330 =findViewById(R.id.onuc30);c1345 =findViewById(R.id.onuc45);
        c14 =findViewById(R.id.ondort); c1415 =findViewById(R.id.ondort15);c1430 =findViewById(R.id.ondort30);c1445 =findViewById(R.id.ondort45);
        c15 =findViewById(R.id.onbes); c1515 =findViewById(R.id.onbes15);c1530 =findViewById(R.id.onbes30);c1545 =findViewById(R.id.onbes45);
        c16 =findViewById(R.id.onalti); c1615 =findViewById(R.id.onalti15);c1630 =findViewById(R.id.onalti30);c1645 =findViewById(R.id.onalti45);
        c17 =findViewById(R.id.onyedi); c1715 =findViewById(R.id.onyedi15);c1730 =findViewById(R.id.onyedi30);c1745 =findViewById(R.id.onyedi45);



        c930.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c930.getText().toString();
                textView.setText(text);

            }
        });
        c945.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c945.getText().toString();
                textView.setText(text);

            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c10.getText().toString();
                textView.setText(text);

            }
        });
        c1015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1015.getText().toString();
                textView.setText(text);

            }
        });
        c1030.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1030.getText().toString();
                textView.setText(text);

            }
        });
        c1045.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1045.getText().toString();
                textView.setText(text);

            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c11.getText().toString();
                textView.setText(text);

            }
        });
        c1115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1115.getText().toString();
                textView.setText(text);

            }
        });
        c1130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1130.getText().toString();
                textView.setText(text);

            }
        });
        c1145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1145.getText().toString();
                textView.setText(text);

            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c12.getText().toString();
                textView.setText(text);

            }
        });
        c1215.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1215.getText().toString();
                textView.setText(text);

            }
        });
        c1230.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1230.getText().toString();
                textView.setText(text);

            }
        });
        c1245.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1245.getText().toString();
                textView.setText(text);

            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c13.getText().toString();
                textView.setText(text);

            }
        });
        c1315.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1315.getText().toString();
                textView.setText(text);

            }
        });
        c1330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1330.getText().toString();
                textView.setText(text);

            }
        });
        c1345.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1345.getText().toString();
                textView.setText(text);

            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c14.getText().toString();
                textView.setText(text);

            }
        });
        c1415.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1415.getText().toString();
                textView.setText(text);

            }
        });
        c1430.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1430.getText().toString();
                textView.setText(text);

            }
        });
        c1445.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1445.getText().toString();
                textView.setText(text);

            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c15.getText().toString();
                textView.setText(text);

            }
        });
        c1515.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1515.getText().toString();
                textView.setText(text);

            }
        });
        c1530.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1530.getText().toString();
                textView.setText(text);

            }
        });
        c1545.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1545.getText().toString();
                textView.setText(text);

            }
        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c16.getText().toString();
                textView.setText(text);

            }
        });
        c1615.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1615.getText().toString();
                textView.setText(text);

            }
        });
        c1630.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1630.getText().toString();
                textView.setText(text);

            }
        });
        c1645.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1645.getText().toString();
                textView.setText(text);

            }
        });
        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c17.getText().toString();
                textView.setText(text);

            }
        });
        c1715.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1715.getText().toString();
                textView.setText(text);

            }
        });
        c1730.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1730.getText().toString();
                textView.setText(text);

            }
        });
        c1745.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=c1745.getText().toString();
                textView.setText(text);

            }
        });
    }

    public void sec(View view){
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        String userEmail=firebaseUser.getEmail();
        HashMap<String,Object> randevuData= new HashMap<>();
        randevuData.put("useremail",userEmail);
        randevuData.put("date", tarih.getText().toString());
        randevuData.put("clock",textView.getText().toString());

       firebaseFirestore.collection("randevu").add(randevuData).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
           @Override
           public void onSuccess(DocumentReference documentReference) {
               Intent intent= new  Intent(randevusecme.this,anaEkran.class);
               Toast.makeText(randevusecme.this,"Randevunuz Onaylandi",Toast.LENGTH_LONG).show();
               startActivity(intent);
           }
       }).addOnFailureListener(new OnFailureListener() {
           @Override
           public void onFailure(@NonNull Exception e) {
               Toast.makeText(randevusecme.this,e.getLocalizedMessage().toString(),Toast.LENGTH_LONG).show();
           }
       });
    }


}