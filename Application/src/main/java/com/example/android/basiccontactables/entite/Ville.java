package com.example.android.basiccontactables.entite;

import java.util.List;

/**
 * Created by RMS on 08/09/2015.
 */
public class Ville {

    private String nom;

    private List<Restau> listeRestau;

    public Ville(String nom, List<Restau> listeRestau){
        this.nom = nom;
        this.listeRestau = listeRestau;
    }

    public String getNom() {
        return nom;
    }

    public List<Restau> getListeRestau() {
        return listeRestau;
    }
}
