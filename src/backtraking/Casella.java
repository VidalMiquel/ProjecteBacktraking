package backtraking;


public class Casella {
  private int numeroPases;
  private boolean ocupada;
  private int numeroCicles;
  
  public Casella(){
      
      numeroPases = 0;
      ocupada = false;
  }

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
    
    public boolean movimentsRealitzats(int i){
        
        return !(numeroPases<((i*i)-1));
    }
    
}