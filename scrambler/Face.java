/**
 * Face.java
 *
 * Models a face of a Rubik's Cube
 *
 * @author Elliot Penson
 */

package scrambler;

public class Face {

    /**
     * R, L, U, D, F, or B
     */
    private char side;

    /**
     * X, Y, or Z
     */
    private char axis;

    /**
     * Blank constructor
     */
    public Face() { }

    /**
     * Constructor
     * @param side
     * @param axis
     */
    public Face(char side, char axis) {
        this.side = side;
        this.axis = axis;
    }

    /**
     * Provides the side this face is on
     */
    public char getSide() {
        return side;
    }

    /**
     * Provides the axis of this face
     */
    public char getAxis() {
        return axis;
    }

    /**
     * Compares two Faces
     * @param other
     */
    public boolean sameFace(Face other) {
        if(other.getSide() == side)
            return true;
        return false;
    }
}
