package com.geektech.rectest;

import android.content.ContentProviderClient;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import static android.icu.text.Collator.ReorderCodes.FIRST;
import static java.util.Calendar.SECOND;

public class AdapterMain extends RecyclerView.Adapter<ViewHolderMain> {
    private List<String> data = new ArrayList<>();
    private Button btnClick;

    public void addData(String data){
        this.data.add(data);
        notifyDataSetChanged();
    }

    public AdapterMain(List<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolderMain onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ViewHolderMain(inflater.inflate(R.layout.item_main, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMain holder, int position) {
        holder.onBind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }}

