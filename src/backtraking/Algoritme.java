package backtraking;


public class Algoritme {
    

    private Tauler auxiliar;
    private Boolean encertat;
    private Casella casella;
    private int numCaselles = 0;
    private int dimensio = 1;
    private int [][] movimentsAnotats = new int [dimensio][2];
    
    
    public Algoritme(Tauler tauler){
        auxiliar = tauler;
    }
    
    public Algoritme(){
        
    }
    
    //MÈTODE RECURISU DE MOMENT TORNA VOID, HEM DE MODIFICAR-HO
    public void algoritmeRecursiu(int x, int y){
       
        numCaselles++;
        int [][] possiblesMoviments;
        int [][] movimentsCorrectes;
        int coordX;
        int coordY;
        possiblesMoviments = Cavall.aplicarOperandos(x, y);
        movimentsCorrectes = auxiliar.verificacioPosicions(possiblesMoviments);
        
        encertat = false;
        //ASSIGNAM A LA CASELLA AMB LA QUAL FAREM FEINA EL NUMERO DE PASSES REALITZADES
        //PER ARRIBAR LA CASELLA I-ÈSSIMA
        auxiliar.getCasella()[x][y].setNumeroPases(numCaselles);
        //GUARDAM FINS UNA VARIBALE EL PRIMER MOVIMENT POSSIBLE DE LA CASELLA
        //A PARTIR DE LA PASSADA PER PARÀMETRE (ESTAT RESULTANT)
        coordX = movimentsCorrectes[0][0];
        coordY = movimentsCorrectes[0][1];
        //EMMAGATZAM DINS LA MATRIU DE LOBJECTE RESULTAT LA MATRIU FIFO 
        Resultat res = existeixenOperadorsAplicables(movimentsCorrectes);
        //MENTRES NO HEM REALITZAT N+N MOVIMENTS PER ARRIBAR A LA CASELLA PASSADA PER PARAMETRE
        //I LA VARIBALE BOOLEANA DE L'OBJECTE RES SIGUI TRUE ENTRAM 
        while(auxiliar.getCasella()[x][y].movimentsRealitzats(auxiliar.getDimensio())&&res.isResultat()){ //esta fet
            //estat resultant sha de calcualr, es es res.primeraPosicio
            //esta dins is fet 
         
        //MIRAM SI LA CASELLA DE L'ESTAT RESULTANT HA ESTAT VISITAT ANTERIORMENT
            if(!auxiliar.getCasella()[coordX][coordY].isOcupada()){
                //metode anotarlo ESTA FET
                // SI NO HEM REALITZAT N+N MOVIMENTS PER ARRIBAR A LA CASELLA ESTAT RESULTANT
                if(auxiliar.getCasella()[coordX][coordY].movimentsRealitzats(auxiliar.getDimensio())){
                    //CRIDADA RECURSIVA
                    algoritmeRecursiu(coordX,coordY);
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
    
    
    //MÈTODE QUE RETORNA UN OBJECTE RESULTAT AMB LA MATRIU FIFO I UN BOOLEA
    //SI EL BOOLEA ES TRUE: EXISTEIXEN OPERANDOS A APLICAR
    //LA MATRIU TE ELS OPERANDOS NO APLICATS ENCARA (MOVIMENTS QUE FARA EL CAVALL)
    public Resultat existeixenOperadorsAplicables(int [][] operadorsAplicables){
        
        Resultat objecte = new Resultat();
        int auxiliar[][] = new int [operadorsAplicables.length-1][2];
       
        if(operadorsAplicables.length== 0){
            objecte.setResultat(false);
        }else{
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
    
    //MÈTODE QUE ASSIGNA VALORS A LA MATRIU DECLARADA COM A ATRIBUT A LA CLASSE ALGORITME
    //AQUEST METODE NO FUNICONA COM TOCA ARA MATEIX, ESTA SOLUCIONAT A UNA ALTRA BRANCA ANOMENADA VERSIO JOAN
    //FUNCIONA COM UNA FILO
    public void anotarEstatResultant(int x, int y){
        //ME FICA UN 00 A SA POSICO 1 DE SARRAY PERQUE ??
       dimensio++;
       int j = 0;
       int [][] auxiliar = movimentsAnotats;
       movimentsAnotats = new int [dimensio][2];
            movimentsAnotats[0][0] = x;
            movimentsAnotats[0][1] = y;
            
            for (int i = 1; i< movimentsAnotats.length && i<auxiliar.length; i++  ){
                movimentsAnotats[i][0] = auxiliar[j][0];
                movimentsAnotats[i][1] = auxiliar[j][1];
                 j++;
            }
            
            System.out.println(movimentsAnotats.length + "p"); 
             String  tmp = "";
             
           for(int z = 0; z<movimentsAnotats.length;z++){
               for(int k = 0; k<2;k++){
               
               tmp = tmp + movimentsAnotats[z][k];   
               }
               tmp = tmp + "\n";
           }
           
           System.out.println(tmp);
           
           
           
       }
    
    
    
    
}
