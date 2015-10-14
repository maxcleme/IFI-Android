package com.example.android.basiccontactables.activite;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.example.android.basiccontactables.R;
import com.example.android.basiccontactables.entite.Restau;
import com.example.android.basiccontactables.helper.DatabaseHelper;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;

import java.sql.SQLException;
import java.util.List;

public class RestauActivite extends OrmLiteBaseActivity<DatabaseHelper> {

    private ArrayAdapter<Restau> restauAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_item_list);

        ListView listView = (ListView) findViewById(R.id.listview);
        final int villeId = getIntent().getIntExtra("villeId", Integer.MIN_VALUE);

        List<Restau> restaus;
        try {
            restaus = this.getHelper().getRestauDao().queryForEq("ville_id", villeId);
            restauAdapter = new ArrayAdapter<Restau>(this, android.R.layout.simple_list_item_1, restaus);
            listView.setAdapter(restauAdapter);
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
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                restauAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                restauAdapter.getFilter().filter(query);
                return false;
            }
        });

        return true;
    }
}
