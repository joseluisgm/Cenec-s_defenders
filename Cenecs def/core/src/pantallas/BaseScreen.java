package pantallas;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.MoveByAction;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.badlogic.gdx.scenes.scene2d.actions.ParallelAction;
import com.badlogic.gdx.scenes.scene2d.actions.RotateByAction;
import com.badlogic.gdx.scenes.scene2d.actions.RotateToAction;
import com.badlogic.gdx.scenes.scene2d.actions.ScaleByAction;
import com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction;
import com.badlogic.gdx.utils.viewport.FillViewport;

import java.util.Random;

import estructura.Cenec;
import actores.Mosca;
import actores.Personaje;
import actores.Torreta;
import actores.Torreta2;
import actores.Torreta3;
import actores.Torreta4;
import basededatos.BaseDeDatos;
import es.cenecmalaga.ddayvacp.MiJuego;
import escuchadores.EscuchadorEnemigo;
import estructura.Estructura;

public class BaseScreen implements Screen {
    protected MiJuego game;
    protected Stage pantalla;
    private Group enemigos;
    private BaseDeDatos baseDeDatos;
    protected Texture fondo;
    public BaseScreen(MiJuego g , String mapa,BaseDeDatos bd) {
        game=g;
        baseDeDatos=bd;
        //we initialize the stage
        if (mapa.equals("mapa1")) {
            int aux= baseDeDatos.cargar();
            baseDeDatos.guardar(aux+1);
            pantalla=new Stage(new FillViewport(Gdx.graphics.getWidth(),Gdx.graphics.getHeight()));
           pantalla.addActor(new Cenec("estructura/cenec.png",Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2));
            pantalla.addActor(new Torreta("estructura/torreta.png",Gdx.graphics.getWidth()-700,Gdx.graphics.getHeight()/9+370));
            pantalla.addActor(new Torreta("estructura/torreta.png",Gdx.graphics.getWidth()-700,Gdx.graphics.getHeight()-450));
            pantalla.addActor(new Torreta2("estructura/torreta2.png",Gdx.graphics.getWidth()/5.5f,Gdx.graphics.getHeight()/5f));
            pantalla.addActor(new Torreta3("estructura/torreta3.png",Gdx.graphics.getWidth()/9,Gdx.graphics.getHeight()/3+650));
            pantalla.addActor(new Torreta4("estructura/torreta4.png",Gdx.graphics.getWidth()/9,Gdx.graphics.getHeight()/3+30));
            //Grupo de enemigos
            enemigos=new Group();
            enemigos.addActor(new Mosca("enemigos/mosca.png",Gdx.graphics.getWidth()/10,Gdx.graphics.getHeight()/2));
            enemigos.addActor(new Mosca("enemigos/mosca.png",Gdx.graphics.getWidth()-200,Gdx.graphics.getHeight()/2));
            enemigos.addActor(new Mosca("enemigos/mosca.png",Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/10));
            enemigos.addActor(new Mosca("enemigos/mosca.png",Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()-200));
            pantalla.addActor(enemigos);
            for (Actor enemigo: enemigos.getChildren()){
                enemigos.addListener((new EscuchadorEnemigo((Personaje) enemigo)));
            }


            Gdx.input.setInputProcessor(pantalla);
            pantalla.setKeyboardFocus(pantalla.getActors().get(6));
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
        //Color de limpieza blanco por las transparencias
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //Dibujo el fondo de pantalla
        pantalla.getBatch().begin();
        pantalla.getBatch().draw(fondo, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        pantalla.getBatch().end();
        pantalla.getBatch().setColor(pantalla.getBatch().getColor().r, pantalla.getBatch().getColor().g, pantalla.getBatch().getColor().b, 0.5f);
        pantalla.act(delta); //Realizamos las acciones dibujando el tiempo transcurrido entre frame y frame
        pantalla.draw();

        for (int i = 0; i < pantalla.getActors().size; i++) {
            try {

                Personaje per = (Personaje) pantalla.getActors().get(i);
                Gdx.app.log("CLASE DE PER",per.getClass().getName());
                for (int j = 0; j < pantalla.getActors().size; j++) {
                    try {
                        Estructura obj = (Estructura) pantalla.getActors().get(j);
                        if (per.checkCollision(obj)) {
                            per.addObjeto(obj);
                            pantalla.getActors().get(j).remove();
                        }

                        } catch (Exception e) {
                        Group grupo = (Group) pantalla.getActors().get(j);
                        for (int t=0;t<grupo.getChildren().size;t++){
                                Personaje mosca=(Personaje) grupo.getChild(t);

                                if (per.checkCollision(mosca)) {
                                    per.addObjeto(mosca);
                                    pantalla.getActors().get(j).remove();
                                }
                        }
                    }


                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
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
