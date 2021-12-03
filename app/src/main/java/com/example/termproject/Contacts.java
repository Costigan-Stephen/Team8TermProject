package com.example.termproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Contacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.icon_contact:
                        Intent c = new Intent(Contacts.this,Contacts.class);
                        startActivity(c);
                        break;
                    case R.id.icon_message:
                        Intent a = new Intent(Contacts.this,MessageList.class);
                        startActivity(a);
                        break;
                    case R.id.icon_settings:
                        Intent b = new Intent(Contacts.this,Settings.class);
                        startActivity(b);
                        break;
                }
                return false;
            }
        });
    }
}