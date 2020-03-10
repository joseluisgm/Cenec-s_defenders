package pantallas;

import com.badlogic.gdx.graphics.Texture;

import basededatos.BaseDeDatos;
import es.cenecmalaga.ddayvacp.MiJuego;

public class Mapas extends BaseScreen{
    /**
     * contructor de mapas que se le da un string y saca 1 de los 5 mapas
     * @param g variable game
     * @param m string mapa para crar la textura
     * @param bd base
     */
    public Mapas(MiJuego g,String m, BaseDeDatos bd){
        super(g,m,bd);
        this.fondo=new Texture("fondos/"+m+".PNG");
    }
}
