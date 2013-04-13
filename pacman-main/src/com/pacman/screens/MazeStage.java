package com.pacman.screens;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.pacman.MapHelper;
import com.pacman.actors.Pacman;

/**
 * User: spolisevschi
 * Date: 4/1/13
 * Time: 5:52 PM
 */
public class MazeStage extends Stage {

	private Pacman pacman;

	public void createActors(MapHelper mapHelper) {
		pacman = new Pacman();
		pacman.setOrigin(mapHelper.getPacmanSpawn().x, mapHelper.getPacmanSpawn().y);
		super.addActor(pacman);
	}
}
