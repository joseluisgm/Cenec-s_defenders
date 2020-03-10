package servicio

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log
import android.widget.Toast
import android.support.v4.content.ContextCompat.getSystemService
import com.badlogic.gdx.utils.IntArray



class Servicio : Service() {
//clase que lanza el servicio
    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        super.onStartCommand(intent, flags, startId)
        Toast.makeText(this, "gracias por jugar a este juego que para nada tiene bugs para nada ", Toast.LENGTH_LONG).show()
        return Service.START_NOT_STICKY
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}