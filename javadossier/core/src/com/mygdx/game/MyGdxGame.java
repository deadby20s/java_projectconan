package com.mygdx.game;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.screens.mainMenuScreens;

public class MyGdxGame extends Game {
	public SpriteBatch batch;
	public static final int HEIGHT = 1080;
	public static final int WIDTH = 1920;

	@Override
	public void create () {

		batch = new SpriteBatch();
		setScreen(new mainMenuScreens(this));


	}

	@Override
	public void render () {
		super.render();
		//System.out.print(Gdx.graphics.getDeltaTime());
	}

	@Override
	public void dispose () {
		batch.dispose();


	}
}
