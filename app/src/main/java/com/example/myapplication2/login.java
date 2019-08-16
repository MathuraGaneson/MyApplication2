package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn = findViewById(R.id.simpleButton);
//        btn.setOnClickListener(new View.OnClickListener() {

//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(login.this, MainActivity.class));
//                Toast.makeText(getApplicationContext(), "TEST", LENGTH_SHORT).show();
//                finish();
//            }
//        });
    }
}



