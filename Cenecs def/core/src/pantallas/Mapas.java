package pantallas;

import com.badlogic.gdx.graphics.Texture;

import es.cenecmalaga.ddayvacp.MiJuego;

public class Mapas extends BaseScreen{
    public Mapas(MiJuego g,String m ){
        super(g,m);
        this.fondo=new Texture("fondos/"+m+".PNG");
    }
}
