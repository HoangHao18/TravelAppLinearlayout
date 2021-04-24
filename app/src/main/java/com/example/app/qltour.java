package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class qltour extends AppCompatActivity {
    ImageButton btnThemTour;
    ImageButton btnThaoTac, btnThaoTac2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qltour);
        btnThemTour =  findViewById(R.id.btnThemTour);
        btnThemTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(qltour.this, ThemTour.class);
                startActivity(intent);

            }
        });

        btnThaoTac = findViewById(R.id.btnThaoTac);
        btnThaoTac.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {
//                DgThaoTac dialog = new DgThaoTac(qltour.this);
//                dialog.show();
                Intent intent = new Intent(qltour.this, SuaTour.class);
                startActivity(intent);
            }
        });

        btnThaoTac2 = findViewById(R.id.btnThaoTac2);
        btnThaoTac2.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {
//                DgThaoTac dialog = new DgThaoTac(qltour.this);
//                dialog.show();
                Intent intent = new Intent(qltour.this, SuaTour.class);
                startActivity(intent);
            }
        });


//        ArrayList<String> arrayThaoTac = new ArrayList<String>();
//        arrayThaoTac.add(">");
//        arrayThaoTac.add("Sửa");
//        arrayThaoTac.add("Xóa");
//
//        ArrayAdapter arrayAdapterThaoTac = new ArrayAdapter(this, R.layout.spinner_item, arrayThaoTac);
//        arrayAdapterThaoTac.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinnerThaoTac.setAdapter(arrayAdapterThaoTac);


    }
}