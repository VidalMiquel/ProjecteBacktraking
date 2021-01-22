package backtraking;


public class Cavall {
 
 
    private static final int [][] matriu = {{2,-1},{1,-2},{-1,-2},{-2,-1},{-2,1},{-1,2},{1,2},{2,1}};
    private static final int dimensioX = 8;
    private static int dimensioY = 2;

    public Cavall(){
        
    }
    
   
    public  static int [][] aplicarOperandos(int x, int y){
        int[][] matriuOperandos = new int [dimensioX][dimensioY];
            for(int j = 0; j<dimensioX; j++){
                matriuOperandos[j][0]= matriu[j][0] + x;
                matriuOperandos[j][1]= matriu[j][1] + y; 
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