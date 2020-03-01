package pantallas;

import com.badlogic.gdx.graphics.Texture;

import es.cenecmalaga.ddayvacp.MiJuego;

public class Mapas extends BaseScreen{
    public Mapas(MiJuego g,String M ){
        super(g);
        this.fondo=new Texture("fondos/"+M+".jpg");
    }
}
