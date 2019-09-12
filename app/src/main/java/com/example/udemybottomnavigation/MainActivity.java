package com.example.udemybottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.widget.TextView;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{


    BottomNavigationView bottomNavigationView;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottonNavigation_id);
        txt = findViewById(R.id.text_id);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }//The last method onCreate


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int id = menuItem.getItemId();

        switch (id){
            case R.id.recents_id:
                txt.setText(getResources().getText(R.string.recents));
                return true;

            case R.id.favorites_id:
                txt.setText(getResources().getText(R.string.favorites));
                return true;

            case R.id.nearby_id:
                txt.setText(getResources().getText(R.string.near_by));
                return true;
        }


        return false;
    }
}//The last Class MainActivity
