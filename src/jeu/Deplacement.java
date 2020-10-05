package jeu;

public class Deplacement {
    private int x0, y0, x1, y1;
    // dans cet exemple on va prendre les x commes les lignes et les y comme les
    // colonnes

    public Deplacement() {
    }

    public Deplacement(int x0, int y0, int x1, int y1) {

        this.x0 = x0;
        this.x1 = x1;
        this.y0 = y0;
        this.y1 = y1;

    }

    public char typeDeplacement() {

        if (x0 == x1)
            return 'h'; // meme ligne
        if (y0 == y1)
            return 'v'; // meme colonne
        if (Math.abs(x1 - x0) == Math.abs(y1 - y0))
            return 'd';
        if ((Math.abs(x1 - x0) == 1) && (Math.abs(y1 - y0) == 2)
                || ((Math.abs(x1 - x0) == 2) && (Math.abs(y1 - y0) == 1)))
            return 'c';
        else
            return 'x'; // autre
    }

    public int dist()
    // distance entre le point de départ et le point d'arrivée
    {

        switch (this.typeDeplacement()) {
            case 'h':
                return Math.abs(y1 - y0);
            case 'v':
                return Math.abs(x1 - x0);
            case 'd':
                return Math.abs(x1 - x0);
            default:
                return -1;

        }
    }

    public int getX0() {
        return x0;
    }

    public int getX1() {
        return x1;
    }

    public int getY0() {
        return y0;
    }

    public int getY1() {
        return y1;
    }

}
