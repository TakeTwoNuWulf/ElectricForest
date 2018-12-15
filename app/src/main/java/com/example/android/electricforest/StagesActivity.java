package com.example.android.electricforest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.electricforest.R;

public class StagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new SetListFragment())
                .commit();
    }
}