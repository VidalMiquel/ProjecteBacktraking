package backtraking;

public class Resultat {

    private boolean resultat;
    private int[][] matriu;

    public Resultat() {

    }

    public boolean isResultat() {
        return resultat;
    }

    public void setResultat(boolean resultat) {
        this.resultat = resultat;
    }

    public int[][] getMatriu() {
        return matriu;
    }

    public void setMatriu(int[][] matriu) {
        this.matriu = matriu;
    }

    public String matriuToString() {
        String tmp = "";
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < 2; j++) {
                tmp = tmp + matriu[i][j];
            }
            tmp = tmp + "\n";
        }
        return tmp;
    }

}
