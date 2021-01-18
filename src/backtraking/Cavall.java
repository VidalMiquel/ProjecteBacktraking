package backtraking;


public class Cavall {
 
    private static final int [][] matriu = {{2,1,-1,-2,-2,-1,1,2},{-1,-2,-2,-1,1,2,2,1}};
    private static final int dimensioX = 2;
    private static int dimensioY = 8;

    public Cavall(){
        
    }
    
    public void imprimirLon(){
        System.out.println(matriu[0][0]);
        System.out.println(matriu[1][7]);
    }
    public int [][] aplicarOperandos(int x, int y){
        int[][] matriuOperandos = new int [dimensioX][dimensioY];
            for(int j = 0; j<dimensioY; j++){
                matriuOperandos[0][j]= matriu[0][j] + x;
                matriuOperandos[1][j]= matriu[1][j] + y; 
            }
        return matriuOperandos;
    }
    
    @Override
    public String toString(){
        String tmp = "";
        for(int i = 0; i<dimensioX; i++){
            for(int j = 0; j<dimensioY; j++){
                tmp = tmp + matriu[i][j] + " ";
            }
            tmp = tmp + "\n";
        }
        return tmp;
    }
}