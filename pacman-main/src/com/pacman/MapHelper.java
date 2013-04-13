package com.pacman;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.MapObjects;
import com.badlogic.gdx.maps.MapProperties;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;
import java.util.List;

import static com.pacman.Constants.*;
import static com.pacman.Constants.CLYDE_SPAWN_POINT;

/**
 * User: Stefan
 * Date: 4/1/13
 * Time: 1:11 AM
 */
public class MapHelper {

	private TiledMap map;

	private List<GridLocation> pelletsLocations;
	private List<GridLocation> energizersLocations;
	private Vector2 pacmanSpawn;
	private Vector2 blinkySpawn;
	private Vector2 inkySpawn;
	private Vector2 clydeSpawn;

	public MapHelper(TiledMap map) {
		this.map = map;

		// pellets
		MapLayer pelletsLayer = map.getLayers().get(LAYER_PELLETS);
		pelletsLocations = new ArrayList<GridLocation>();
		for (MapObject pellet : pelletsLayer.getObjects()) {
			pelletsLocations.add(new GridLocation(pellet.getProperties().get("y", int.class), pellet.getProperties().get("x", int.class)));
		}

		// energizers
		MapLayer energizersLayer = map.getLayers().get(LAYER_ENERGIZERS);
		energizersLocations = new ArrayList<GridLocation>();
		for (MapObject energizer : energizersLayer.getObjects()) {
			energizersLocations.add(new GridLocation(energizer.getProperties().get("y", int.class), energizer.getProperties().get("x", int.class)));
		}

		// spawn points
		MapLayer spawnPointsLayer = map.getLayers().get(LAYER_SPAWN_POINTS);
		for (MapObject spawnPoint : spawnPointsLayer.getObjects()) {
			if (PACMAN_SPAWN_POINT.equals(spawnPoint.getName())) {
				pacmanSpawn = new Vector2(spawnPoint.getProperties().get("x", int.class), spawnPoint.getProperties().get("y", int.class));
			}
			else if (BLINKY_SPAWN_POINT.equals(spawnPoint.getName())) {
				blinkySpawn = new Vector2(spawnPoint.getProperties().get("x", int.class), spawnPoint.getProperties().get("y", int.class));
			}
			else if (INKY_SPAWN_POINT.equals(spawnPoint.getName())) {
				inkySpawn = new Vector2(spawnPoint.getProperties().get("x", int.class), spawnPoint.getProperties().get("y", int.class));
			}
			else if (CLYDE_SPAWN_POINT.equals(spawnPoint.getName())) {
				clydeSpawn = new Vector2(spawnPoint.getProperties().get("x", int.class), spawnPoint.getProperties().get("y", int.class));
			}
		}

		Gdx.app.log(LOG, "MapHelper created");
	}


	public Vector2 getOriginOfCell(int column, int line) {
		Vector2 origin = new Vector2();
		origin.x = column * CELL_SIZE;
		origin.y = line * CELL_SIZE;
		return origin;
	}

	public boolean isLegal(int column, int line) {
		MapProperties properties = ((TiledMapTileLayer) map.getLayers().get(LAYER_MAZE)).getCell(column, line).getTile().getProperties();
		if (properties != null) {
			if (properties.containsKey(PROPERTY_LEGAL)) {
				return true;
			}
		}
		return false;
	}

	public List<GridLocation> getPelletsLocations() {
		return pelletsLocations;
	}

	public List<GridLocation> getEnergizersLocations() {
		return energizersLocations;
	}

	public Vector2 getPacmanSpawn() {
		return pacmanSpawn;
	}

	public Vector2 getBlinkySpawn() {
		return blinkySpawn;
	}

	public Vector2 getInkySpawn() {
		return inkySpawn;
	}

	public Vector2 getClydeSpawn() {
		return clydeSpawn;
	}
}
