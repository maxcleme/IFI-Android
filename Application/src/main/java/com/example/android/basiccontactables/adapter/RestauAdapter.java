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
public class RestauAdapter extends BaseAdapter {
    private Context context;
    private int villeID;

    public RestauAdapter(Context context, int villeID) {
        this.context = context;
        this.villeID = villeID;
    }

    @Override
    public int getCount() {
        return DataCROUS.getMap().get(villeID).getListeRestau().size();
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
        if (convertView == null) {
            view = new TextView(context);
        } else {
            view = (TextView) convertView;
        }

        view.setText(DataCROUS.getMap().get(villeID).getListeRestau().get(position).getNom());

        return view;
    }


}
