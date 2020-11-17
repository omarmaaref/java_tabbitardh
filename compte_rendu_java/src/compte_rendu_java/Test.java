package compte_rendu_java;


public class Test {
public static void main(String[] args) {
Hotel h = new Hotel();
h.initialiser();
Tourise c1 = new Tourise(new String[]{"client1","client1","C1","8"},"France");
Tourise c2 = new Tourise(new String[]{"client2","client2","C2","5"},"maroc");
Priviligie c3 = new Priviligie(new String[]{"client3","client3","C3","6"},"SNCFT");
h.louer(c1, true);
h.louer(c2, false);
h.louer(c3, false);
h.afficher();
h.liberer(0);
h.afficher();
}}