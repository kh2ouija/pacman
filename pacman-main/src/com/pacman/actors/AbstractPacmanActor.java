package com.pacman.actors;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.pacman.Orientation;

import static com.pacman.Constants.*;

/**
 * User: spolisevschi
 * Date: 4/1/13
 * Time: 5:21 PM
 */
public class AbstractPacmanActor extends Actor {

    private boolean inMotion;
    private Orientation orientation;

    public AbstractPacmanActor() {
        this.inMotion = false;
        this.orientation = Orientation.RIGHT;
    }

    public AbstractPacmanActor(boolean inMotion, Orientation orientation) {
        this.inMotion = inMotion;
        this.orientation = orientation;
    }

    public Vector2 getCenter() {
        return new Vector2(getOriginX() + CELL_SIZE / 2, getOriginY() + CELL_SIZE / 2);
    }

}
