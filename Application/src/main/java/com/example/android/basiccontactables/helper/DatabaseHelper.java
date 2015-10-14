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

            Ville ville = new Ville("Arras");
            villeDao.create(ville);
            restauDao.create(new Restau("R.U. d'Arras", "Nouveau : La cafétéria Arras propose un nouveau service de restauration en ligne. Gagnez du temps et commandez en ligne vos prestations de cafétéria site Crous Drive", "Ouvert de 11h00 à 13h45", "12 rue du Temple (Face à l'UFR d'histoire)", ville));

            villeDao.create(new Ville("Béthune"));
            villeDao.create(new Ville("Boulogne sur Mer"));
            villeDao.create(new Ville("Calais"));
            villeDao.create(new Ville("Cambrai"));
            villeDao.create(new Ville("Douai"));
            villeDao.create(new Ville("Dunkerque"));
            villeDao.create(new Ville("Lens"));
            villeDao.create(new Ville("Lille"));
            villeDao.create(new Ville("Roubaix"));
            villeDao.create(new Ville("Tourcoing"));
            villeDao.create(new Ville("Valenciennes"));
            villeDao.create(new Ville("Villeneuve d'Ascq"));
            villeDao.create(new Ville("Loos"));
            villeDao.create(new Ville("Longuenesse"));


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
