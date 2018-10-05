package com.example.david.bottomnavigationview.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.david.bottomnavigationview.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BibliotecaFragment extends Fragment {


    public BibliotecaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_biblioteca, container, false);

        return v;
    }

}
