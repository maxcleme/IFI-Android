package com.example.android.basiccontactables.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.android.basiccontactables.entite.Restau;
import com.example.android.basiccontactables.entite.Ville;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by RMS on 14/09/2015.
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "crous";
    private static final int DATABASE_VERSION = 4;

    private Dao<Ville, Long> villeDao;
    private Dao<Restau, Long> restauDao;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Ville.class);
            TableUtils.createTable(connectionSource, Restau.class);

            Dao<Ville, Long> villeDao = this.getVilleDao();
            Dao<Restau, Long> restauDao = this.getRestauDao();

            Ville ville;

            ville = new Ville("Arras");
            villeDao.create(ville);
            restauDao.create(new Restau(
                    "RU d'Arras",
                    "Restauration traditionnelle, paiement par Carte CROUS et carte multiservices",
                    "11h00 à 13h45",
                    "50.2836246,2.7900558",
                    "0321508182",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria du RU d'Arras",
                    "La cafétéria Arras propose un nouveau service de restauration en ligne. Gagnez du temps et commandez en ligne vos prestations de cafétéria site Crous Drive, paiement par Carte CROUS et carte multiservices",
                    "08h30 à 15h30",
                    "50.2836246,2.7900558",
                    "0321508182",
                    ville));

            ville = new Ville("Bethune");
            villeDao.create(ville);
            restauDao.create(new Restau(
                    "RU Svhweitzer",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "11h30 à 13h30 et de 19h00 à 20h30",
                    "50.5162147,2.6584537",
                    "0321573187",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria du RU Svhweitzer",
                    "Paiement par Carte Multiservices",
                    "07h30 à 14h00 et de 18h30 à 20h30",
                    "50.5162147,2.6584537",
                    "0321573187",
                    ville));

            ville = new Ville("Boulogne sur Mer");
            villeDao.create(ville);
            restauDao.create(new Restau(
                    "RU de Boulogne sur Mer",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "11h15 à 13h45",
                    "50.726737,1.6044941",
                    "0321336570",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria du RU de Boulogne sur Mer",
                    "Paiement par Carte Multiservices",
                    "11h00 à 15h00",
                    "50.726737,1.6044941",
                    "0321336570",
                    ville));


            ville = new Ville("Calais");
            villeDao.create(ville);
            restauDao.create(new Restau(
                    "RU de la Mi-Voix",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "11h15 à 14h00",
                    "50.9525899,1.8789302",
                    "0321971740",
                    ville));

            ville =new Ville("Cambrai");
            villeDao.create(ville);
            restauDao.create(new Restau(
                    "RU le Rambouillet",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "11h30 à 13h30",
                    "50.1880039,3.2409437",
                    "0327748358",
                    ville));

            ville =new Ville("Douai");
            villeDao.create(ville);
            restauDao.create(new Restau(
                    "RU de Douai",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "11h30 à 13h30",
                    "50.3739077,3.0705391",
                    "0327713290",
                    ville));

            ville =new Ville("Dunkerque");
            villeDao.create(ville);
            restauDao.create(new Restau(
                    "RU de Dunkerque",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "11h30 à 13h45",
                    "51.0360783,2.3690785",
                    "0328662826",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria du RU de Dunkerque",
                    "Paiement par Carte Multiservices",
                    "11h30 à 14h00",
                    "51.0360783,2.3690785",
                    "0328662826",
                    ville));


            ville =new Ville("Lens");
            villeDao.create(ville);
            restauDao.create(new Restau(
                    "RU de Lens",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "11h15 à 13h30",
                    "50.4348287,2.824084",
                    "0321430997",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria du RU de Lens",
                    "Paiement par Carte Multiservices",
                    "11h00 à 14h00",
                    "50.4348287,2.824084",
                    "0321430997",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria IUT de Lens",
                    "Paiement par Carte Multiservices",
                    "11h00 à 14h00",
                    "50.4348287,2.824084",
                    "0321430997",
                    ville));

            ville =new Ville("Lille");
            villeDao.create(ville);
            restauDao.create(new Restau(
                    "RU Lille-Moulins",
                    "Restauration traditionnelle, salle pour les étudiants / salle pour les personnels, paiement par Carte Multiservices",
                    "11h30 à 13h45",
                    "50.6191443,3.0664598",
                    "0320164531",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria Sciences Politique",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "10h00 à 14h00",
                    "50.6230192,3.0753539",
                    "0320164531",
                    ville));
            restauDao.create(new Restau(
                    "Brasserie La Basoche",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "07h30 à 15h30 (15h00 le mercredi)",
                    "50.6205551,3.068542",
                    "0320164531",
                    ville));
            restauDao.create(new Restau(
                    "RU Chatillon",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "Midi et soir (sauf le vendredi soir) \n" + "Lundi au vendredi de 11h30 à 13h45\n" + "Lundi au jeudi de 18h30 à 20h00",
                    "50.6295008,3.0624919",
                    "0328380014",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria des sports",
                    "Paiement par Carte Multiservices",
                    "Lundi, mardi et vendredi de 08h00 à 15h00 \n" +
                            "Mercredi et jeudi de 08h00 à 20h00 ",
                    "50.6138666,3.0784047",
                    "0328380014",
                    ville));
            restauDao.create(new Restau(
                    "RU Chatelet",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "Lundi au vendredi de 11h30 à 13h30",
                    "50.6133782,3.0325097",
                    "0320861094",
                    ville));
            restauDao.create(new Restau(
                    "Sandwicherie du RU Chatelet",
                    "Paiement par Carte Multiservices",
                    "11h30 à 13h30",
                    "50.6133782,3.0325097",
                    "0320861094",
                    ville));
            restauDao.create(new Restau(
                    "RU Charles Debierres",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "Lundi au vendredi de 11h30 à 14h00",
                    "50.632038,3.0717299",
                    "0320181720",
                    ville));

            ville =new Ville("Roubaix");
            villeDao.create(ville);
            restauDao.create(new Restau(
                    "RU Crouy",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "11h00 à 13h30",
                    "Ilôt Crouy - 36 rue de Crouy ( Métro Charles De Gaulle )",
                    "0320738824",
                    ville));
            restauDao.create(new Restau(
                    "Sandwicherie du RU Crouy",
                    "Paiement par Carte Multiservices",
                    "11h00 à 14h00",
                    "Ilôt Crouy - 36 rue de Crouy ( Métro Charles De Gaulle )",
                    "0320738824",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria ENSAIT",
                    "Paiement par Carte Multiservices",
                    "8h30 à 14h30",
                    "9 rue de l'Ermitage",
                    "0320738824",
                    ville));

            ville =new Ville("Tourcoing");
            villeDao.create(ville);
            restauDao.create(new Restau(
                    "RU Les Botaniques",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "11h00 à 14h00",
                    "49, rue Sainte Barbe ( Métro Tourcoing Centre )",
                    "0320245381",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria IUT B",
                    "Paiement par Carte Multiservices",
                    "09h00 à 14h30",
                    "49, rue Sainte Barbe ( Métro Tourcoing Centre )",
                    "0320245381",
                    ville));

            ville =new Ville("Valenciennes");
            villeDao.create(ville);
            restauDao.create(new Restau(
                    "Cafeteria Jules Mousseron",
                    "La cafétéria est située dans l'enceinte même de la résidence Jules Mousseron, au rez de chaussée",
                    "07h30 à 21h45",
                    "Résidence universitaire Mousseron - Rue du chemin vert",
                    "",
                    ville));
            restauDao.create(new Restau(
                    "RU Mont Houy",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "11h15 à 13h30",
                    "Campus Universitaire Le Mont Houy 1 Rue du Chemin vert ",
                    "0327466909",
                    ville));
            restauDao.create(new Restau(
                    "Brasserie du RU Mont Houy",
                    "Paiement par Carte Multiservices",
                    "09h00 à 10h30 et de 11h00 à 15h00",
                    "Campus Universitaire Le Mont Houy 1 Rue du Chemin vert ",
                    "0327466909",
                    ville));
            restauDao.create(new Restau(
                    "RU Mont Houy II",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "11h15 à 13h30",
                    "Domaine universitaire",
                    "0327427003",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria FLLASH",
                    "Paiement par Carte Multiservices",
                    "09h00 à 16h00 (sauf jeudi et vendredi, 14h30) ",
                    "Domaine universitaire",
                    "0327427003",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria IUFM",
                    "Paiement par Carte Multiservices",
                    "08h30 à 14h00",
                    "Domaine universitaire",
                    "0327427003",
                    ville));
            restauDao.create(new Restau(
                    "RU Ronzier",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "11h15 à 13h30",
                    "Boulevard Harpignies",
                    "0327295614",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria FDEG",
                    "Paiement par Carte Multiservices",
                    "09h00 à 16h00",
                    "Boulevard Harpignies",
                    "0327295614",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria Ronzier",
                    "Paiement par Carte Multiservices",
                    "11h00 à 14h00",
                    "Boulevard Harpignies",
                    "0327295614",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria IUT de Valencienne",
                    "Paiement par Carte Multiservices",
                    "09h00 à 16h00",
                    "Boulevard Harpignies",
                    "0327295614",
                    ville));


            ville =new Ville("Villeneuve d'Ascq");
            villeDao.create(ville);
            restauDao.create(new Restau(
                    "RU Le Forum",
                    "Pates et pizzas sur place ou à emporter, paiement par Carte Multiservices",
                    "11h30 à 14h00",
                    "Lille III, situé devant la BU ",
                    "0327295614",
                    ville));
            restauDao.create(new Restau(
                    "Le Flores Cafe",
                    "Dans une ambiance conviviale venez découvrir les prestations diversifiées de ce café avec terrasse donnant sur le forum, paiement par Carte Multiservices",
                    "08h00 à 19h00",
                    "Lille III, situé devant la BU ",
                    "0327295614",
                    ville));
            restauDao.create(new Restau(
                    "Sandwicherie Lille III",
                    "Des sandwichs frais et variés, des crudités, des desserts le tout à emporter Nouveau : service de commande en ligne, paiement par Carte Multiservices",
                    "10h30 à 14h00",
                    "Lille III, situé devant la BU ",
                    "0327295614",
                    ville));
            restauDao.create(new Restau(
                    "Brasserie Les 3 lacs",
                    "La brasserie propose une carte complete du plat cuisiné au sandwich et à la salade composée, paiement par Carte Multiservices",
                    "10h00 à 15h00",
                    "Hall d’accueil de Lille III",
                    "0327295614",
                    ville));
            restauDao.create(new Restau(
                    "Le Tout frais léger",
                    "Ilot de fraicheur et de legerté, découvrez les salades maison, les sandwichs équilibrés le tout en étant allégé, paiement par Carte Multiservices",
                    "10h00 à 15h00",
                    "Hall d’accueil de Lille III",
                    "0327295614",
                    ville));
            restauDao.create(new Restau(
                    "Crous Gourmand",
                    "Offrez vous un instant gourmand, petits déjeuners, viennoiseries, sandwicheries, prestations à emporter ou à manger sur la terrasse, paiement par Carte Multiservices",
                    "08h00 à 15h00",
                    "Hall du bâtiment B de Lille III",
                    "0327295614",
                    ville));
            restauDao.create(new Restau(
                    "La Pastella",
                    "Venez découvrir la pastella, ses pâtes fraîches et sauces variées mais également des viennoiseries et sandwiches à emporter, paiement par Carte Multiservices",
                    "09h00 à 14h30",
                    "Bâtiment A de Lille III à côté des Passerelles",
                    "0327295614",
                    ville));
            restauDao.create(new Restau(
                    "RU Barrois",
                    "3 salles hôtelières à disposition, paiement par Carte Multiservices",
                    "11h15 à 13h30 du lundi au vendredi\n" +
                            "12h à 13h30 le samedi",
                    "Cité Scientifique, Lille I",
                    "0320336123",
                    ville));
            restauDao.create(new Restau(
                    "Sandwicherie du RU Barrois",
                    "Vente à emporter : sachets-repas, sandwichs, paninis, croques, pizzas ..., La sandwicherie Barrois propose un nouveau service de restauration en ligne. Gagnez du temps et commandez en ligne vos prestations de cafétéria site Crous Drive ",
                    "10h00 à 14h15",
                    "Cité Scientifique, Lille I, dans l'enceinte du RU Barrois",
                    "0320336123",
                    ville));
            restauDao.create(new Restau(
                    "Cafeteria Recueil",
                    "Paiement par Carte Multiservices",
                    "09h00 à 14h00",
                    "21 rue de la recherche à Villeneuve d'Ascq",
                    "0320336123",
                    ville));
            restauDao.create(new Restau(
                    "Mini R",
                    "Paiement par Carte Multiservices",
                    "7h30 à 14h30",
                    "",
                    "0320336123",
                    ville));
            restauDao.create(new Restau(
                    "RU Pariselle",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "11h15 à 13h40",
                    "Cité Scientifique - Boulevard Langevin A proximité des résidences Galois et Vinci et des bâtiments de Sciences naturelles et Chimie",
                    "0320434385",
                    ville));
            restauDao.create(new Restau(
                    "La Pasteria",
                    "Des pâtes fraîches fabriquées sur place, servies en box avec 3 sauces au choix, mais aussi des bruschetta (tartines à l’italienne), des plats gratinés, des sandwichs américains, des salades, des pâtisseries, desserts maison ... à emporter ou à consommer sur place, paiement par Carte Multiservices",
                    "11h15 à 13h30",
                    "Cité Scientifique - Boulevard Langevin A proximité des résidences Galois et Vinci et des bâtiments de Sciences naturelles et Chimie",
                    "0320434385",
                    ville));
            restauDao.create(new Restau(
                    "Sandwicherie du RU Pariselle",
                    "Formule sur le pouce” : Sandwiches et Sachets-repas (1 sandwich / 1 boisson et un laitage ou fruit ou dessert), panini, wraps, pizza sandwich, bagels, assiettes froides et toute une gamme de desserts, à emporter ou à consommer sur place, paiement par Carte Multiservices",
                    "11h à 13h40",
                    "Cité Scientifique - Boulevard Langevin A proximité des résidences Galois et Vinci et des bâtiments de Sciences naturelles et Chimie",
                    "0320434385",
                    ville));
            restauDao.create(new Restau(
                    "Le Kiosk",
                    "formule sachets-repas”, pâtes à emporter et la spécialité du jour. Assiette froide à la belle saison, paiement par Carte Multiservices",
                    "11h15 à 13h40",
                    "IUT A, Lille 1",
                    "0320434385",
                    ville));
            restauDao.create(new Restau(
                    "RU Sully",
                    "Chaque jour, l'équipe du Sully vous reçoit le midi, dans 2 belles salles lumineuses et au travers de comptoirs chauds et froids et de salad’bars, pour vous faire découvrir ses plats traditionnels variés, ses pâtes fraîches, ses pizzas maison et un vaste choix d’entrées et pâtisseries confectionnées sur place, paiement par Carte Multiservices",
                    "11h30 à 13h",
                    "Cité Scientifique Boulevard Paul Langevin",
                    "0320434451",
                    ville));
            restauDao.create(new Restau(
                    "Cafétéria SN1",
                    "Paiement par Carte Multiservices",
                    "10h00 à 13h30",
                    "Bâtiment SN1 a l'UFR de Biologie au RDC",
                    "0320434385",
                    ville));
            restauDao.create(new Restau(
                    "Cafétéria DESS",
                    "Paiement par Carte Multiservices",
                    "10h00 à 13h30",
                    "Bâtiment d’enseignement pour les Masters \"MASTER\" ex.DESS - à côté de Télécom Lille",
                    "0320434385",
                    ville));
            restauDao.create(new Restau(
                    "Cafétéria SUP SUAIO",
                    "Paiement par Carte Multiservices",
                    "10h00 à 13h30",
                    "Bâtiment SUP SUAIO, face à la MACC",
                    "0320434385",
                    ville));
            restauDao.create(new Restau(
                    "Sully Cabaret",
                    "Vente à emporter de sachets-repas, sandwichs, quiches, pizzas, viennoiseries, boissons froides et chaudes, paiement par Carte Multiservices, Le cabaret du sully propose chaque mercredi à partir de 21h une programmation culturelle",
                    "11h30 à 20h30",
                    "Bâtiment SUP SUAIO, face à la MACC",
                    "0320434385",
                    ville));

            ville =new Ville("Loos");
            villeDao.create(ville);
            restauDao.create(new Restau(
                    "RU L'Epi",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "11h30 à 13h30 et du lundi au jeudi de 18h30 à 20h00 (octobre à fin avril) ",
                    "Rue Eugène Avinée \n" +
                            "A droite de la Fac de Médecine H. Warembourg \n",
                    "0320169310",
                    ville));
            restauDao.create(new Restau(
                    "Salle du personnel",
                    "Paiement par Carte Multiservices",
                    "11h30 à 13h30",
                    "Rue Eugène Avinée \n" +
                            "A droite de la Fac de Médecine H. Warembourg \n",
                    "0320169310",
                    ville));
            restauDao.create(new Restau(
                    "Sandwicherie du RU L'Epi",
                    "Paiement par Carte Multiservices",
                    "11h30 à 13h30 et de 18h30 à 20h45 (septembre à fin juin)",
                    "Rue Eugène Avinée \n" +
                            "A droite de la Fac de Médecine H. Warembourg \n",
                    "0320169310",
                    ville));

            ville =new Ville("Longuenesse");
            villeDao.create(ville);
            restauDao.create(new Restau(
                    "Bistro U",
                    "Restauration traditionnelle, paiement par Carte Multiservices",
                    "11h15 à 13h45",
                    "Au sein de l'Université Descartes",
                    "0321111976",
                    ville));


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, Ville.class, false);
            TableUtils.dropTable(connectionSource, Restau.class, false);
            onCreate(database, connectionSource);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Dao<Ville, Long> getVilleDao() throws SQLException {
        if (villeDao == null) {
            villeDao = getDao(Ville.class);
        }
        return villeDao;
    }

    public Dao<Restau, Long> getRestauDao() throws SQLException {
        if (restauDao == null) {
            restauDao = getDao(Restau.class);
        }
        return restauDao;
    }


}
