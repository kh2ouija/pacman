package com.pacman;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.pacman.screens.MazeScreen;

import static com.pacman.Constants.*;

public class PacmanGame extends Game {

	private Screen mazeScreen;

	@Override
	public void create() {
		Gdx.app.log(LOG, "Creating game");
		mazeScreen = new MazeScreen();
		setScreen(mazeScreen);
	}

}
