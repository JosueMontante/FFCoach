package com.jnova.windowsffcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.jnova.windowsffcoach.adapter.PlayerAdapter;
import com.jnova.windowsffcoach.models.Players;

public class ActivitySelectTeam extends AppCompatActivity {
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference noteboolRef = db.collection("Jugador");
    private static final String TAG = "MyActivitySelecteam";
    private PlayerAdapter adapter;
    Button continuebutton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_team);

        continuebutton = findViewById(R.id.btn_selectteam);
 /*
        db.collection("Jugador").get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()){
                            for (QueryDocumentSnapshot document :task.getResult()) {
                                Log.d(TAG, document.getId()+ "=>" +document.getData());
                            }
                        }else {
                            Log.w(TAG,"Err",task.getException());
                        }
                    }
                }); */
        setUpRecyclerView();
        continuebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivitySelectTeam.this,SelectTeamOff.class));
            }
        });
    }

    private void setUpRecyclerView(){
       // Query query = noteboolRef.orderBy("number", Query.Direction.DESCENDING);
        Query query = noteboolRef.whereEqualTo("name", "Aimee");


        FirestoreRecyclerOptions<Players> options = new FirestoreRecyclerOptions.Builder<Players>()
                .setQuery(query,Players.class)
                .build();

        adapter = new PlayerAdapter(options);
        RecyclerView recyclerView = findViewById(R.id.recyclerteam);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}
