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

        for(rows = 0; rows < slopeMap.length; rows++){
            for(columns = 0; columns < slopeMap[rows].length; columns++){
                return slopeMap[rows][columns] == '.' || slopeMap[rows][columns] == '#';
            }
        }
        return false;
    }
    public static boolean isRightValid(char [][] slopeMap, int right){
        return !(right >= slopeMap.length || right < 1);
    }
    public static boolean isDownValid(char[][] slopeMap, int down){
        return !(down >= slopeMap[0].length || down < 1);
    }

}
