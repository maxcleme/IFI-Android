package fil.ifi.android.crous.entite;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.List;

/**
 * Created by RMS on 08/09/2015.
 */

@DatabaseTable(tableName = "ville")
public class Ville {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private String nom;


    public Ville(){

    }

    public Ville(String nom){
        this.nom = nom;
    }


    @Override
    public String toString() {
        return nom;
    }
}
