package es.cenecmalaga.lanzamiento


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.view.View
import basededatos.BaseDeDatosCenecsDef
import es.cenecmalaga.ddayvacp.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private  val manager:FragmentManager by lazy { this.supportFragmentManager }
    private val logo:Logo by lazy{Logo()}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(es.cenecmalaga.ddayvacp.R.layout.activity_main)
        var transaction:FragmentTransaction= manager.beginTransaction()
        transaction.replace(R.id.logoFrame,logo,"logo_game")
        transaction.addToBackStack("logo_game")
        transaction.commit()
        var bd= BaseDeDatosCenecsDef(this)
        var aux= bd.cargar()
        textoInt.text = "Intentos hechos :"+aux+":"
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

        super.onBackPressed()
    }
}


