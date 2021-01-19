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
        
        return !(((x<0)||(x>dimensio-1))||((y<0)||(y>dimensio-1)));
    }
    
    
    
    public int [][] verificacioPosicions(int [][] resultat){
        int [][] auxiliar = new int [2][8];
        
            int i = 0;
            for(int j = 0; j<8; j++){
                if(maximaDimensio(resultat[0][j], resultat[1][j])){
                    auxiliar[0][i]= resultat[0][j];
                    auxiliar[1][i]= resultat[1][j]; 
                    i++;
                }
            }
            return auxiliar;
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
