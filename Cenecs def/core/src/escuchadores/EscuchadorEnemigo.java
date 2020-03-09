package escuchadores;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.MoveByAction;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.badlogic.gdx.scenes.scene2d.actions.ParallelAction;
import com.badlogic.gdx.scenes.scene2d.actions.RotateByAction;
import com.badlogic.gdx.scenes.scene2d.actions.RotateToAction;
import com.badlogic.gdx.scenes.scene2d.actions.ScaleByAction;
import com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;

import actores.Personaje;

public class EscuchadorEnemigo extends InputListener {
    Personaje enemigo;

    public  EscuchadorEnemigo(Personaje j){
        this.enemigo=j;
    }
    @Override
    public boolean keyDown(InputEvent event, int keycode) {
        MoveToAction mta=new MoveToAction();
        switch (keycode){
            case Input.Keys.R: //Reset, volver al 0,0

                mta.setPosition(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);
                mta.setDuration(2);
                RotateToAction rta=new RotateToAction();
                rta.setRotation(0);
                rta.setDuration(2);
                ScaleToAction sta=new ScaleToAction();
                sta.setScale(1);
                sta.setDuration(2);
                ParallelAction pa=new ParallelAction(mta,rta,sta);
                enemigo.addAction(pa);
                break;

            case Input.Keys.X:
                SequenceAction parpadear=new SequenceAction(new SequenceAction(
                        Actions.alpha(0.1f,0.2f),
                        Actions.alpha(1f,0.2f),
                        Actions.alpha(0.1f,0.2f),
                        Actions.alpha(1f,0.2f)
                ),new SequenceAction(
                        Actions.alpha(0.1f,0.2f),
                        Actions.alpha(1f,0.2f),
                        Actions.alpha(0.1f,0.2f),
                        Actions.alpha(1f,0.2f)));
                ScaleByAction danioDisminuir=new ScaleByAction();
                danioDisminuir.setAmount(-1f,-0.5f);
                danioDisminuir.setDuration(0.4f);
                ScaleByAction danioDisminuir2=new ScaleByAction();
                danioDisminuir2.setAmount(+0.5f,-0.5f);
                danioDisminuir2.setDuration(0.4f);
                ScaleByAction danioAumentar=new ScaleByAction();
                danioAumentar.setAmount(+0.5f,+0.5f);
                danioAumentar.setDuration(0.4f);
                ScaleByAction danioAumentar2=new ScaleByAction();
                danioAumentar2.setAmount(+0,+0.5f);
                danioAumentar2.setDuration(0.4f);
                SequenceAction escalarseDanio=new SequenceAction(danioDisminuir,
                        danioDisminuir2,danioAumentar,danioAumentar2);
                enemigo.addAction(new ParallelAction(parpadear,escalarseDanio));
                break;
        }
        return super.keyDown(event, keycode);

    }
}
