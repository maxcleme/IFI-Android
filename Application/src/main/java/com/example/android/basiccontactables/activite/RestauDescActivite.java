package com.example.android.basiccontactables.activite;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.widget.SearchView;

import com.example.android.basiccontactables.R;

/**
 * Created by wokei on 11/09/2015.
 */
public class RestauDescActivite extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        // Get the message from the intent
        Intent intent = getIntent();
        int restauId = intent.getIntExtra("restauId", MIN_VALUE);
        int villeId = intent.getIntExtra("villeId", MIN_VALUE);
        // Create the text view
        setContentView(R.layout.restau_desc);



        TextView name = (TextView) findViewById(R.id.restauName);
        TextView tel = (TextView) findViewById(R.id.restauTel);
        TextView adresse = (TextView) findViewById(R.id.restauAdresse);
        TextView horraire = (TextView) findViewById(R.id.restauHorraire);
        ImageView image = (ImageView) findViewById(R.id.restauImage);


        name.setText(DataCROUS.getMap().get(villeId).getListeRestau().get(restauId).getNom());

        tel.setText("03.20.16.45.31");
        adresse.setText("Angle des rues Massillon et Thumesnil\n" +
                "Place Déliot\n" +
                "Lille");
        horraire.setText("Du lundi au vendredi de 11h30 à 13h45");
        image.setImageResource(R.mipmap.restau);
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));

        return true;
    }
}
