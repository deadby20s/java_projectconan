package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.MyGdxGame;

public class mainMenuScreens implements Screen {

    private static final int button_width= 200;
    private static final int button_height= 130;

    Texture img;
    MyGdxGame game ;

    Texture new_game_button_inactive;
    Texture new_game_button_active;
    Texture continu_button_active;
    Texture continu_button_inactive;
    Texture login_signup_button_active;
    Texture login_signup_button_inactive;


    public mainMenuScreens(MyGdxGame game )
    {
        this.game = game;
        new_game_button_inactive = new Texture("new_game_inactive.png");
        new_game_button_active = new Texture("new_game_active.png");
        continu_button_inactive = new Texture("continu_button_inactive.png");
        continu_button_active = new Texture("continu_button_active.png");
        login_signup_button_inactive = new Texture("login_signup_inactive.png");
        login_signup_button_active = new Texture("login_signup_active.png");
    }

    @Override
    public void show() {
        img = new Texture("menu_background.jpg");
    }
    
    @Override
    public void render(float delta) {
        this.render();

        ScreenUtils.clear(1, 0, 0, 1);

        game.batch.begin();

        game.batch.draw(img, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        game.batch.draw(new_game_button_inactive, 860, 200,button_width, button_height);

        game.batch.draw(continu_button_inactive, 860, 100,button_width, button_height);

        game.batch.draw(login_signup_button_inactive, 50, 70,button_width, button_height);


       int x = game.WIDTH / 2 - button_width / 2;
        if (Gdx.input.getX() < x + button_width && Gdx.input.getX() > x && game.HEIGHT - Gdx.input.getY() < button_height + button_height && game.HEIGHT - Gdx.input.getY() > button_height) {
            if(Gdx.input.isTouched())
            {
                game.setScreen(new gamescreen1(game));
            }
        }

        if ((Gdx.input.getX()<1060 && Gdx.input.getX()>860 )&&((Gdx.input.getY()<840) && (Gdx.input.getY()>750)))
        {   game.batch.draw(new_game_button_active, 860, 200,button_width, button_height);
            if(Gdx.input.isTouched())
                game.setScreen(new screen2(game));
        }
        else game.batch.draw(new_game_button_inactive, 860, 200,button_width, button_height);

        if ((Gdx.input.getX()<1060 && Gdx.input.getX()>860 )&&((Gdx.input.getY()<980) && (Gdx.input.getY()>850)))
        {   game.batch.draw(continu_button_active, 860, 100,button_width, button_height);
            if(Gdx.input.isTouched())
                game.setScreen(new saveGames(game)); //button continue
        }
        else game.batch.draw(continu_button_inactive, 860, 100,button_width, button_height);

        if ((Gdx.input.getX()<250 && Gdx.input.getX()>50 )&&((Gdx.input.getY()<1010) && (Gdx.input.getY()>880)))
        {   game.batch.draw(login_signup_button_active, 50, 70,button_width, button_height);
            if(Gdx.input.isTouched())
                game.setScreen(new loginScreen(game)); //button login/signup
        }
        else game.batch.draw(login_signup_button_inactive, 50, 70,button_width, button_height);


        game.batch.end();
    }

    public void render() {
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
    public  void dispose() {

    }
}