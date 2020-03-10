package es.cenecmalaga.ddayvacp;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

import basededatos.BaseDeDatos;
import pantallas.BaseScreen;
import pantallas.Mapas;


public class MiJuego extends Game {
	private  String mapa;
	private BaseScreen pantallaActual;
	BaseDeDatos baseDeDatos;

	/**
	 * onstructor de MiJuego
	 * @param mapa srting de que se usara para crear el mapa
	 * @param bd base de datos que se usa en el juego
	 */
	public MiJuego(String mapa, BaseDeDatos bd)
	{
		baseDeDatos=bd;
		this.mapa=mapa;

	}

	@Override
	public void create() {
		this.setPantallaActual(new Mapas(this,mapa,baseDeDatos));
	}

	public void setPantallaActual(BaseScreen pa){
		pantallaActual=pa;
		setScreen(pantallaActual);
	}


	@Override
	public void render () {
		pantallaActual.render(Gdx.graphics.getDeltaTime());

	}

	@Override
	public void dispose () {
		pantallaActual.dispose();
	}
}
