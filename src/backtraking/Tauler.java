package backtraking;

public class Tauler {
    
    private int dimensio;
    private int numeroCasellesOcupades;
    private Casella [][] casella;
    
    public Tauler(int dimensio){
        this.dimensio = dimensio;
        this.numeroCasellesOcupades = 0;
        inicialitzarTauler();
        
    }
    
    
    private void inicialitzarTauler(){
        casella = new Casella[dimensio][dimensio];
        for(int i = 0; i< dimensio; i++){
            for(int j = 0; j< dimensio; j++){
                 casella[i][j] = new Casella();
            }
        }
        
    }

    public int getDimensioX() {
        return dimensio;
    }

    

    public int getNumeroCasellesOcupades() {
        return numeroCasellesOcupades;
    }

    public void setNumeroCasellesOcupades() {
        this.numeroCasellesOcupades++;
    }
    
    public boolean maximaDimensio(int x, int y){
        
        return !(((x<0)||(x>dimensio))||((y<0)||(y>dimensio)));
    }
    
    @Override
    public String  toString(){
        String tmp = "";
      for(int i = 0; i< dimensio; i++){
          for(int j = 0; j<dimensio; j++){
             // tmp = tmp + "Posicio " +i+j + " ";
             // System.out.println(i + " " + j );
             tmp = tmp + casella[i][j].getNumeroPases()+ " ";
          }
          tmp = tmp + "\n";
      }
      
      return tmp;
    }
    
    
    
    
}
