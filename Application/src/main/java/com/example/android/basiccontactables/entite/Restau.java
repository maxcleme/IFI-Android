package com.example.android.basiccontactables.entite;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by RMS on 08/09/2015.
 */

@DatabaseTable(tableName = "restau")
public class Restau  {

    @DatabaseField(generatedId = true)
    private Long id;

    @DatabaseField
    private String nom;

    @DatabaseField
    private String description;

    @DatabaseField
    private String horraire;

    @DatabaseField
    private String adresse;

    @DatabaseField(foreign = true)
    private Ville ville;

    public Restau() {
    }

    public Restau(String nom, String description, String horraire, String adresse, Ville ville) {
        this.nom = nom;
        this.description = description;
        this.horraire = horraire;
        this.adresse = adresse;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Restau{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", horraire='" + horraire + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ville=" + ville +
                '}';
    }
}
