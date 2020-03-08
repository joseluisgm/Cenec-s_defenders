package es.cenecmalaga.lanzamiento

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import basededatos.BaseDeDatosCenecsDef
import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import es.cenecmalaga.ddayvacp.MiJuego


class AndroidLauncher : AndroidApplication() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialize(MiJuego(this.intent.extras!!.getString("mapa"),BaseDeDatosCenecsDef(this)))
    }

}
