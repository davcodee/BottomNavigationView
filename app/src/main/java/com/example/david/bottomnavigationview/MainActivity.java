package com.example.david.bottomnavigationview;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.david.bottomnavigationview.Fragments.BibliotecaFragment;
import com.example.david.bottomnavigationview.Fragments.ExplorarFragment;
import com.example.david.bottomnavigationview.Fragments.InicioFragment;

public class MainActivity extends AppCompatActivity {

    public BottomNavigationView btmNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btmNavigationView = (BottomNavigationView)findViewById(R.id.btmNavigationView);
        btmNavigationView.setSelectedItemId(R.id.itemBiblioteca);


        btmNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected
                    (@NonNull MenuItem menuItem) {


                switch (menuItem.getItemId()){
                    case R.id.itemBiblioteca:
                        BibliotecaFragment bibliotecaFragment = new BibliotecaFragment();
                        getFragmentManager().beginTransaction().replace(R.id.container,bibliotecaFragment)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case R.id.itemInicio:
                        InicioFragment inicioFragment = new InicioFragment();
                        getFragmentManager().beginTransaction().replace(R.id.container, inicioFragment)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case R.id.itemExplorar:
                        ExplorarFragment explorarFragment = new ExplorarFragment();
                        getFragmentManager().beginTransaction()
                                .replace(R.id.container, explorarFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                }

                return true;
            }
        });

    }
}
