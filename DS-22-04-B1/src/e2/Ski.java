package e2;

import java.util.Arrays;

public class Ski {

    public static int downTheSlope (char [][] slopeMap, int right, int down) {
        int r = 0, c = 0;
        int cont = 0;
        boolean seguir = true;

        if(r != c){
            throw new IllegalArgumentException("Matrix is not valid");
        }

        for(r = 0; r<slopeMap[r].length; r++){
            for(c = 0; c<slopeMap[c].length; c++) {
                if (slopeMap[r][c] != '#' || slopeMap[r][c] != '.')
                    throw new IllegalArgumentException("Invalid matrix");
            }
        }

        while(seguir){
        for(c = 0; c < right; c++) {
            if (Arrays.deepToString(slopeMap).charAt(slopeMap[r][c]) == '#') {
                cont++;
            }
        }
        slopeMap[r][c] = slopeMap[r][c+right];
        if(c > slopeMap[c].length)
            slopeMap[r][c] = slopeMap[r][0];
        else
        for(r = 0; r < down; r++) {
            if (Arrays.deepToString(slopeMap).charAt(slopeMap[r][c]) == '#') {
                cont++;
            }
        }

        if(r >= slopeMap[r].length)
            seguir = false;
        else
        slopeMap[r][c] = slopeMap[r+down][c];

        }
        return cont;
    }

    public static void main(String[] args) {

    }
}
