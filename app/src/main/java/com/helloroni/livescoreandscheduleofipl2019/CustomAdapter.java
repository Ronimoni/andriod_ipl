package com.helloroni.livescoreandscheduleofipl2019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.livescoreandscheduleofipl2019.R;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String [] name;
    int [] flags;
    private LayoutInflater inflater;
    CustomAdapter(Context context, String[] name, int [] flags){
        this.context=context;
        this.name=name;
        this.flags=flags;
    }
    @Override
    public int getCount() {
        return name.length;
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
        if (convertView==null){
            inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.simple,parent,false);
        }
        ImageView imageView=(ImageView)convertView.findViewById(R.id.image);
        TextView textView=(TextView)convertView.findViewById(R.id.text);
        imageView.setImageResource(flags[position]);
        textView.setText(name[position]);
        return convertView;
    }
}
