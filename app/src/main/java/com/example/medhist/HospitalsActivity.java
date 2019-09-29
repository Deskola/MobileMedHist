package com.example.medhist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HospitalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        List<Hospital> hospitals;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);

        hospitals = new ArrayList<>();
        hospitals.add(new Hospital("The Vegitarian","Categorie Hospital","Description book",R.drawable.thevigitarian));
        hospitals.add(new Hospital("The Wild Robot","Categorie Hospital","Description book",R.drawable.thewildrobot));
        hospitals.add(new Hospital("Maria Semples","Categorie Hospital","Description book",R.drawable.mariasemples));
        hospitals.add(new Hospital("The Martian","Categorie Hospital","Description book",R.drawable.themartian));
        hospitals.add(new Hospital("He Died with...","Categorie Hospital","Description book",R.drawable.hediedwith));
        hospitals.add(new Hospital("The Vegitarian","Categorie Hospital","Description book",R.drawable.thevigitarian));
        hospitals.add(new Hospital("The Wild Robot","Categorie Hospital","Description book",R.drawable.thewildrobot));
        hospitals.add(new Hospital("Maria Semples","Categorie Hospital","Description book",R.drawable.mariasemples));
        hospitals.add(new Hospital("The Martian","Categorie Hospital","Description book",R.drawable.themartian));
        hospitals.add(new Hospital("He Died with...","Categorie Hospital","Description book",R.drawable.hediedwith));
        hospitals.add(new Hospital("The Vegitarian","Categorie Hospital","Description book",R.drawable.thevigitarian));
        hospitals.add(new Hospital("The Wild Robot","Categorie Hospital","Description book",R.drawable.thewildrobot));
        hospitals.add(new Hospital("Maria Semples","Categorie Hospital","Description book",R.drawable.mariasemples));
        hospitals.add(new Hospital("The Martian","Categorie Hospital","Description book",R.drawable.themartian));
        hospitals.add(new Hospital("He Died with...","Categorie Hospital","Description book",R.drawable.hediedwith));

        RecyclerView myrv =  findViewById(R.id.recyclerview_id);
        HospitalAdapter myAdapter = new HospitalAdapter(this,hospitals);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}
