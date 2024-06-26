package com.example.networking;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "HTTPS_URL_TO_JSON_DATA_CHANGE_THIS_URL";
    private final String JSON_FILE = "mountains.json";
    private RecyclerViewAdapter adapter;

    private ArrayList<RecyclerViewItem> mountains;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mountains = new ArrayList<>();

        adapter = new RecyclerViewAdapter(this, mountains, item -> {
            Log.d("MainActivity", item.getTitle());
        });
        RecyclerView view = findViewById(R.id.recyclerView);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(adapter);



        new JsonFile(this, this).execute(JSON_FILE);
    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
    }

}
