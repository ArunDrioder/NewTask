package com.example.newtask;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity{
    Activity activity;
    Context context;

    RecyclerView newRecyclerView;

    MyRecyclerViewAdapter myRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newRecyclerView = (RecyclerView)findViewById(R.id.newRecyclerView);

        myRecyclerViewAdapter = new MyRecyclerViewAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        newRecyclerView.setLayoutManager(linearLayoutManager);
        newRecyclerView.setAdapter(myRecyclerViewAdapter);

    }





}
