package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.MyGdxGame;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.graphics.Color;
import java.awt.*;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.utils.GdxNativesLoader;
public class gamescreen1 implements Screen {

    public static final float speed=10;


    Texture img;
    Texture conan;
    Sprite sprite,conansprite;
    ShapeRenderer shape;

    BitmapFont font;
    String mytext;
    Boolean var  ;


    MyGdxGame maingame;
    public gamescreen1(MyGdxGame maingame){
        this.maingame=maingame;
    }







    @Override
    public void show() {
        ScreenUtils.clear(1, 9, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        shape = new ShapeRenderer();

        img =new Texture("scene1.png");
        conan = new Texture("conan.png");
        sprite = new Sprite(img);
        sprite.setPosition(Gdx.graphics.getWidth()/2-sprite.getWidth()/2,
                Gdx.graphics.getHeight()/2-sprite.getHeight()/2);


        conansprite = new Sprite(conan);
        conansprite.setPosition(Gdx.graphics.getWidth()/2-sprite.getWidth()*2,
                Gdx.graphics.getHeight()/2-sprite.getHeight()*2);




        conansprite.setScale((1.5f));
        sprite.setScale(4f);

        font = new BitmapFont(Gdx.files.internal("font.fnt"));
        mytext ="hello uncle ";
    }

    @Override
    public void render(float delta) {



        maingame.batch.begin();
        maingame.batch.draw(sprite,sprite.getX(),sprite.getY(),sprite.getWidth()/2,
                sprite.getHeight()/2,sprite.getWidth(),sprite.getHeight(),
                sprite.getScaleX(),sprite.getScaleY(),sprite.getRotation());

        maingame.batch.draw(conansprite,conansprite.getX(),conansprite.getY(),conansprite.getWidth()/2,
                conansprite.getHeight()/2,conansprite.getWidth(),conansprite.getHeight(),
                conansprite.getScaleX(),conansprite.getScaleY(),conansprite.getRotation());


        font.draw(maingame.batch,mytext,Gdx.graphics.getWidth()/2-sprite.getWidth()/2,
                Gdx.graphics.getHeight()-650-sprite.getHeight()/2);
        maingame.batch.end();


        shape.begin(ShapeRenderer.ShapeType.Line);
        shape.setColor(Color.WHITE);
        shape.rect(200,100,1480,250);
        shape.end();







        if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE))
        {
            maingame.setScreen(new screen5(maingame));
        }






    }

    @Override
    public void resize(int width, int height) {}
    @Override
    public void pause() {}
    @Override
    public void resume() {}
    @Override
    public void hide() {}

    @Override
    public void dispose() {

        shape.dispose();
        img.dispose();


    }


}
