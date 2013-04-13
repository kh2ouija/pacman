package com.pacman.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer2;
import com.pacman.Constants;
import com.pacman.MapHelper;
import com.pacman.PacmanGame;

import static com.pacman.Constants.*;

/**
 * User: Stefan
 * Date: 3/31/13
 * Time: 10:08 PM
 */
public class MazeScreen extends AbstractScreen {

	private OrthographicCamera camera;
    private TiledMap map;
    private MapHelper mapHelper;
    private OrthogonalTiledMapRenderer2 renderer;
    private MazeStage stage;


    public MazeScreen() {
		// camera
		camera = new OrthographicCamera();
		camera.setToOrtho(false, SCREEN_WIDTH, SCREEN_HEIGHT);
		camera.update();

        // map
		map = new TmxMapLoader().load(TMX_MAP_FILENAME);
        mapHelper = new MapHelper(map);
		renderer = new OrthogonalTiledMapRenderer2(map);
        renderer.setView(camera);

        // stage
        stage = new MazeStage();
        Gdx.input.setInputProcessor(stage);
        stage.createActors(mapHelper);
    }


	@Override
	public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		renderer.render();
        stage.act(delta);
        stage.draw();
	}


    @Override
    public void dispose() {
        super.dispose();
        stage.dispose();
    }
}
