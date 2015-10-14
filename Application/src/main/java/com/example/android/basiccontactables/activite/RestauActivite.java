package com.example.android.basiccontactables.activite;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.android.basiccontactables.R;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;

public class RestauActivite extends OrmLiteBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_item_list);

        ListView listView = (ListView) findViewById(R.id.listview);
        final int posVille = getIntent().getIntExtra("villeID", Integer.MIN_VALUE);

        /*
        TODO: Charger la liste des restau en fonction de l'id de la ville
         */

        listView.setAdapter(new RestauAdapter(this, posVille));
        /*
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(RestauActivite.this, "" + position,
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RestauActivite.this, RestauDescActivite.class);
                intent.putExtra("restauId", position);
                intent.putExtra("villeId", posVille);
                startActivity(intent);
            }

        });
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
