package backtraking;

public class Backtraking {

    
    public static void main(String[] args) {
        new Backtraking().programaPrincipal();
    }
    
    public void programaPrincipal(){
        Cavall objecte = new Cavall();
        Tauler tablero = new Tauler(3);
        int [][] aux;
        System.out.println(tablero.toString());
      if(tablero.maximaDimensio(4,3)){
          System.out.println("Tamany Correcte");
      }else{
          System.out.println("Tamany incorrecte");
      }
      
        System.out.println(objecte.toString());
        aux = objecte.aplicarOperandos(1, 2);
        
        for(int i = 0; i<2; i++){
            for(int j = 0; j<8; j++){
                System.out.print(aux[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
    
}
