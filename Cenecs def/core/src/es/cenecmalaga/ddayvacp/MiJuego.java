package es.cenecmalaga.ddayvacp;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

import pantallas.BaseScreen;
import pantallas.Mapas;

public class MiJuego extends Game {
	private  String mapa;
	private BaseScreen pantallaActual;

	public MiJuego(String mapa)
	{
		this.mapa=mapa;
	}

	@Override
	public void create() {
		this.setPantallaActual(new Mapas(this,mapa));
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
