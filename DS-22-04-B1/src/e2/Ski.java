package e2;

import java.util.Arrays;

public class Ski {

    public static int downTheSlope(char[][] slopeMap, int right, int down) {
        if(!MatrixUtils.isMapSquare(slopeMap)) throw new IllegalArgumentException("Map is not square");
        if(!MatrixUtils.areMapCharactersValid(slopeMap)) throw new IllegalArgumentException("Map characters are not valid");
        if(!MatrixUtils.isRightValid(slopeMap, right)) throw new IllegalArgumentException("Right is not valid");
        if(!MatrixUtils.isDownValid(slopeMap, down)) throw new IllegalArgumentException("Down is not valid");


    }

    public static void main(String[] args) {

    }
}



