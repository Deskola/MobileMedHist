package com.example.medhist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainLoginActivity extends AppCompatActivity {
    private Button mainLoginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        mainLoginBtn = findViewById(R.id.appLoginButton);
        mainLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HospitalsActivity.class);
                startActivity(intent);
            }
        });
    }
}
