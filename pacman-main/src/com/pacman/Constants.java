package com.pacman;

/**
 * User: Stefan
 * Date: 3/30/13
 * Time: 8:24 PM
 */
public class Constants {

	public static final int GRID_COLUMNS = 28;
	public static final int GRID_LINES = 31;
	public static final int CELL_SIZE = 16;

	public static final String TMX_MAP_FILENAME = "data/pacman.tmx";

	public static final String LAYER_MAZE = "LAYER_MAZE";
	public static final String LAYER_PELLETS = "LAYER_PELLETS";
	public static final String LAYER_ENERGIZERS = "LAYER_ENERGIZERS";
	public static final String LAYER_SPAWN_POINTS = "LAYER_SPAWN_POINTS";

	public static final String PACMAN_SPAWN_POINT = "PACMAN_SPAWN_POINT";
	public static final String BLINKY_SPAWN_POINT = "BLINKY_SPAWN_POINT";
	public static final String INKY_SPAWN_POINT = "INKY_SPAWN_POINT";
	public static final String CLYDE_SPAWN_POINT = "CLYDE_SPAWN_POINT";

	public static final String PROPERTY_LEGAL = "LEGAL";

	public static final int SCREEN_WIDTH = GRID_COLUMNS * CELL_SIZE;
	public static final int SCREEN_HEIGHT = GRID_LINES * CELL_SIZE;

	public static final String LOG = "Pacman";

}
