package com.example.aliothman.designtask.adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aliothman.designtask.R;
import com.example.aliothman.designtask.models.model;

import java.util.List;

public class Adaptor_wait extends BaseAdapter {
    Context context;
    List<model> strings;

    public Adaptor_wait(Context context, List<model> strings) {
        this.context = context;
        this.strings = strings;
    }

    @Override
    public int getCount() {
        return strings.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);
        final model model = strings.get(position);
        TextView texttittle = convertView.findViewById(R.id.tittle);
        texttittle.setText(model.getText());
        ImageView imageView = convertView.findViewById(R.id.cir_view);
        return convertView;
    }
}
