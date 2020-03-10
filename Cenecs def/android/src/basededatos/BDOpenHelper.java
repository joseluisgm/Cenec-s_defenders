package basededatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BDOpenHelper extends SQLiteOpenHelper {

    public BDOpenHelper(Context c, int version){
        super(c,"baseDatosCenecsDef",null,version);
    }

    /**
     * crea la tabla de la base de atos
     * @param db base dedatos
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table cenecsIntentos(puntos int(3) primary key)");
    }

    /**
     * funcion que upgrade la base de datos
     * @param db
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
