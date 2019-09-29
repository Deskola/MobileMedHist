package com.example.medhist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class HospitalLoginActivity extends AppCompatActivity {
    private TextView tvtitle,tvdescription,tvcategory;
    private ImageView img;
    private EditText hospUseranme,hospPasssword;
    private Button hospLogBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_login);

        tvtitle =  findViewById(R.id.txttitle);
        //tvdescription = (TextView) findViewById(R.id.txtDesc);
        //tvcategory = (TextView) findViewById(R.id.txtCat);
        img = (ImageView) findViewById(R.id.bookthumbnail);
        hospUseranme = findViewById(R.id.hospitalUseername);
        hospPasssword = findViewById(R.id.hospitalPassword);
        hospLogBtn = findViewById(R.id.hospitalLoginButton);

        // Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail") ;

        // Setting values

        tvtitle.setText(Title);
       // tvdescription.setText(Description);
        img.setImageResource(image);

        hospLogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPateintinfo = new Intent(getApplicationContext(), PatientMedInfoActivity.class);
                startActivity(intentPateintinfo);
            }
        });
    }
}
