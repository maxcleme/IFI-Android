package com.example.android.basiccontactables.helper;

import java.sql.SQLException;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.android.basiccontactables.R;
import com.example.android.basiccontactables.entite.Restau;
import com.example.android.basiccontactables.entite.Ville;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

/**
 * Created by RMS on 14/09/2015.
 */
public class RestauHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "crous";
    private static final int DATABASE_VERSION = 1;

    private Dao<Restau, Long> RestauDao;

    public RestauHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Restau.class);

            Dao<Restau, Long> daoRestau = this.getDao(Restau.class);
            Dao<Ville, Long> daoVille = this.getDao(Ville.class);

            daoRestau.create(new Restau("test", "test", "test", "test", daoVille.queryForId(1L)));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, Restau.class, false);
            onCreate(database, connectionSource);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
