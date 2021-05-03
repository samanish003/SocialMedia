package com.example.socialmedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import com.example.socialmedia.Fragment.AddFragment;
import com.example.socialmedia.Fragment.HomeFragment;
import com.example.socialmedia.Fragment.NotificationFragment;
import com.example.socialmedia.Fragment.ProfileFragment;
import com.example.socialmedia.Fragment.SearchFragment;

import com.example.socialmedia.databinding.ActivityMainBinding;
import com.iammert.library.readablebottombar.ReadableBottomBar;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setSupportActionBar(binding.toolbar);
        MainActivity.this.setTitle("My profile");



        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        binding.toolbar.setVisibility(View.GONE);
        transaction.replace(R.id.container, new HomeFragment());
        transaction.commit();

        binding.readableBottomBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                switch (i){
                    case  0:
                        binding.toolbar.setVisibility(View.GONE);
                        transaction.replace(R.id.container, new HomeFragment());
                        break;


                    case  1:
                        binding.toolbar.setVisibility(View.GONE);
                        transaction.replace(R.id.container, new NotificationFragment());
                        break;
                    case  2:
                        binding.toolbar.setVisibility(View.GONE);
                        transaction.replace(R.id.container, new AddFragment());
                        break;

                    case  3:
                        binding.toolbar.setVisibility(View.GONE);
                        transaction.replace(R.id.container, new SearchFragment());
                        break;

                    case  4:
                        binding.toolbar.setVisibility(View.VISIBLE);
                        transaction.replace(R.id.container, new ProfileFragment());
                        break;
                }
                transaction.commit();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }
}