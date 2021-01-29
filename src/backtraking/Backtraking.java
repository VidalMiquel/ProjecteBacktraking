package backtraking;

public class Backtraking {

    
    public static void main(String[] args) {
        KnightTour.solveKT();
    }
    
    public void programaPrincipal(){
        Cavall objecte = new Cavall();
        System.out.println("DIMENSIO TAULER: ");
        int dimensio = LT.readInt();
        Tauler tablero = new Tauler(dimensio);
        int [][] aux;
        int [][] operandos;
        System.out.println(tablero.toString());
      
        System.out.println(objecte.toString());
        
        System.out.println("CASELLA QUE OCUPARA INICIALMENT EL CAVALL");
        System.out.print("COORDENADA X: ");
        int x = LT.readInt();
        System.out.print("COORDENADA Y: ");
        int y = LT.readInt();
        
        aux = Cavall.aplicarOperandos(x, y);

        for(int i = 0; i<2; i++){
            for(int j = 0; j<8; j++){
                System.out.print(aux[i][j] + " ");
            }
            System.out.println("\n");
        }
        
        operandos = tablero.verificacioPosicions(aux);
        
         for(int i = 0; i<2; i++){
            for(int j = 0; j<8; j++){
                System.out.print(operandos[i][j] + " ");
            }
            System.out.println("\n");
        }
        
    }
    
}
