package com.example.dialog29032022;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnAlertDialog, btnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAlertDialog = findViewById(R.id.buttonOpenAlertDialog);
        btnDialog = findViewById(R.id.buttonOpenDialog);
        
    }
}
