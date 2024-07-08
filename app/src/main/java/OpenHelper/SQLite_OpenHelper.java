package OpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import androidx.annotation.Nullable;

public class SQLite_OpenHelper extends SQLiteOpenHelper {
    public SQLite_OpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query1= "create table ofertas (_ID integer primary key autoincrement, nombre text, apellido text, mail text, tel text, oferta real, obra text)";
        String query2= "create table inforObras (id text primary key, autor text, titulo text, anio text, precio text, duenio text )";
        db.execSQL(query1);
        db.execSQL(query2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void abrir(){
        this.getWritableDatabase();
    }


    public void leer(){
        this.getReadableDatabase();
    }
    public void cerrar(){
        this.close();

    }
    public void insertarOferta(String nombre, String apellido, String mail, String tel, double oferta, String obra){
        ContentValues values = new ContentValues();
        values.put("nombre", nombre);
        values.put("apellido", apellido);
        values.put("mail", mail);
        values.put("tel", tel);
        values.put("oferta", oferta);
        values.put("obra", obra);

        this.getWritableDatabase().insert("ofertas", null, values);
    }

    public void insertarInfo(String id, String autor, String titulo, String anio, String precio, String duenio){
        ContentValues values = new ContentValues();
        values.put("id", id);
        values.put("autor",autor);
        values.put("titulo",titulo);
        values.put("anio",anio);
        values.put("precio",precio);
        values.put("duenio",duenio);

        this.getWritableDatabase().insert("inforObras",null,values);
    }

    public Cursor obtenerInfoObra(String imagePath) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM inforObras WHERE id = ?";
        return db.rawQuery("SELECT * FROM inforObras WHERE id='"+imagePath+"'",null);
    }

}
