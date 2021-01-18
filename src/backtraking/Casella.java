package backtraking;


public class Casella {
  private int numeroPases;
  private boolean ocupada;
  
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
    
}
