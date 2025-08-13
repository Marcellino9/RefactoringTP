package iut.bad;

public class Humain {
	protected String nom;
    protected String prenom;
    protected int age;

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public void details() {
        System.out.println(nom + " " + prenom + " (" + age + " ans)");
    }
    @Override
    public String toString() {
        return nom + " " + prenom + " (" + age + " ans)";
    }
    public void manger() {
        System.out.println(nom + " mange.");
    }

    public void boire() {
        System.out.println(nom + " boit.");
    }

}
