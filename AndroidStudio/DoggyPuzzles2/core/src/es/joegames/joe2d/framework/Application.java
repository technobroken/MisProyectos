package es.joegames.joe2d.framework;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by jose on 22/03/18.
 */

public abstract class Application implements ApplicationListener {
    public Application()
    {
        System.out.println("Ctor");
    }
    @Override
    public void create () {
        Gdx.app.log("Application", "create");
    }

    @Override
    public void resize (int width, int height) {
        Gdx.app.log("Application", "resize");
    }

    @Override
    public void render () {
    }

    @Override
    public void pause () {
        Gdx.app.log("Application", "pause");
    }

    @Override
    public void resume () {
        Gdx.app.log("Application", "resume");
    }

    @Override
    public void dispose () {
        // no aparece ne los logs
        Gdx.app.log("Application", "dispose");
    }
}
