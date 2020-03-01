package es.cenecmalaga.lanzamiento


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(es.cenecmalaga.ddayvacp.R.layout.activity_main)
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
    }


