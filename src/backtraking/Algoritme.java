package backtraking;

public class Algoritme {

    private Tauler auxiliar;
    private Boolean encertat;
    private Casella casella;
    private int numCaselles = 0;
    private int dimensio = 1;
    private int[][] movimentsAnotats;

    public Algoritme(Tauler tauler) {
        auxiliar = tauler;
        inicialitzarMovimentsAnotats();
    }

    public Algoritme() {
        inicialitzarMovimentsAnotats();
    }

    public void algoritmeRecursiu(int x, int y) {

        numCaselles++;
        int[][] possiblesMoviments;
        int[][] movimentsCorrectes;
        int coordX;
        int coordY;
        possiblesMoviments = Cavall.aplicarOperandos(x, y);
        movimentsCorrectes = auxiliar.verificacioPosicions(possiblesMoviments);

        encertat = false;
        auxiliar.getCasella()[x][y].setNumeroPases(numCaselles);
        coordX = movimentsCorrectes[0][0];
        coordY = movimentsCorrectes[0][1];
        Resultat res = existeixenOperadorsAplicables(movimentsCorrectes);
        while (auxiliar.getCasella()[x][y].movimentsRealitzats(auxiliar.getDimensio()) && res.isResultat()) { //esta fet
            //estat resultant sha de calcualr, es es res.primeraPosicio
            //esta dins is fet 

            if (!auxiliar.getCasella()[coordX][coordY].isOcupada()) {
                //metode anotarlo
                if (auxiliar.getCasella()[coordX][coordY].movimentsRealitzats(auxiliar.getDimensio())) {

                    algoritmeRecursiu(coordX, coordY);
                    if (!encertat) {
                        //eliminarNotacio sha de fer
                    }
                }
            }
        }
        if (!auxiliar.getCasella()[x][y].movimentsRealitzats(auxiliar.getDimensio())) {
            encertat = true;
        } else {
            encertat = false;
        }
    }

    public Resultat existeixenOperadorsAplicables(int[][] operadorsAplicables) {

        Resultat objecte = new Resultat();
        int auxiliar[][] = new int[operadorsAplicables.length - 1][2];

        if (operadorsAplicables.length == 0) {
            objecte.setResultat(false);
        } else {
            int z = 0;
            for (int i = 1; i < operadorsAplicables.length; i++) {
                for (int j = 0; j < 2; j++) {
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

    public void anotarEstatResultant(int x, int y) {
        //ME FICA UN 00 A SA POSICO 1 DE SARRAY PERQUE ??
        dimensio++;
        int j = 0;
        int[][] auxiliar = movimentsAnotats;
        inicialitzarMovimentsAnotats();

        movimentsAnotats[0][0] = x;
        movimentsAnotats[0][1] = y;
        System.out.println("entrada" + x + y);

        for (int i = 1; i < movimentsAnotats.length && i < auxiliar.length; i++) {
            movimentsAnotats[i][0] = auxiliar[j][0];
            movimentsAnotats[i][1] = auxiliar[j][1];
            j++;
        }

        System.out.println(movimentsAnotats.length-1 + "p");
        String tmp = "";

        for (int z = 0; z < movimentsAnotats.length; z++) {
            for (int k = 0; k < 2; k++) {
                if (movimentsAnotats[z][k] != -1) {
                    tmp = tmp + movimentsAnotats[z][k];
                }
            }
            tmp = tmp + "\n";
        }
        System.out.println(tmp);

    }

    private void inicialitzarMovimentsAnotats() {
        movimentsAnotats = new int[dimensio][2];
        for (int i = 0; i < movimentsAnotats.length; i++) {
            for (int j = 0; j < 2; j++) {
                movimentsAnotats[i][j] = -1;
            }
        }
    }

}
