package actores;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Proyectil extends Actor {
    protected Sprite sprite;
    public Proyectil(String rutaTextura ){
        sprite=new Sprite(new Texture(rutaTextura));
        sprite.setBounds(0,0, Gdx.graphics.getWidth()/10,Gdx.graphics.getHeight()/10);
        this.setOrigin(this.sprite.getWidth()/2,this.sprite.getHeight()/2);
        this.setSize(Gdx.graphics.getWidth()/10,Gdx.graphics.getHeight()/10);
        sprite.setOrigin(this.getOriginX(),this.getOriginY());

    }





    public Rectangle getHitBox() {return sprite.getBoundingRectangle();
    }

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


