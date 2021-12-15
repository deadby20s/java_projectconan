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
public class screen2 implements Screen {

    public static final float speed=10;

    Music persona;
    Texture img;
    Texture james;
    Sprite sprite,jamesprite;
    ShapeRenderer shape;

    BitmapFont font;
    String mytext;
    Boolean var  ;


    MyGdxGame maingame;
    public screen2(MyGdxGame maingame){
        this.maingame=maingame;
    }







    @Override
    public void show() {
        ScreenUtils.clear(1, 9, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        shape = new ShapeRenderer();

        img =new Texture("scene1.png");
        james = new Texture("james.png");
        sprite = new Sprite(img);
        sprite.setPosition(Gdx.graphics.getWidth()/2-sprite.getWidth()/2,
                Gdx.graphics.getHeight()/2-sprite.getHeight()/2);


        jamesprite = new Sprite(james);
        jamesprite.setPosition(Gdx.graphics.getWidth()/2-sprite.getWidth()*2,
                Gdx.graphics.getHeight()/2-sprite.getHeight()*2);




        jamesprite.setScale((1.5f));
        sprite.setScale(4f);




        font = new BitmapFont(Gdx.files.internal("font.fnt"));
        mytext ="welcome togomori it’s a pleasure  to meet the most famous detective in japan .  ";
        persona = Gdx.audio.newMusic(Gdx.files.internal("persona.wav"));


        // starts the music at the start of the game
        persona.setLooping(true);
        persona.play();
    }

    @Override
    public void render(float delta) {



        maingame.batch.begin();
        maingame.batch.draw(sprite,sprite.getX(),sprite.getY(),sprite.getWidth()/2,
                sprite.getHeight()/2,sprite.getWidth(),sprite.getHeight(),
                sprite.getScaleX(),sprite.getScaleY(),sprite.getRotation());




        maingame.batch.draw(jamesprite,jamesprite.getX(),jamesprite.getY(),jamesprite.getWidth()/2,
                jamesprite.getHeight()/2,jamesprite.getWidth(),jamesprite.getHeight(),
                jamesprite.getScaleX(),jamesprite.getScaleY(),jamesprite.getRotation());


        font.draw(maingame.batch,mytext,Gdx.graphics.getWidth()/2-sprite.getWidth()/2-200,
                Gdx.graphics.getHeight()-650-sprite.getHeight()/2);

        maingame.batch.end();


        shape.begin(ShapeType.Line);
        shape.setColor(Color.WHITE);
        shape.rect(200,100,1480,250);
        shape.end();



        if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE))
        {
            maingame.setScreen(new screen3(maingame));
        }


    }

    @Override
    public void resize(int width, int height)
    {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide()
    {

    }

    @Override
    public void dispose() {

        shape.dispose();
        img.dispose();
        persona.dispose();

    }


}
