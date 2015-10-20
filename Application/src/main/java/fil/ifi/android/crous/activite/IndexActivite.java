package fil.ifi.android.crous.activite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fil.ifi.android.crous.R;

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
