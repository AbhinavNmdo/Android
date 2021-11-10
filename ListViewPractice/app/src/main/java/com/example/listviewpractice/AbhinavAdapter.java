package com.example.listviewpractice;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AbhinavAdapter extends ArrayAdapter<String> {
    private String arr [];
    TextView textView;
    public static final String EXTRA_ITEM = "com.example.listviewpractice.EXTRA_ITEM";


    public AbhinavAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.arr = arr;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.abhinav_adapter, parent, false);
        TextView text = convertView.findViewById(R.id.textView2);
        text.setText(getItem(position));
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainActivity2.class);
                String onText = text.getText().toString();
                intent.putExtra(EXTRA_ITEM, onText);
                getContext().startActivity(intent);
            }
        });
        return convertView;
    }
}
