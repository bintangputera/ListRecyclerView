package com.elapp.minggu4view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnListView;
    private Button btnRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnListView = findViewById(R.id.btn_list_view);
        btnRecyclerView = findViewById(R.id.btn_recycler_view);

        btnListView.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ListViewActivity.class)));
        btnRecyclerView.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class)));
    }
}