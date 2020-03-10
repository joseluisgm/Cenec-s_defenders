package actores;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Torreta4 extends Personaje {
    protected Sprite sprite;
    /**
     * constructor de torretas
     * @param rutaTextura ruta de la imagen
     * @param x posicion x en el mapa
     * @param y posicion y en el mapa
     */
    public Torreta4(String rutaTextura,int x,int y ){
        colliding=false;
        sprite=new Sprite(new Texture(rutaTextura));
        sprite.setBounds(0,0, Gdx.graphics.getWidth()/10,Gdx.graphics.getHeight()/10);
        this.setOrigin(x,y);
        this.setPosition(x,y);
        this.setSize(Gdx.graphics.getWidth()/10,Gdx.graphics.getHeight()/10);
        sprite.setOrigin(this.getOriginX(),this.getOriginY());
    }

    /**
     * funcion que dibuja la torretas en el mapa
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
