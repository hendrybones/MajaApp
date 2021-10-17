package com.example.majaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationItemView bottomNavigationItemView;
    private  AllFragment allFragment;
    private  ClearFragment clearFragment;
    private  CatwFragment catwFragment;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AllFragment allFragment=new AllFragment();
        ClearFragment clearFragment=new ClearFragment();
        CatwFragment catwFragment=new CatwFragment();
        setFragment(allFragment);

        bottomNavigationItemView=findViewById(R.id.bottomBar);
        bottomNavigationItemView.setOnNavigationItemSelectedLsiener(new BottomNavigationItemView(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item){
                switch (item.getItemId()){
                    case R.id.all:
                        bottomNavigationItemView.setItemBackgroundResource(R.color.allBottom);
                        setFragment(allFragment);
                        return true;
                    case R.id.cat:
                        bottomNavigationItemView.setItemBackground(R.color.cat);
                        setFragment(clearFragment);
                        return true;
                    case R.id.catw:
                        bottomNavigationItemView.setItemBackground(R.id.catw);
                        setFragment(catwFragment);
                }
                return false;
            }
        });

    }
    public void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainframe,fragment);
        fragmentTransaction.commit();

    }
}