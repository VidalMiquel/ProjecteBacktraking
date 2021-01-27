package backtraking;


public class Casella {
  private int numeroPases;
  private boolean ocupada;
  
  public Casella(){
      
      numeroPases = 0;
      ocupada = false;
  }
    //GETTERS I SETTERS
    public int getNumeroPases() {
        return numeroPases;
    }

    public void incrementarNumeroPases() {
        this.numeroPases++;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public void setNumeroPases(int numeroPases) {
        this.numeroPases = numeroPases;
    }
    
    //MÈTODE COMPROVA SI EL NUMERO DE PASSES REALITZATS PER ARRIBAR A UNA CASELLA
    //ES IGUAL A LA DIMENIO DEL TAURELL
    public boolean movimentsRealitzats(int i){
        
        return !(numeroPases<((i*i)+1));
    }
    
}