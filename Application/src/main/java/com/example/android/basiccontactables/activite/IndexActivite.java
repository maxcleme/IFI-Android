package com.example.android.basiccontactables.activite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.android.basiccontactables.R;
import com.example.android.basiccontactables.entite.Ville;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by RMS on 18/10/2015.
 */
public class IndexActivite extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);

        getActionBar().hide();


        Button searchVille = (Button) findViewById(R.id.searchVilleButton);
        Button searchRestau = (Button) findViewById(R.id.searchRestauButton);

        searchVille.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivite.this, VilleActivite.class);
                startActivity(intent);
            }
        });

        searchRestau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivite.this, RestauActivite.class);
                startActivity(intent);
            }
        });

    }
}
