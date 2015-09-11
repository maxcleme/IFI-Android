package com.example.android.basiccontactables.facotry;

import com.example.android.basiccontactables.entite.Restau;
import com.example.android.basiccontactables.entite.Ville;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RMS on 08/09/2015.
 */
public class VilleFactory {

    public static Ville create(String nom, List<String> listeNomRestau){
        List<Restau> transformList = new ArrayList<>();

        for ( String nomRestau : listeNomRestau ){
            transformList.add(new Restau(nomRestau));
        }
        return new Ville(nom, transformList);
    }


}
