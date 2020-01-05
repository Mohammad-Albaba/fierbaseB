package com.example.fierbaseb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    ArrayList<Movie> list;
    RecyclerView  recyclerView;
    MyRecyclerViewAdapter adapter;

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        recyclerView = view.findViewById(R.id.recycler);
        list=new ArrayList<>();
        adapter = new MyRecyclerViewAdapter(list,getContext() );
        recyclerView.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(manager);
        Movie movie1=new Movie();
        movie1.setmImags(R.drawable.s1);
        movie1.setmTexts("Jennifer");
        movie1.setmTexts2("2 hours ago");
        movie1.setmImags2(R.drawable.s2);
        movie1.setmTexts3("Tomorrow Land");
        movie1.setmTexts4("ACTIVE");
        movie1.setBtns("Join");
        movie1.setmTexts5("Going to Tomorrow land, looking for someone to join me on this epic journey through Tomorrow land");
        movie1.setmImags3(R.drawable.s3);
        movie1.setmImags4(R.drawable.s4);
        movie1.setMline("line");

        list.add(movie1);
       Movie movie11=new Movie();
        movie11.setmImags(R.drawable.s1);
        movie11.setmTexts("Jennifer");
        movie11.setmTexts2("3 hours ago");
        movie11.setmImags2(R.drawable.s2);
        movie11.setmTexts3("Tomorrow Land");
        movie11.setmTexts4("ACTIVE");
        movie11.setBtns("Join");
        movie11.setmTexts5("Going to Tomorrow land, looking for someone to join me on this epic journey through Tomorrow land");
        movie11.setmImags3(R.drawable.s3);
        movie11.setmImags4(R.drawable.s4);
        movie11.setMline("line");
        list.add(movie11);
         Movie movie111=new Movie();
        movie111.setmImags(R.drawable.s1);
        movie111.setmTexts("Jennifer");
        movie111.setmTexts2("4 hours ago");
        movie111.setmImags2(R.drawable.s2);
        movie111.setmTexts3("Tomorrow Land");
        movie111.setmTexts4("ACTIVE");
        movie111.setBtns("Join");
        movie111.setmTexts5("Going to Tomorrow land, looking for someone to join me on this epic journey through Tomorrow land");
        movie111.setmImags3(R.drawable.s3);
        movie111.setmImags4(R.drawable.s4);
        movie111.setMline("line");
        list.add(movie111);
        Movie movie1111=new Movie();
        movie1111.setmImags(R.drawable.s1);
        movie1111.setmTexts("Jennifer");
        movie1111.setmTexts2("5 hours ago");
        movie1111.setmImags2(R.drawable.s2);
        movie1111.setmTexts3("Tomorrow Land");
        movie1111.setmTexts4("ACTIVE");
        movie1111.setBtns("Join");
        movie1111.setmTexts5("Going to Tomorrow land, looking for someone to join me on this epic journey through Tomorrow land");
        movie1111.setmImags3(R.drawable.s3);
        movie1111.setmImags4(R.drawable.s4);
        movie1111.setMline("line");
        list.add(movie1111);
        adapter.notifyDataSetChanged();
        return view;

    }




}

























