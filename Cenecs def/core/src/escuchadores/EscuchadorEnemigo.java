package escuchadores;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.badlogic.gdx.scenes.scene2d.actions.ParallelAction;
import com.badlogic.gdx.scenes.scene2d.actions.RotateToAction;
import com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction;
import actores.Personaje;

public class EscuchadorEnemigo extends InputListener {
    Personaje enemigo;


    public  EscuchadorEnemigo(Personaje j){
        this.enemigo=j;
    }

    /**
     * funcion que hace que se muevan al centro de la pantalla
     * @param event cuando se pulsa la pantalla
     * @param x posicion x en el mapa
     * @param y posicion y en el mapa
     * @param pointer
     * @param button
     * @return la accion que ha hecho
     */
    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
        MoveToAction mta=new MoveToAction();
        mta.setPosition(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);
        mta.setDuration(10);
        RotateToAction rta=new RotateToAction();
        rta.setRotation(0);
        rta.setDuration(2);
        ScaleToAction sta=new ScaleToAction();
        sta.setScale(1);
        sta.setDuration(2);
        ParallelAction pa=new ParallelAction(mta,rta,sta);
        enemigo.addAction(pa);
        return super.touchDown(event, x, y, pointer, button);
    }


}
