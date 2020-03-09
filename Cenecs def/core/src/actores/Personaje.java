package actores;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;


import java.util.ArrayList;

import escuchadores.EscuchadorEnemigo;
import estructura.Estructura;

public abstract class Personaje extends Actor {
    protected Sprite sprite;
    protected ArrayList<Estructura> estructura;
    protected boolean colliding; //Nos detecta si está colisionando o no



    public Personaje(){
        addListener(new EscuchadorEnemigo(this));
    }

    public Rectangle getHitBox(){
        return sprite.getBoundingRectangle();
    }
    public void addObjeto(Estructura o){
        this.estructura.add(o);
    }
    public boolean checkCollision(Estructura c){
        boolean overlaps=getHitBox().overlaps(c.getHitBox());
        if(overlaps&&colliding==false){
            colliding=true;
            Gdx.app.log("Colisionando","con "+c.getClass().getName());
        }else if(!overlaps){
            colliding=false;
        }
        return colliding;
    }

}
