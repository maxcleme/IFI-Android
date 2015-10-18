package com.example.android.basiccontactables.entite;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by RMS on 08/09/2015.
 */

@DatabaseTable(tableName = "restau")
public class Restau  {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private String nom;

    @DatabaseField
    private String description;

    @DatabaseField
    private String horraire;

    @DatabaseField
    private String adresse;

    @DatabaseField
    private String telephone;

    @DatabaseField(foreign = true)
    private Ville ville;

    public Restau() {
    }

    public Restau(String nom, String description, String horraire, String adresse, String telephone, Ville ville) {
        this.nom = nom;
        this.description = description;
        this.horraire = horraire;
        this.adresse = adresse;
        this.telephone = telephone;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return nom;
    }
}
