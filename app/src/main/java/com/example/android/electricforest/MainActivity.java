package com.example.android.electricforest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout navDrawer;
    private ActionBarDrawerToggle acBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navDrawer = findViewById(R.id.nav_drawer);
        acBar = new ActionBarDrawerToggle(this, navDrawer, R.string.Open, R.string.Close);
        acBar.setDrawerIndicatorEnabled(true);




        navDrawer.addDrawerListener(acBar);
        acBar.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final NavigationView nav_view = findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                int id = item.getItemId();

                if (id == R.id.Stages) {
                    Intent setTimeIntent = new Intent( MainActivity.this, SetListFragment.class);
                    startActivity(setTimeIntent);
                    Toast.makeText(MainActivity.this, "SET TIMES", Toast.LENGTH_SHORT).show();

                }
                if (id == R.id.Artists) {
                    Toast.makeText(MainActivity.this, "ARTISTS", Toast.LENGTH_SHORT).show();
                }
                if (id == R.id.Concessions) {
                    Intent eventMapIntent = new Intent( MainActivity.this, EventMapActivity.class);
                    startActivity(eventMapIntent);
                    Toast.makeText(MainActivity.this, "EVENT MAP", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
    }



    public boolean onOptionsItemSelected(MenuItem item) {

        return acBar.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }



}
