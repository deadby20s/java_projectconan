package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.MyGdxGame;

public class screen3 implements Screen {

    Texture img;
    MyGdxGame maingame;
    ShapeRenderer shape;
    Texture togo;
    Sprite sprite,togosprite;
    BitmapFont font;
    String mytext;
    public screen3(MyGdxGame maingame){

        this.maingame=maingame;
    }

    @Override
    public void show() {
        ScreenUtils.clear(1, 9, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        shape = new ShapeRenderer();
        img =new Texture("scene1.png");
        togo = new Texture("togo.png");
        sprite = new Sprite(img);
        sprite.setPosition(Gdx.graphics.getWidth()/2-sprite.getWidth()/2,
                Gdx.graphics.getHeight()/2-sprite.getHeight()/2);


        togosprite = new Sprite(togo);
        togosprite.setPosition(Gdx.graphics.getWidth()/2-sprite.getWidth()*2,
                Gdx.graphics.getHeight()/2-sprite.getHeight()*2);

        togosprite.setScale((1f));
        sprite.setScale(4f);
        font = new BitmapFont(Gdx.files.internal("font.fnt"));
        mytext ="thank you dev it’s a pleasure to meet you too. This is the son of my friend conan\n " +
                "and he’s living with me right now. ";



    }

    @Override
    public void render(float delta) {
        maingame.batch.begin();
        maingame.batch.draw(sprite,sprite.getX(),sprite.getY(),sprite.getWidth()/2,
                sprite.getHeight()/2,sprite.getWidth(),sprite.getHeight(),
                sprite.getScaleX(),sprite.getScaleY(),sprite.getRotation());




        maingame.batch.draw(togosprite,togosprite.getX(),togosprite.getY(),togosprite.getWidth()/2,
                togosprite.getHeight()/2,togosprite.getWidth(),togosprite.getHeight(),
                togosprite.getScaleX(),togosprite.getScaleY(),togosprite.getRotation());

        font.draw(maingame.batch,mytext,Gdx.graphics.getWidth()/2-sprite.getWidth()/2-200,
                Gdx.graphics.getHeight()-650-sprite.getHeight()/2);
        maingame.batch.end();


        shape.begin(ShapeRenderer.ShapeType.Line);
        shape.setColor(Color.WHITE);
        shape.rect(200,100,1480,250);
        shape.end();


        if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE))
        {
            maingame.setScreen(new screen4(maingame));
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
        shape.dispose();
        img.dispose();
    }
}
