package e2;

public class Slopes {

    public static int downTheSlope(char[][] slopeMap, int right, int down) {
        boolean go = true;
        int cont = 0;
        int i = 0, j = 0; // Comienza en la esquina superior izquierda de la matriz
        int aux;

        if(!MatrixUtils.isMapSquare(slopeMap)) throw new IllegalArgumentException("Map is not square");
        if(!MatrixUtils.areMapCharactersValid(slopeMap)) throw new IllegalArgumentException("Map characters are not valid");
        if(!MatrixUtils.isRightValid(slopeMap, right)) throw new IllegalArgumentException("Right is not valid");
        if(!MatrixUtils.isDownValid(slopeMap, down)) throw new IllegalArgumentException("Down is not valid");

        while(go) {

            for (aux = j; aux < j+right; aux++) {
                if (slopeMap[i][aux] == '#') cont++;
                if(aux > slopeMap[0].length - 1) aux = aux - slopeMap.length;
            }
            j += right;

            for(aux = i; aux < i + down; aux++){
                if(slopeMap[aux][j] == '#') cont++;
                if(aux >= slopeMap.length - 1) { //cuando esto es true es cuando tira el fallo, ultima iteracion
                    go = false;
                    aux = slopeMap[0].length - 1;
                }
            }
            i+=down;
        }
        return cont;
    }

    public static int jumpTheSlope(char[][] slopeMap, int right, int down){
        return 0;
    }


   /* public static void main(String[] args) {

    }*/
}



