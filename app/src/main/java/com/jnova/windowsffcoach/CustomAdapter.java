package com.jnova.windowsffcoach;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jnova.windowsffcoach.files.CardData;
import com.jnova.windowsffcoach.models.CardsModel;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private ArrayList<CardsModel> dataSet;
    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cards_layout,viewGroup,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder( MyViewHolder myViewHolder, int i) {
        TextView textViewname = myViewHolder.textname;
        textViewname.setText(dataSet.get(i).getText());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textname;
        public MyViewHolder( View itemView) {
            super(itemView);
            this.textname= itemView.findViewById(R.id.info);
        }
    }

    public CustomAdapter(ArrayList<CardsModel> data){
        this.dataSet =data;
    }
}
