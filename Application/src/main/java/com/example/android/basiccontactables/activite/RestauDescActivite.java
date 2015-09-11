package com.example.android.basiccontactables.activite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.basiccontactables.R;
import com.example.android.basiccontactables.data.DataCROUS;

import static java.lang.Integer.MIN_VALUE;

/**
 * Created by wokei on 11/09/2015.
 */
public class RestauDescActivite extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the message from the intent
        Intent intent = getIntent();
        int restauId = intent.getIntExtra("restauId", MIN_VALUE);
        int villeId = intent.getIntExtra("villeId", MIN_VALUE);
        // Create the text view
        setContentView(R.layout.restau_desc);
        TextView t = (TextView) findViewById(R.id.restauName);
        t.setText(DataCROUS.getMap().get(villeId).getListeRestau().get(restauId).getNom());
    }
}
