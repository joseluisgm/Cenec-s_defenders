package pantallas;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FillViewport;

import java.util.Random;

import actores.Cenec;
import actores.Mosca;
import actores.Torreta;
import actores.Torreta2;
import actores.Torreta3;
import actores.Torreta4;
import es.cenecmalaga.ddayvacp.MiJuego;

public class BaseScreen implements Screen {
    protected MiJuego game;
    protected Stage pantalla;
    private Group enemigos;
    protected Texture fondo;
    public BaseScreen(MiJuego g , String mapa) {
        game=g;
        //we initialize the stage

        if (mapa.equals("mapa1")) {
            pantalla=new Stage(new FillViewport(Gdx.graphics.getWidth(),Gdx.graphics.getHeight()));
            pantalla.addActor(new Cenec("estructura/cenec.png",100,100));
            pantalla.addActor(new Torreta("estructura/torreta.png",100,100));
            pantalla.addActor(new Torreta("estructura/torreta.png",100,100));
            pantalla.addActor(new Torreta("estructura/torreta.png",100,100));
            pantalla.addActor(new Torreta2("estructura/torreta2.png",100,100));
            pantalla.addActor(new Torreta2("estructura/torreta2.png",100,100));
            pantalla.addActor(new Torreta3("estructura/torreta3.png",100,100));
            pantalla.addActor(new Torreta4("estructura/torreta4.png",100,100));
            //Grupo de enemigos
            enemigos=new Group();
            for(int i=0;i<20;i++) {
                float x;
                float y;
                Random op=new Random();
                if(op.nextBoolean()) {
                    Random r = new Random();
                    if (r.nextBoolean()) {
                        x = 100;
                        y = 100;
                    } else {
                        x = -100;
                        y = -100;
                    }
                }else {
                    Random t = new Random();
                    if (t.nextBoolean()) {
                        y = 100;
                        x = 100;
                    } else {
                        y = -100;
                        x = -100;
                    }
                }
                 enemigos.addActor(new Mosca("enemigos/mosca.png",x,y));
            }
            pantalla.addActor(enemigos);



        }
        if (mapa.equals("mapa2")) {
            pantalla=new Stage(new FillViewport(Gdx.graphics.getWidth(),Gdx.graphics.getHeight()));
            pantalla.addActor(new Cenec("",Gdx.graphics.getWidth()/2,
                    Gdx.graphics.getHeight()/2));
            pantalla.addActor(new Torreta("",100,100));
            pantalla.addActor(new Torreta("",100,100));
            pantalla.addActor(new Torreta("",100,100));
            pantalla.addActor(new Torreta2("",100,100));
            pantalla.addActor(new Torreta2("",100,100));
            pantalla.addActor(new Torreta3("",100,100));
            pantalla.addActor(new Torreta4("",100,100));

            //Grupo de enemigos
            enemigos=new Group();
            for(int i=0;i<50;i++) {
                float x;
                float y;
                Random op=new Random();
                if(op.nextBoolean()) {
                    Random r = new Random();
                    if (r.nextBoolean()) {
                        x = 100;
                        y = 100;
                    } else {
                        x = -100;
                        y = -100;
                    }
                }else {
                    Random t = new Random();
                    if (t.nextBoolean()) {
                        y = 100;
                        x = 100;
                    } else {
                        y = -100;
                        x = -100;
                    }
                }
                enemigos.addActor(new Mosca("",x,y));
            }
            pantalla.addActor(enemigos);
        }
        if (mapa.equals("mapa3")) {
            pantalla=new Stage(new FillViewport(Gdx.graphics.getWidth(),Gdx.graphics.getHeight()));
            pantalla.addActor(new Cenec("",Gdx.graphics.getWidth()/2,
                    Gdx.graphics.getHeight()/2));
            pantalla.addActor(new Torreta("",100,100));
            pantalla.addActor(new Torreta("",100,100));
            pantalla.addActor(new Torreta("",100,100));
            pantalla.addActor(new Torreta2("",100,100));
            pantalla.addActor(new Torreta2("",100,100));
            pantalla.addActor(new Torreta3("",100,100));
            pantalla.addActor(new Torreta4("",100,100));

            //Grupo de enemigos
            enemigos=new Group();
            for(int i=0;i<80;i++) {
                float x;
                float y;
                Random op=new Random();
                if(op.nextBoolean()) {
                    Random r = new Random();
                    if (r.nextBoolean()) {
                        x = 100;
                        y = 100;
                    } else {
                        x = -100;
                        y = -100;
                    }
                }else {
                    Random t = new Random();
                    if (t.nextBoolean()) {
                        y = 100;
                        x = 100;
                    } else {
                        y = -100;
                        x = -100;
                    }
                }
                enemigos.addActor(new Mosca("",x,y));
            }
            pantalla.addActor(enemigos);
        }
        if (mapa.equals("mapa4")) {
            pantalla=new Stage(new FillViewport(Gdx.graphics.getWidth(),Gdx.graphics.getHeight()));
            pantalla.addActor(new Cenec("",Gdx.graphics.getWidth()/2,
                    Gdx.graphics.getHeight()/2));
            pantalla.addActor(new Torreta("",100,100));
            pantalla.addActor(new Torreta("",100,100));
            pantalla.addActor(new Torreta("",100,100));
            pantalla.addActor(new Torreta2("",100,100));
            pantalla.addActor(new Torreta2("",100,100));
            pantalla.addActor(new Torreta3("",100,100));
            pantalla.addActor(new Torreta4("",100,100));

            //Grupo de enemigos
            enemigos=new Group();
            for(int i=0;i<110;i++) {
                float x;
                float y;
                Random op=new Random();
                if(op.nextBoolean()) {
                    Random r = new Random();
                    if (r.nextBoolean()) {
                        x = 100;
                        y = 100;
                    } else {
                        x = -100;
                        y = -100;
                    }
                }else {
                    Random t = new Random();
                    if (t.nextBoolean()) {
                        y = 100;
                        x = 100;
                    } else {
                        y = -100;
                        x = -100;
                    }
                }
                enemigos.addActor(new Mosca("",x,y));
            }
            pantalla.addActor(enemigos);
        }
        if (mapa.equals("mapa5")) {
            pantalla=new Stage(new FillViewport(Gdx.graphics.getWidth(),Gdx.graphics.getHeight()));
            pantalla.addActor(new Cenec("",Gdx.graphics.getWidth()/2,
                    Gdx.graphics.getHeight()/2));
            pantalla.addActor(new Torreta("",100,100));
            pantalla.addActor(new Torreta("",100,100));
            pantalla.addActor(new Torreta("",100,100));
            pantalla.addActor(new Torreta2("",100,100));
            pantalla.addActor(new Torreta2("",100,100));
            pantalla.addActor(new Torreta3("",100,100));
            pantalla.addActor(new Torreta4("",100,100));

            //Grupo de enemigos
            enemigos=new Group();
            for(int i=0;i<200;i++) {
                float x;
                float y;
                Random op=new Random();
                if(op.nextBoolean()) {
                    Random r = new Random();
                    if (r.nextBoolean()) {
                        x = 100;
                        y = 100;
                    } else {
                        x = -100;
                        y = -100;
                    }
                }else {
                    Random t = new Random();
                    if (t.nextBoolean()) {
                        y = 100;
                        x = 100;
                    } else {
                        y = -100;
                        x = -100;
                    }
                }
                enemigos.addActor(new Mosca("",x,y));
            }
            pantalla.addActor(enemigos);
        }

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
