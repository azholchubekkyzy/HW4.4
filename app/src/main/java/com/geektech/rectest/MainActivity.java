package com.geektech.rectest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnClick;
    private EditText editText;
    private RecyclerView recyclerView;
    private ArrayList<String> list = new ArrayList<>();
    private AdapterMain adapterMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializationViews();
        createRecycler();

        btnClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                list.add(editText.getText().toString());
                adapterMain.notifyDataSetChanged();
            }
        });
    }

    private void initializationViews() {
        btnClick = findViewById(R.id.btnClick);
        editText = findViewById(R.id.edit_main_name);

    }

    private void createRecycler() {
        recyclerView = findViewById(R.id.recycler_main);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapterMain = new AdapterMain(list);
        recyclerView.setAdapter(adapterMain);

    }



}