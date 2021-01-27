package backtraking;

public class Resultat {

    private boolean resultat;
    private int[][] matriu;

    public Resultat() {

    }

    //GETTERS I SETTERS 
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

    //IMPRIMIR PER PANTALLA LA MATRIU ASSOCIADA AL ATRIBUT MATRIU
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
