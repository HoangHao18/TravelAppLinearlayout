package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class SuaTour extends AppCompatActivity {

    Spinner spinnerLoTrinhBatDau;
    Spinner spinnerLoTrinhKetThuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sua_tour);

        spinnerLoTrinhBatDau = (Spinner) findViewById(R.id.spinnerFrom);
        spinnerLoTrinhKetThuc = (Spinner) findViewById(R.id.spinnerTo);

        ArrayList<String> arrayDiaDiem = new ArrayList<String>();
        arrayDiaDiem.add("TP Hồ Chí Minh");
        arrayDiaDiem.add("Hà Nội");
        arrayDiaDiem.add("Đà Lạt");
        arrayDiaDiem.add("Vũng Tàu");
        arrayDiaDiem.add("Nha Trang");

        ArrayAdapter arrayAdapterDiaDiem = new ArrayAdapter(this, R.layout.spinner_item, arrayDiaDiem);
        arrayAdapterDiaDiem.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLoTrinhBatDau.setAdapter(arrayAdapterDiaDiem);
        spinnerLoTrinhKetThuc.setAdapter(arrayAdapterDiaDiem);
    }
}