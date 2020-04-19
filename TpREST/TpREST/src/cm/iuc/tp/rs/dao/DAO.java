package cm.iuc.tp.rs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cm.iuc.tp.rs.metier.Livre;

public class DAO {

	public int saveLivre(Livre livre) {
		int i = 0;
		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : Création d'un objet statement

			String sql = "insert into `livre`(`ref`,`titre`,`editeur`,`genre`,`nombre_page`)" + "values (?,?,?,?,?)";

			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, livre.getRef());
			ps.setString(2, livre.getTitre());
			ps.setString(3, livre.getEditeur());
			ps.setString(4, livre.getGenre());
			ps.setInt(5, livre.getNombre_page());

			// Etape 3 : exécution requête
			ps.executeUpdate();
			i++;
			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();

			return i;

		}

		return i;

	}

	public List<Livre> getAllLivres() {

		// création d'une collection d'enseignants
		List<Livre> maListLivre = new ArrayList<Livre>();

		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : préparation requête
			Statement st = cn.createStatement();

			String sql = "SELECT* FROM `livre`";

			// Etape 3 : exécution requête
			ResultSet rs = st.executeQuery(sql);

			// Etape 4 :parcours Resultset (optionnel)
			while (rs.next()) {
				Livre livre = new Livre();
				livre.setRef(rs.getString("ref"));
				livre.setTitre(rs.getString("titre"));
				livre.setEditeur(rs.getString("editeur"));
				livre.setGenre(rs.getString("genre"));
				livre.setNombre_page(rs.getInt("nombre_page"));

				maListLivre.add(livre); // cette instruction permet d'inserer l'objet enseignant dans ma liste
										// d'enseignant

			}

			// Etape 5 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();

		}

		return maListLivre;
	}

//	public int modifierLivre(Livre livre) {
//		
//		try {
//
//			// Etape 1 : récupération de la connexion
//			Connection cn = ConnectionMYSQL.getInstance();
//
//			// Etape 2 : Création d'un objet  statement
//			
//
//			String sql = "UPDATE enseignant SET ue='"+enseignant.getUe()+"' WHERE idens='"+enseignant.getIdEns()+"'"; 
//							
//			PreparedStatement ps=  cn.prepareStatement(sql);
//			ps.setString(2, enseignant.getUe());
//		
//			// Etape 3 : exécution requête
//			ps.executeUpdate();
//			
//			
//		}catch(SQLException e) {
//			System.out.println("Erreur");
//		}
//		
//		return 1;
//	}

}
