package backtraking;


public class Algoritme {
    

    Tauler auxiliar;
    Boolean encertat;
    Casella casella;
    private int numCaselles = 0;
    
    public Algoritme(Tauler tauler){
        auxiliar = tauler;
    }
    
    
    public void algoritmeRecursiu(int x, int y){
       
        numCaselles++;
        int [][] possiblesMoviments;
        int [][] movimentsCorrectes;
        possiblesMoviments = Cavall.aplicarOperandos(x, y);
        movimentsCorrectes = auxiliar.verificacioPosicions(possiblesMoviments);
        
        encertat = false;
        
        while(auxiliar.getCasella()[x][y].movimentsRealitzats(auxiliar.getDimensio())){
            
            if(!auxiliar.getCasella()[x][y].isOcupada()){
                
            }
        }
        
    }
    
}
