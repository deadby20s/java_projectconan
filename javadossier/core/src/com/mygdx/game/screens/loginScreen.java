package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.utils.ScreenUtils;

import com.mygdx.game.MyGdxGame;

public class loginScreen implements Input.TextInputListener, Screen {
    MyGdxGame game;
    Texture background;
    //Sprite sprite;
    //TextureRegion region;
    Texture loginButton;
    String myText;
    BitmapFont font;
    String myText1;
    String myText2;
    String signin;
    Texture conan;
    Texture fac;
    Texture insta;
    Texture google;
    String text;
    Texture username;
    Texture password;
    Texture back;
    public loginScreen(MyGdxGame game) {
        this.game=game;
        background = new Texture("r2.jpg");
        //region = new TextureRegion(background, 0, 0, 1920, 1280);
        //sprite = new Sprite(region);
        loginButton = new Texture("012.png");
        font = new BitmapFont();
        myText = "Press Username";
        myText1 = "Press Password";
        myText2 = "welcome to our game";
        signin = "create an account";
        conan = new Texture("conan2.png");
        fac = new Texture("R.png");
        insta = new Texture("R1.png");
        google = new Texture("R3.png");
        username = new Texture("ur.png");
        password = new Texture("pas.png");
        back =new Texture("back.png");
    }

    @Override
    public void render(float delta) {
        this.render();
        ScreenUtils.clear(0, 0, 0, 0);
        game.batch.begin();
        /*game.batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        background.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        sprite.setSize(1f, 1.12f * sprite.getHeight() / sprite.getWidth());
        sprite.setOrigin(sprite.getWidth() / 2, sprite.getHeight() / 2);
        sprite.setPosition(-sprite.getWidth() / 2, -sprite.getHeight() / 2);*/
        game.batch.draw(background,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        game.batch.draw(loginButton,480,300,350,100);

        font.draw(game.batch,myText,200,800);
        font.setColor(Color.WHITE);
        font.draw(game.batch,myText1,200,600);
        font.draw(game.batch,myText2,500,1000);
        font.draw(game.batch,signin,550,300);
        font.getData().setScale(2.0f, 2.0f);

        game.batch.draw(conan,900,-20,1000,1100);
        game.batch.draw(fac,15,15,100,100);
        game.batch.draw(insta,150,30,70,70);
        game.batch.draw(google,260,30,70,70);


        game.batch.draw(username,200,580,500,200);
        game.batch.draw(password,200,400,500,200);

        game.batch.draw(back,0,950,100,100);

        if ((Gdx.input.getX()<700 && Gdx.input.getX()>200 )&&((Gdx.input.getY()<400) && (Gdx.input.getY()>320)))
        {
            if(Gdx.input.justTouched())
                Gdx.input.getTextInput(this,"Username","","Address-gmail");
        }
        Gdx.app.log("Text",text);

        if ((Gdx.input.getX()<700 && Gdx.input.getX()>200 )&&(Gdx.input.getY()<600 && Gdx.input.getY()>500))
        {
            if (Gdx.input.justTouched())
                Gdx.input.getTextInput(this, "Password", "", "password");
        }
        Gdx.app.log("Text",text);


        if ((Gdx.input.getX()<800 && Gdx.input.getX()>500 )&&((Gdx.input.getY()<720) && (Gdx.input.getY()>650)))
        {
            if(Gdx.input.justTouched())
                Gdx.input.getTextInput(this,"login","","Address-gmail");
        }

        if ((Gdx.input.getX()>15 && Gdx.input.getX()<80)&&((Gdx.input.getY()<100) && (Gdx.input.getY()>30)))
        {
            if(Gdx.input.justTouched())
            {
                game.setScreen(new mainMenuScreens(game));
            }
        }

        game.batch.end();
    }

    private void render() {
    }

    @Override
    public void show() {

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
    public void dispose () {
        game.batch.dispose();
        background.dispose();
        loginButton.dispose();
        font.dispose();
        conan.dispose();
        fac.dispose();
        insta.dispose();
        google.dispose();
        username.dispose();
        password.dispose();
        back.dispose();
    }
    public void input(String text) {
        this.text=text;
    }

    @Override
    public void canceled() {
        text="cancelled";
    }
}


