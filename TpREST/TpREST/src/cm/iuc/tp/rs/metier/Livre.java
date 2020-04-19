package cm.iuc.tp.rs.metier;

public class Livre {
	private String ref;
	private String titre;
	private String editeur;
	private String genre;
	private int nombre_page;
	
	public Livre() {
		super();
	}


	public Livre(String ref, String title, String editeur, String genre, int nombre_page) {
		super();
		this.ref = ref;
		this.titre = title;
		this.editeur = editeur;
		this.genre = genre;
		this.nombre_page = nombre_page;
	}


	public String getRef() {
		return ref;
	}


	public void setRef(String ref) {
		this.ref = ref;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String title) {
		this.titre = title;
	}


	public String getEditeur() {
		return editeur;
	}


	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public int getNombre_page() {
		return nombre_page;
	}


	public void setNombre_page(int nombre_page) {
		this.nombre_page = nombre_page;
	}
	
	
	
}
