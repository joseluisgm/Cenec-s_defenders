package estructura;

import com.badlogic.gdx.Gdx;
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

public class Estructura extends Personaje {
    protected Sprite sprite;

    /**
     * super constructor de estructura
     * @param rutaTextura ruta de la imagen para crear el sprite
     */
    public Estructura(String rutaTextura){
        sprite=new Sprite(new Texture(rutaTextura));
        sprite.setBounds(0,0, Gdx.graphics.getWidth()/10,Gdx.graphics.getHeight()/10);
        this.setOrigin(this.sprite.getWidth()/2,this.sprite.getHeight()/2);
        this.setSize(Gdx.graphics.getWidth()/10,Gdx.graphics.getHeight()/10);
        sprite.setOrigin(this.getOriginX(),this.getOriginY());
    }

    /**
     * saca la hitbox
     * @return debuelve el sprite con la gitbox
     */
    public Rectangle getHitBox(){
        return sprite.getBoundingRectangle();
    }
}
