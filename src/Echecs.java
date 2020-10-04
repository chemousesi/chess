public class Echecs {

    static Plateau p = new Plateau(5, 5);

    public static void main(String[] args) {
        // initialisation du plateau avec des pièces
        System.out.println("helllo");
        p.afficher();
        Deplacement d = new Deplacement(1, 1, 1, 4);
        System.out.println(d.typeDeplacement());
        System.out.println(d.dist());
    }

}
