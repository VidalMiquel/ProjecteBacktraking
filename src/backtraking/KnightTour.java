package backtraking;

class KnightTour {
    static boolean solucioRecursiva(int x, int y, int contadorMoviment,
                                    Tauler tauler, int xMovimentCavall[],
                                    int YMovimentCavall[])
    {
        int k, next_x, next_y;
        if (contadorMoviment == tauler.getDimensioX() * tauler.getDimensioX())
            return true;

        for (k = 0; k < xMovimentCavall.length; k++) {
            next_x = x + xMovimentCavall[k];
            next_y = y + YMovimentCavall[k];
            if (esUnaBonaPosicio(next_x, next_y, tauler)) {
                tauler[next_x][next_y] = contadorMoviment;
                if (solucioRecursiva(next_x, next_y, contadorMoviment + 1,
                        tauler, xMovimentCavall, YMovimentCavall))
                    return true;
                else
                    tauler[next_x][next_y]
                            = -1; // ojo aixo es sa clau
            }
        }

        return false;
    }

    static boolean esUnaBonaPosicio(int x, int y, int sol[][])
    {
        return (x >= 0 && x < N && y >= 0 && y < N
                && sol[x][y] == -1);
    }
}
