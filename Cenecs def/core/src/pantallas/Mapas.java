package pantallas;

import com.badlogic.gdx.graphics.Texture;

import basededatos.BaseDeDatos;
import es.cenecmalaga.ddayvacp.MiJuego;

public class Mapas extends BaseScreen{
    public Mapas(MiJuego g,String m, BaseDeDatos bd){
        super(g,m,bd);
        this.fondo=new Texture("fondos/"+m+".PNG");
    }
}
