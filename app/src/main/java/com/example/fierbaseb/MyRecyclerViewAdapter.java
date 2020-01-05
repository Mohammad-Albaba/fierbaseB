package com.example.fierbaseb;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    private ArrayList<Movie> mDataSet;
    private Context Context ;
    OnItemClickListener myItemClickListener;

    public MyRecyclerViewAdapter() {
    }

    //Constructor


    public MyRecyclerViewAdapter(ArrayList<Movie> mDataSet,Context context) {
        this.mDataSet = mDataSet;
        this.Context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mImags;
        TextView  mTexts;
        TextView mTexts2;
        ImageView mImags2;
        TextView mTexts3;
        TextView mTexts4;
        Button btns;
        TextView mTexts5;
        ImageView mImags3;
        ImageView mImags4;
        TextView mline;
        public ViewHolder(View v) {
            super(v);

             mImags=  v.findViewById(R.id.imgs);
            mTexts =  v.findViewById(R.id.texts);
            mTexts2 =  v.findViewById(R.id.texts2);
            mImags2 =  v.findViewById(R.id.imgs2);
            mTexts3 =  v.findViewById(R.id.texts3);
            mTexts4 =  v.findViewById(R.id.texts4);
            btns=  v.findViewById(R.id.btns);
            mTexts5 =  v.findViewById(R.id.texts5);
            mImags3 =  v.findViewById(R.id.imgs3);
            mImags4 = v.findViewById(R.id.imgs4);
            mline=  v.findViewById(R.id.line);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (myItemClickListener != null) {
                        myItemClickListener.onItemClick(v, getAdapterPosition());
                    }
                }
            });
        }

        }



    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
      holder.mTexts.setText(mDataSet.get(position).getmTexts());
      holder.mTexts2.setText(mDataSet.get(position).getmTexts2());
        holder.mTexts3.setText(mDataSet.get(position).getmTexts3());
        holder.mTexts4.setText(mDataSet.get(position).getmTexts4());
        holder.mTexts5.setText(mDataSet.get(position).getmTexts5());
        holder.mline.setText(mDataSet.get(position).getMline());
       Picasso.get().load(mDataSet.get(position).getmImags()).into(holder.mImags);
        Picasso.get().load(mDataSet.get(position).getmImags2()).into(holder.mImags2);
        Picasso.get().load(mDataSet.get(position).getmImags3()).into(holder.mImags3);
        Picasso.get().load(mDataSet.get(position).getmImags4()).into(holder.mImags4);

    }


    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    /* Listener for onClick on Movie Item */
    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.myItemClickListener = mItemClickListener;
    }

}