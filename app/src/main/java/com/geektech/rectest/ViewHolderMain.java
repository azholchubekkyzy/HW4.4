package com.geektech.rectest;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderMain extends RecyclerView.ViewHolder {
    TextView textViewName;

    public ViewHolderMain(@NonNull View itemView) {
        super(itemView);
        textViewName = itemView.findViewById(R.id.textViewName);
    }

    public void setTextViewName(TextView textViewName) {
        this.textViewName = textViewName;
    }

    public void onBind(String name){
        textViewName.setText(name);
    }
}