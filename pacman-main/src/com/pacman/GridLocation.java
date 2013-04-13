package com.pacman;

/**
 * User: spolisevschi
 * Date: 4/1/13
 * Time: 2:56 PM
 */
public class GridLocation {

    private int line;
    private int column;

    public GridLocation(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
