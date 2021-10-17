package com.example.majaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationItemView bottomNavigationItemView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationItemView=findViewById(R.id.bottomBar);
        bottomNavigationItemView.setOnNavigationItemSelectedLsiener(new BottomNavigationItemView(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item){
                switch (item.getItemId()){
                    case R.id.all:
                        bottomNavigationItemView.setItemBackgroundResource(R.color.allBottom);
                        return true;
                    case R.id.cat:
                        bottomNavigationItemView.setItemBackground(R.color.cat);
                        return true;
                    case R.id.catw:
                        bottomNavigationItemView.setItemBackground(R.id.catw);
                }
                return false;
            }
        })

    }
}