package e2;

public class Slopes {

    public static int downTheSlope(char[][] slopeMap, int right, int down) {
        boolean go = true;
        int rows = 0, columns = 0;
        int cont = 0;

        if(!MatrixUtils.isMapSquare(slopeMap)) throw new IllegalArgumentException("Map is not square");
        if(!MatrixUtils.areMapCharactersValid(slopeMap)) throw new IllegalArgumentException("Map characters are not valid");
        if(!MatrixUtils.isRightValid(slopeMap, right)) throw new IllegalArgumentException("Right is not valid");
        if(!MatrixUtils.isDownValid(slopeMap, down)) throw new IllegalArgumentException("Down is not valid");

        while(go){


            slopeMap[rows][columns] = slopeMap[rows][columns + right];
            for(columns = 0; columns < slopeMap[rows].length; columns++)
                if(slopeMap[0][columns] == '#') cont++;


            slopeMap[rows][columns] = slopeMap[rows + down][columns]; // aquí falla
            for(rows = 0; rows < slopeMap.length; rows++)
                if(slopeMap[rows][columns] == '#') cont++;

        }
        return cont;
    }

    public static int jumpTheSlope(char[][] slopeMap, int right, int down){
        return 0;
    }

    public static void main(String[] args) {

    }
}



