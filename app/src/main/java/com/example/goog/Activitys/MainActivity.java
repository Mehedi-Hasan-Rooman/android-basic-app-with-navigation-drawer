package com.example.goog.Activitys;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.goog.Dialogs.Adult_Dialog;
import com.example.goog.Dialogs.Dialog_Donate;
import com.example.goog.Fragments.About_Fragment;
import com.example.goog.Fragments.Adult_Game_Fragment;
import com.example.goog.Fragments.Home_Fragment;
import com.example.goog.Fragments.Mobile_Game_Fragment;
import com.example.goog.Fragments.Paid_Game_Fragment;
import com.example.goog.Fragments.Trending_Game_Fragment;
import com.example.goog.R;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setUpToolbar();

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,
                    new Home_Fragment()).commit();

        }

        Navigatiion_view_setup();





    }



    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    private void Navigatiion_view_setup() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home_button:

                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Home_Fragment()).commit();
                        Toast.makeText(MainActivity.this, "Home clicked", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.TrendingGame:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Trending_Game_Fragment()).commit();
                        Toast.makeText(MainActivity.this, "Trending_Game_Click", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.Mobile_Game:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Mobile_Game_Fragment()).commit();
                        Toast.makeText(MainActivity.this, "Mobile_Game_Clicked", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.Paid_game:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Paid_Game_Fragment()).commit();
                        Toast.makeText(MainActivity.this, "Paid_Game_Clicked", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.Adult_game:
                        Open_Adult_Dialog();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Adult_Game_Fragment()).commit();
                        Toast.makeText(MainActivity.this, "Adult_Game_Clicked", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.About_app:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new About_Fragment()).commit();
                        Toast.makeText(MainActivity.this, "About_App", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.Donate_us:
                        openDialog();
                       // getSupportFragmentManager().beginTransaction().replace(R.id.container,new Donate_Fragment()).commit();
                        Toast.makeText(MainActivity.this, "Donate_Us", Toast.LENGTH_SHORT).show();
                        break;

                }

                return false;
            }
        });
    }

    private void Open_Adult_Dialog() {
        Adult_Dialog adult_dialog = new Adult_Dialog();
        adult_dialog.show(getSupportFragmentManager(),"Adult Dialog");
    }

    private void openDialog() {
        Dialog_Donate dialog_donate = new Dialog_Donate();
        dialog_donate.show(getSupportFragmentManager(),"Doante Dialog");
    }

    private void setUpToolbar() {
        navigationView = findViewById(R.id.navigation_bar);
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.Open, R.string.Close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();




    }
}
