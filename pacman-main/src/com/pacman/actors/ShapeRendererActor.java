package com.pacman.actors;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * User: spolisevschi
 * Date: 4/1/13
 * Time: 5:12 PM
 */
public abstract class ShapeRendererActor extends AbstractPacmanActor {

    private ShapeRenderer shapeRenderer;

    public ShapeRendererActor() {
        this.shapeRenderer = new ShapeRenderer();
    }

    public abstract void draw(ShapeRenderer shapeRenderer);

    @Override
    public void draw(SpriteBatch batch, float parentAlpha) {
        batch.end();
        shapeRenderer.setProjectionMatrix(batch.getProjectionMatrix());
        shapeRenderer.setTransformMatrix(batch.getTransformMatrix());
        shapeRenderer.translate(getX(), getY(), 0);
        draw(shapeRenderer);
        batch.begin();
    }

}
