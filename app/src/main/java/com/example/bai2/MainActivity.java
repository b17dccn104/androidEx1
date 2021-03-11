package com.example.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main06);
        spinner=findViewById(R.id.spuni);
        String[] st={"PTIT","NEU","HUST","FTU"};
        ArrayAdapter<String > adapter=new ArrayAdapter<String >(this,
                android.R.layout.simple_spinner_item,st);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}