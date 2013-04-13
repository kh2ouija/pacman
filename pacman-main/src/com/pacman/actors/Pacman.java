package com.pacman.actors;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.pacman.Orientation;

import static com.pacman.Constants.*;

/**
 * User: spolisevschi
 * Date: 4/1/13
 * Time: 5:18 PM
 */
public class Pacman extends ShapeRendererActor {

    public Pacman() {
        super();
    }

    @Override
    public void draw(ShapeRenderer shapeRenderer) {
        shapeRenderer.setColor(Color.YELLOW);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.circle(super.getCenter().x, super.getCenter().y, CELL_SIZE / 2);
        shapeRenderer.end();
    }

}
