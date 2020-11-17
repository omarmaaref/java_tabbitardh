package compte_rendu_java;

public class Priviligie extends Client {
private String societe ;
public Priviligie (String societe) {
	super();
	this.societe=societe;
	
}
public Priviligie (String[] arg,String societe) {
	super(arg);
	this.societe=societe;
	
}
public String toString()
{return (super.toString()); }
public void afficher () {
	System.out.println("Priviligie :"+this);
}

}
