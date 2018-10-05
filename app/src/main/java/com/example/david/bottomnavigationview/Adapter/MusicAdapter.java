package com.example.david.bottomnavigationview.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicAdapterHolder> {


    @NonNull
    @Override
    public MusicAdapterHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {



        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MusicAdapterHolder musicAdapterHolder, int i) {
        
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MusicAdapterHolder extends RecyclerView.ViewHolder{

        public MusicAdapterHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
