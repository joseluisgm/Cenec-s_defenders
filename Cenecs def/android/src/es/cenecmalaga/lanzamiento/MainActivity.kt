package es.cenecmalaga.lanzamiento


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AlertDialog
import android.view.View
import basededatos.BaseDeDatosCenecsDef

import kotlinx.android.synthetic.main.activity_main.*
import servicio.Servicio
import android.R.string.cancel
import android.content.DialogInterface
import com.badlogic.gdx.Gdx.app
import android.support.v4.app.SupportActivity
import android.support.v4.app.SupportActivity.ExtraData
import android.support.v4.content.ContextCompat.getSystemService
import com.badlogic.gdx.utils.IntArray
import android.R




class MainActivity : AppCompatActivity() {
    private  val manager:FragmentManager by lazy { this.supportFragmentManager }
    private val logo:Logo by lazy{Logo()}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(es.cenecmalaga.ddayvacp.R.layout.activity_main)
        var transaction:FragmentTransaction= manager.beginTransaction()
        transaction.replace(es.cenecmalaga.ddayvacp.R.id.logoFrame,logo,"logo_game")
        transaction.addToBackStack("logo_game")
        transaction.commit()
        var bd= BaseDeDatosCenecsDef(this)
        var aux= bd.cargar()
        textoInt.text = "Intentos hechos :"+aux+":"
        var intent = Intent(this, Servicio::class.java)
        startService(intent)


    }
    fun lanzarJuego(view: View) {
        val i = Intent(
                this,
                AndroidLauncher::class.java)
        var bundle: Bundle = Bundle();
        bundle.putString("mapa", "mapa1")
        i.putExtras(bundle)
        this.startActivity(i)


    }
    fun lanzarJuego2(view: View) {
        val i = Intent(
                this,
                AndroidLauncher::class.java)
        var bundle: Bundle = Bundle();
        bundle.putString("mapa", "mapa2")
        i.putExtras(bundle)
        this.startActivity(i)
    }
    fun lanzarJuego3(view: View) {
        val i = Intent(
                this,
                AndroidLauncher::class.java)
        var bundle: Bundle = Bundle();
        bundle.putString("mapa", "mapa3")
        i.putExtras(bundle)
        this.startActivity(i)
    }
    fun lanzarJuego4(view: View) {
        val i = Intent(
                this,
                AndroidLauncher::class.java)
        var bundle: Bundle = Bundle();
        bundle.putString("mapa", "mapa4")
        i.putExtras(bundle)
        this.startActivity(i)
    }
    fun lanzarJuego5(view: View) {
        val i = Intent(
                this,
                AndroidLauncher::class.java)
        var bundle: Bundle = Bundle();
        bundle.putString("mapa", "mapa5")
        i.putExtras(bundle)
        this.startActivity(i)
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Seguro que quieres salir de esta maravillosa aplicacion con Libgdx")
                .setCancelable(false)
                .setPositiveButton("si") { dialog, id -> this.finish() }
                .setNegativeButton("no") { dialog, id -> dialog.cancel() }
        val alert = builder.create()
        alert.show()

    }

}


