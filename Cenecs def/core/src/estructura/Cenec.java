package estructura;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.ParallelAction;
import com.badlogic.gdx.scenes.scene2d.actions.ScaleByAction;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;

import actores.Personaje;

public class Cenec extends Estructura {
    protected Sprite sprite;


    /**
     * constructor de estructura que es cenec (si hay que usar la imaginacion )
     * @param rutaTextura ruta de la imagen
     * @param x posicion x en el mapa
     * @param y posicion y en el mapa
     */
    public Cenec(String rutaTextura,float x,float y) {
        super(rutaTextura);
        colliding=false;
        sprite=new Sprite(new Texture(rutaTextura));
        sprite.setBounds(x,y, 200,150);
        this.setSize(200,150);
        this.setPosition(x,y); //Cambio posición del actor
        this.setOrigin(this.sprite.getWidth()/2,this.sprite.getHeight()/2);
        sprite.setOrigin(this.getOriginX(),this.getOriginY());
    }

    public Rectangle getHitBox() {return sprite.getBoundingRectangle();
    }
    /**
     * funcion que dibuja la estructura en el mapa
     * @param batch
     * @param parentAlpha
     */
    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        sprite.setPosition(getX(),getY());
        sprite.setScale(this.getScaleX(),getScaleY());
        sprite.setRotation(this.getRotation());
        sprite.setColor(getColor().r,getColor().g,getColor().b,getColor().a);
        sprite.draw(batch);
    }
}
