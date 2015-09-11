package com.example.android.basiccontactables.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.android.basiccontactables.data.DataCROUS;

/**
 * Created by RMS on 08/09/2015.
 */
public class VilleAdapter extends BaseAdapter {
    private Context context;

    public VilleAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return DataCROUS.getMap().size();
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
        TextView view;
        if ( convertView == null ){
            view = new TextView(context);
        }else{
            view = (TextView) convertView;
        }

        view.setText(DataCROUS.getMap().get(position).getNom());

        return view;
    }



}
