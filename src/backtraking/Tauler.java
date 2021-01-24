package backtraking;

public class Tauler {

    private int dimensio;
    private int numeroCasellesOcupades;
    private Casella[][] casella;

    public Casella[][] getCasella() {
        return casella;
    }

    public Tauler(int dimensio) {
        this.dimensio = dimensio;
        this.numeroCasellesOcupades = 0;
        inicialitzarTauler();

    }

    private void inicialitzarTauler() {
        casella = new Casella[dimensio][dimensio];
        for (int i = 0; i < dimensio; i++) {
            for (int j = 0; j < dimensio; j++) {
                casella[i][j] = new Casella();
            }
        }

    }

    public int getDimensio() {
        return dimensio;
    }

    public int getNumeroCasellesOcupades() {
        return numeroCasellesOcupades;
    }

    public void setNumeroCasellesOcupades() {
        this.numeroCasellesOcupades++;
    }

    public boolean maximaDimensio(int x, int y) {

        return !(((x < 0) || (x > dimensio - 1)) || ((y < 0) || (y > dimensio - 1)));
    }

    private int dimensioFinal(int x, int y) {

        int resultat = 0;
        if (!(((x < 0) || (x > dimensio - 1)) || ((y < 0) || (y > dimensio - 1)))) {
            resultat++;
        }

        return resultat;
    }

    public int[][] verificacioPosicions(int[][] resultat) {

        int[][] auxiliar = new int[8][2];
        int [][]aux;
        int longitud = 0;

        int i = 0;
        for (int j = 0; j < 8; j++) {
            if (maximaDimensio(resultat[j][0], resultat[j][1])) {
                auxiliar[i][0] = resultat[j][0];
                auxiliar[i][1] = resultat[j][1];
                i++;
            }else{
                auxiliar[i][0] = -1;
                auxiliar[i][1] = -1;
                i++;
            }
        }
        for (int r = 0; r < 8; r++) {
            if (!(auxiliar[r][0] == -1 && auxiliar[r][1] == -1)) {
                longitud++;
            }
        }
            System.out.println(longitud);

            aux = new int[longitud][2];

            int z = 0;
            for (int t = 0; t < 8; t++) {
                if (!(auxiliar[t][0] == -1 && auxiliar[t][1] == -1)) {
                    aux[z][0] = auxiliar[t][0];
                    aux[z][1] = auxiliar[t][1];
                    z++;
                }
            }
        
       return aux; 
    }

    @Override
    public String toString() {
        String tmp = "";
        for (int i = 0; i < dimensio; i++) {
            for (int j = 0; j < dimensio; j++) {
                // tmp = tmp + "Posicio " +i+j + " ";
                // System.out.println(i + " " + j );
                tmp = tmp + casella[i][j].getNumeroPases() + " ";
            }
            tmp = tmp + "\n";
        }
        return tmp;
    }

}
