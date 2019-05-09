package com.jnova.windowsffcoach.adapter;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.jnova.windowsffcoach.R;
import com.jnova.windowsffcoach.models.Players;

public class PlayerAdapter extends FirestoreRecyclerAdapter<Players, PlayerAdapter.PlayerHolder> {


    public PlayerAdapter(@NonNull FirestoreRecyclerOptions<Players> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull PlayerHolder holder, int position, @NonNull Players model) {
        holder.textViewtitle.setText(model.getName());
        holder.textViewnumber.setText(String.valueOf(model.getNumber()));
    }

    @NonNull
    @Override
    public PlayerHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cards_players_item,
                viewGroup,false);
        return new PlayerHolder(v);
    }

    class PlayerHolder extends RecyclerView.ViewHolder{

        TextView textViewtitle,textViewnumber;
        Button buttonview;

        public PlayerHolder(@NonNull View itemView) {
            super(itemView);
            textViewtitle = itemView.findViewById(R.id.textview_title);
            buttonview = itemView.findViewById(R.id.button_view);
            textViewnumber = itemView.findViewById(R.id.textview_number);
        }
    }
}
