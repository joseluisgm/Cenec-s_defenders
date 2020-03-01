package actores;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;


import java.util.ArrayList;
import java.util.HashSet;

public abstract class Personaje extends Actor {
    protected Sprite sprite;
    protected int fuerza;
    protected boolean colliding; //Nos detecta si está colisionando o no
    private int velocidad;
    protected String nombre;
    private HashSet<Integer> moving; //Dependiendo de la dirección que contenga, se mueve, y puede combinar más de una dirección a la vez

    public Personaje(String rutaTextura){
        this.moving=new HashSet<Integer>();
        velocidad=10;
        colliding=false;
        sprite=new Sprite(new Texture(rutaTextura));
        sprite.setBounds(0,0, Gdx.graphics.getWidth()/10,Gdx.graphics.getHeight()/7);
        this.setSize(Gdx.graphics.getWidth()/10,Gdx.graphics.getHeight()/7);
        this.setOrigin(this.sprite.getWidth()/2,this.sprite.getHeight()/2);
        sprite.setOrigin(this.getOriginX(),this.getOriginY());

    }





    public String getNombre(){
        return nombre;
    }

    public void cambiarVelocidad(int velocidad) {
        this.velocidad += velocidad;
    }

    public int getVelocidad(){
        return velocidad;
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

    public Rectangle getHitBox(){
        return sprite.getBoundingRectangle();
    }

    public boolean checkCollisionCenec(Cenec c){
        boolean overlaps=getHitBox().overlaps(c.getHitBox());
        if(overlaps&&colliding==false){
            colliding=true;
            Gdx.app.log("Colisionando","con "+c.getClass().getName());
        }else if(!overlaps){
            colliding=false;
        }
        return colliding;
    }

    public boolean checkCollisionMosca(Mosca c){
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
