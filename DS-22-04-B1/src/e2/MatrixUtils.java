package e2;

public class MatrixUtils {
    public static boolean isMapSquare (char [][] slopeMap) {
        for (char[] chars : slopeMap) {
            if (slopeMap.length != chars.length)
                return false;
        }
        return true;
    }

    public static boolean areMapCharactersValid(char [][] slopeMap){
        int rows, columns;
        for(rows = 0; rows < slopeMap[rows].length; rows++){
            for(columns = 0; columns < slopeMap[columns].length; columns++){
                if(slopeMap[rows][columns] != '.' || slopeMap[rows][columns] != '#') return false;

            }
        }
        return true;
    }
    public static boolean isRightValid(char [][] slopeMap, int right){
        return right >= slopeMap[0].length && right < 1;
    }
    public static boolean isDownValid(char[][] slopeMap, int down){
        return down >= slopeMap.length && down < 1;
    }

    /*public static void checkMatrix(char[][] slopeMap, int right, int down){

    }*/
}
