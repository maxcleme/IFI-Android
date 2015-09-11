package com.example.android.basiccontactables.data;

import android.provider.ContactsContract;

import com.example.android.basiccontactables.entite.Ville;
import com.example.android.basiccontactables.facotry.VilleFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by RMS on 08/09/2015.
 */
public class DataCROUS {


    public static List<Ville> getMap() {
        List<Ville> liste = new ArrayList<>();
        liste.add(VilleFactory.create("Arras", Arrays.asList(
                "R.U. d'Arras"
        )));
        liste.add(VilleFactory.create("Béthune", Arrays.asList(
                "R.U. Béthune"
        )));
        liste.add(VilleFactory.create("Boulogne sur Mer", Arrays.asList(
                "R.U. Boulogne"
        )));
        liste.add(VilleFactory.create("Calais", Arrays.asList(
                "R.U. de la Mi-Voix"
        )));
        liste.add(VilleFactory.create("Cambrai", Arrays.asList(
                "R.U. Le Rambouillet (à Cambrai)"
        )));
        liste.add(VilleFactory.create("Douai", Arrays.asList(
                "R.U. Douai"
        )));
        liste.add(VilleFactory.create("Dunkerque", Arrays.asList(
                "R.U. Dunkerque"
        )));
        liste.add(VilleFactory.create("Lens", Arrays.asList(
                "R.U. Lens"
        )));
        liste.add(VilleFactory.create("Lille", Arrays.asList(
                "R.U. Lille-Moulins (Lille Moulins)",
                "R.U. Châtillon (Lille Centre) ouvert midi et soir",
                "R.U. Châtelet (Lille CHR)",
                "R.U. Charles Debierre (Lille Mairie)",
                "Brasserie La Basoche (Lille Moulins)"
        )));
        liste.add(VilleFactory.create("Roubaix", Arrays.asList(
                "R.U. Crouy"
        )));
        liste.add(VilleFactory.create("Tourcoing", Arrays.asList(
                "R.U. Les Botaniques"
        )));
        liste.add(VilleFactory.create("Valenciennes", Arrays.asList(
                "Cafétéria FDEG",
                "cafeteria IUFM",
                "Cafétéria Fllash",
                "Cafétéria IUT",
                "Cafétéria Jules Mousseron",
                "R.U. Le Mont houy",
                "R.U. Le Mont houy II",
                "R.U. Ronzier"
        )));
        liste.add(VilleFactory.create("Villeneuve d'Ascq", Arrays.asList(
                "R.U. Flers (Lille III)",
                "Florès Café (Lille III)",
                "Brasserie Culturelle 'Les 3 Lacs' (Lille III)",
                "R.U. Le Recueil (Lille I)",
                "R.U. Barrois (Lille I)",
                "R.U. Pariselle (Lille I)",
                "R.U. Sully (Lille I)",
                "Le Cabaret du Sully (Lille I)"
        )));
        liste.add(VilleFactory.create("Loos", Arrays.asList(
                "R.U. L'Epi (CHR)"
        )));
        liste.add(VilleFactory.create("Longuenesse", Arrays.asList(
                "Bistro U"
        )));

        return liste;
    }


}
