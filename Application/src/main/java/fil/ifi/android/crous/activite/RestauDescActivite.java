package fil.ifi.android.crous.activite;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;

import fil.ifi.android.crous.R;
import fil.ifi.android.crous.entite.Restau;
import fil.ifi.android.crous.helper.DatabaseHelper;

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
        final Intent intent = getIntent();

        // Create the text view
        setContentView(R.layout.restau_desc);


        getActionBar().hide();

        TextView name = (TextView) findViewById(R.id.restauName);
        TextView tel = (TextView) findViewById(R.id.restauTel);
        TextView horraire = (TextView) findViewById(R.id.restauHorraire);
        TextView description = (TextView) findViewById(R.id.restauDescription);



      //  name.setText(DataCROUS.getMap().get(villeId).getListeRestau().get(restauId).getNom());
        try{
        final Restau restau = getHelper().getRestauDao().queryForId(new Long(intent.getIntExtra("restauID", Integer.MIN_VALUE)));



        name.setText(restau.getNom());
        tel.setText("\u260E"+restau.getTelephone());
            horraire.setText(restau.getHorraire());
            description.setText(restau.getDescription());

            findViewById(R.id.buttonAdresse).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri gmmIntentUri = Uri.parse("google.navigation:q="+restau.getAdresse());
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);
                }
            });

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
