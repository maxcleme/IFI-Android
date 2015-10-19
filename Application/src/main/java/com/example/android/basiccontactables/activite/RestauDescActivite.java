package com.example.android.basiccontactables.activite;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.android.basiccontactables.R;
import com.example.android.basiccontactables.entite.Restau;
import com.example.android.basiccontactables.helper.DatabaseHelper;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;

import java.sql.SQLException;

/**
 * Created by wokei on 11/09/2015.
 */
public class RestauDescActivite  extends OrmLiteBaseActivity<DatabaseHelper> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the message from the intent
        Intent intent = getIntent();

        // Create the text view
        setContentView(R.layout.restau_desc);


        getActionBar().hide();

        TextView name = (TextView) findViewById(R.id.restauName);
        TextView tel = (TextView) findViewById(R.id.restauTel);
        TextView adresse = (TextView) findViewById(R.id.restauAdresse);
        TextView horraire = (TextView) findViewById(R.id.restauHorraire);
        TextView description = (TextView) findViewById(R.id.restauDescription);

        findViewById(R.id.buttonAdresse).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=50.2836246,2.7900558");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

      //  name.setText(DataCROUS.getMap().get(villeId).getListeRestau().get(restauId).getNom());
        try{
        Restau restau = getHelper().getRestauDao().queryForId(new Long(intent.getIntExtra("restauID", Integer.MIN_VALUE)));



        name.setText(restau.getNom());
        tel.setText(restau.getTelephone());
        adresse.setText(restau.getAdresse());
            horraire.setText(restau.getHorraire());
            description.setText(restau.getDescription());

        } catch (SQLException e) {
            e.printStackTrace();
        }


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
