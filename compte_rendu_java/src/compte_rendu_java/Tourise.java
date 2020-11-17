package compte_rendu_java;

public class Tourise extends Client{
private String  pays;
//"client1","client1","C1",8,"France
public Tourise (String pays) {
	super();
	this.pays=pays;
}
public Tourise (String[] arg,String pays) {
	super(arg);
	this.pays=pays;
}
public String toString()
{return (super.toString()); }
public void afficher () {
	System.out.println("Touriste :"+this);
}

}
