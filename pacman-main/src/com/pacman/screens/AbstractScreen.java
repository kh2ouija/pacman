package com.pacman.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.pacman.PacmanGame;

import static com.pacman.Constants.*;

/**
 * User: Stefan
 * Date: 3/31/13
 * Time: 10:04 PM
 */
public abstract class AbstractScreen implements Screen {

	private String getName() {
		return getClass().getSimpleName();
	}

	@Override
	public void resize(int width, int height) {
		Gdx.app.log(LOG, "Resizing screen " + getName() + " to w=" + width + " h=" + height);
	}

	@Override
	public void show() {
		Gdx.app.log(LOG, "Showing screen " + getName());
	}

	@Override
	public void hide() {
		Gdx.app.log(LOG, "Hiding screen " + getName());
		dispose();
	}

	@Override
	public void pause() {
		Gdx.app.log(LOG, "Pausing screen " + getName());
	}

	@Override
	public void resume() {
		Gdx.app.log(LOG, "Resuming screen " + getName());
	}

	@Override
	public void dispose() {
		Gdx.app.log(LOG, "Disposing screen " + getName());
	}

}
