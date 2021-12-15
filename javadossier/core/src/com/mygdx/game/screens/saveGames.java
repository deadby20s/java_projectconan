package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.MyGdxGame;


public class saveGames implements Screen{
    Texture img;
     Sprite sprite;

    MyGdxGame game;
    public saveGames (MyGdxGame game)
    {
        this.game=game;
    }

    @Override
    public void show() {
        img = new Texture("saved_games.png");
        sprite = new Sprite(img);
        sprite.setPosition(Gdx.graphics.getWidth()/2-sprite.getWidth()/2,
                Gdx.graphics.getHeight()/2-sprite.getHeight()/2);
        sprite.setScale(0.28f);
    }

    @Override
    public void render(float delta) {
        game.batch.begin();

        game.batch.draw(sprite,sprite.getX(),sprite.getY(),sprite.getWidth()/2,
                sprite.getHeight()/2,sprite.getWidth(),sprite.getHeight(),
                sprite.getScaleX(),sprite.getScaleY(),sprite.getRotation());

        game.batch.end();

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
        img.dispose();
    }
}
