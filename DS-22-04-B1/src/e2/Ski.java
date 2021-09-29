package e2;

import java.util.Arrays;

public class Ski {

    public static int downTheSlope(char[][] slopeMap, int right, int down) {
        int rows, columns;

    }

    public static void main(String[] args) {

    }
}

    /*public static int downTheSlope (char [][] slopeMap, int right, int down) {
        int cont = 0;
        boolean seguir = true;
        int rows = 0;
        int columns = 0;

        if(rows != columns){
            throw new IllegalArgumentException("Matrix is not valid");
        }

        for(rows = 0; rows<slopeMap[rows].length; rows++){
            for(columns = 0; columns<slopeMap[columns].length; columns++) {
                if (slopeMap[rows][columns] != '#' || slopeMap[rows][columns] != '.')
                    throw new IllegalArgumentException("Invalid matrix");
            }
        }

        while(seguir){
        for(columns = 0; columns < right; columns++) {
            if (Arrays.deepToString(slopeMap).charAt(slopeMap[rows][columns]) == '#') {
                cont++;
            }
        }
        slopeMap[rows][columns] = slopeMap[rows][columns+right];
        if(columns > slopeMap[columns].length)
            slopeMap[rows][columns] = slopeMap[rows][0];
        else
        for(rows = 0; rows < down; rows++) {
            if (Arrays.deepToString(slopeMap).charAt(slopeMap[rows][columns]) == '#') {
                cont++;
            }
        }

        if(rows >= slopeMap[rows].length)
            seguir = false;
        else
        slopeMap[rows][columns] = slopeMap[rows+down][columns];

        }
        return cont;
    }*/


