package model;

public class Model {

    /*
    # - wall
    @ - hero
    * - box
    $ - target
    . - field
     */

    public static final char FIELD = '.';
    public static final char TARGET = '$';
    public static final char HERO = '@';
    public static final char WALL = '#';
    public static final char BOX = '*';

    private char[][] gameFieldModel = {
            {WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL},
            {WALL, FIELD, FIELD, FIELD, FIELD, FIELD, FIELD, WALL},
            {WALL, FIELD, BOX, FIELD, FIELD, FIELD, FIELD, WALL},
            {WALL, FIELD, FIELD, FIELD, FIELD, FIELD, FIELD, WALL},
            {WALL, FIELD, FIELD, FIELD, FIELD, FIELD, FIELD, WALL},
            {WALL, FIELD, FIELD, BOX, FIELD, FIELD, FIELD, WALL},
            {WALL, FIELD, FIELD, FIELD, FIELD, FIELD, FIELD, WALL},
            {WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL}

    };

    public char getFieldData(int row, int col) {
        return gameFieldModel[row][col];
    }

}
