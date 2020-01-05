package com.example.fierbaseb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.CollationElementIterator;
import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    ArrayList<MainActivity4> List;
    Context context;

    public Adapter() {
    }

    public Adapter(ArrayList<MainActivity4> list, Context context) {
        List = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.Spinner.setText(List.get(position).getMainActivity4());

    }

    @Override
    public int getItemCount() {
        return List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public CollationElementIterator Spinner;
        Spinner spinner;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            spinner = spinner.findViewById(R.id.spinner);


        }
    }
}

