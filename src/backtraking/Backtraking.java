package backtraking;

public class Backtraking {

    
    public static void main(String[] args) {
        new Backtraking().programaPrincipal();
    }
    
    public void programaPrincipal(){
        Algoritme recursiu = new Algoritme();
        Resultat ob = new Resultat();
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
        
        
        for(int i = 0; i<8; i++){
            for(int j = 0; j<2; j++){
                System.out.print(aux[i][j] + " ");
            }
            System.out.println("\n");
        }
        
        
        
        
        operandos = tablero.verificacioPosicions(aux);
        
        for(int i = 0; i<operandos.length; i++){
            for(int j = 0; j<2; j++){
                System.out.print(operandos[i][j] + " ");
            }
            System.out.println("\n");
        }
        
      ob =  recursiu.existeixenOperadorsAplicables(operandos);
        
        System.out.println(ob.matriuToString());
        System.out.println("");
     
         
         
         
        
    }
    
}
