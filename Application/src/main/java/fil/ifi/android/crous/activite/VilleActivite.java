/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fil.ifi.android.crous.activite;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import fil.ifi.android.crous.R;
import fil.ifi.android.crous.entite.Ville;
import fil.ifi.android.crous.helper.DatabaseHelper;

import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;

import java.sql.SQLException;
import java.util.List;

/**
 * Simple one-activity app that takes a search term via the Action Bar
 * and uses it as a query to search the contacts database via the Contactables
 * table.
 */
public class VilleActivite extends OrmLiteBaseActivity<DatabaseHelper> {


    private ArrayAdapter<Ville> villeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_item_list);


        ListView listView = (ListView) findViewById(R.id.listview);
        List<Ville> villes;
        try {
            villes = getHelper().getVilleDao().queryForAll();
            villeAdapter = new ArrayAdapter<Ville>(this, android.R.layout.simple_list_item_1, villes);
            listView.setAdapter(villeAdapter);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(VilleActivite.this, RestauActivite.class);
                intent.putExtra("villeId", position+1);

                startActivity(intent);
            }

        });


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

                villeAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                villeAdapter.getFilter().filter(query);
                return false;
            }
        });

        return true;
    }
}
