package com.example.android.basiccontactables.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.android.basiccontactables.R;
import com.example.android.basiccontactables.entite.Ville;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by RMS on 14/09/2015.
 */
public class VilleHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "crous";
    private static final int DATABASE_VERSION = 1;

    private Dao<Ville, Long> VilleDao;

    public VilleHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Ville.class);

            Dao<Ville, Long> dao = this.getDao(Ville.class);

            dao.create(new Ville("Arras"));
            dao.create(new Ville("Béthune"));
            dao.create(new Ville("Boulogne sur Mer"));
            dao.create(new Ville("Calais"));
            dao.create(new Ville("Cambrai"));
            dao.create(new Ville("Douai"));
            dao.create(new Ville("Dunkerque"));
            dao.create(new Ville("Lens"));
            dao.create(new Ville("Lille"));
            dao.create(new Ville("Roubaix"));
            dao.create(new Ville("Tourcoing"));
            dao.create(new Ville("Valenciennes"));
            dao.create(new Ville("Villeneuve d'Ascq"));
            dao.create(new Ville("Loos"));
            dao.create(new Ville("Longuenesse"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, Ville.class, false);
            onCreate(database, connectionSource);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
