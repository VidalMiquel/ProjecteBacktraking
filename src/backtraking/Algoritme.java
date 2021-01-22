package backtraking;


public class Algoritme {
    

    Tauler auxiliar;
    Boolean encertat;
    Casella casella;
    private int numCaselles = 0;
    
    public Algoritme(Tauler tauler){
        auxiliar = tauler;
    }
    
    public Algoritme(){
        
    }
    
    
    public void algoritmeRecursiu(int x, int y){
       
        numCaselles++;
        int [][] possiblesMoviments;
        int [][] movimentsCorrectes;
        possiblesMoviments = Cavall.aplicarOperandos(x, y);
        movimentsCorrectes = auxiliar.verificacioPosicions(possiblesMoviments);
        
        encertat = false;
        auxiliar.getCasella()[x][y].setNumeroPases(numCaselles);
        Resultat res = existeixenOperadorsAplicables(movimentsCorrectes);
        while(auxiliar.getCasella()[x][y].movimentsRealitzats(auxiliar.getDimensio())&&res.isResultat()){ //esta fet
            //estat resultant sha de calcualr, es es res.primeraPosicio
            //esta dins is fet 
        
            if(!auxiliar.getCasella()[res.getPosicioX()][res.getPosicioY()].isOcupada()){
                //metode anotarlo
                if(auxiliar.getCasella()[res.getPosicioX()][res.getPosicioY()].movimentsRealitzats(auxiliar.getDimensio())){
                    
                    algoritmeRecursiu(res.getPosicioX(),res.getPosicioY());
                    if(!encertat){
                        //eliminarNotacio sha de fer
                }
                }
            }
        }
        if(!auxiliar.getCasella()[x][y].movimentsRealitzats(auxiliar.getDimensio())){
            encertat = true;
        }else{
            encertat = false;
        }
    }
    
    
    
    public Resultat existeixenOperadorsAplicables(int [][] operadorsAplicables){
        
        Resultat objecte = new Resultat();
        int auxiliar[][] = new int [operadorsAplicables.length-1][2];
       
        if(operadorsAplicables.length== 0){
            objecte.setResultat(false);
            
        }else{
            objecte.setPosicioX(operadorsAplicables[0][0]);
            objecte.setPosicioY(operadorsAplicables[0][1]);
        int z = 0;
        for(int i = 1; i< operadorsAplicables.length;i++){
            for(int j = 0; j<2; j++){
                auxiliar[z][j] = operadorsAplicables[i][j];
                auxiliar[z][j] = operadorsAplicables[i][j];  
            }
            z++;
        }
        objecte.setMatriu(auxiliar);  
        objecte.setResultat(true);
        }
        
      
      
        
        return objecte;
    }
    
}
