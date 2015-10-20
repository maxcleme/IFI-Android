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
import fil.ifi.android.crous.entite.Restau;
import fil.ifi.android.crous.helper.DatabaseHelper;

import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;

import java.sql.SQLException;
import java.util.List;

public class RestauActivite extends OrmLiteBaseActivity<DatabaseHelper> {

    private ArrayAdapter<Restau> restauAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_item_list);

        final ListView listView = (ListView) findViewById(R.id.listview);
        final int villeId = getIntent().getIntExtra("villeId", Integer.MIN_VALUE);

        List<Restau> restaus;
            try {
            restaus = villeId == Integer.MIN_VALUE ? this.getHelper().getRestauDao().queryForAll() : this.getHelper().getRestauDao().queryForEq("ville_id", villeId);
            restauAdapter = new ArrayAdapter<Restau>(this, android.R.layout.simple_list_item_1, restaus);
            listView.setAdapter(restauAdapter);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Restau restau = (Restau) listView.getItemAtPosition(position);

                Intent intent = new Intent(RestauActivite.this, RestauDescActivite.class);
                intent.putExtra("restauID", restau.getId());

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
