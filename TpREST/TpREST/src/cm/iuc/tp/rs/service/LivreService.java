package cm.iuc.tp.rs.service;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cm.iuc.tp.rs.dao.DAO;
import cm.iuc.tp.rs.metier.Livre;

@Path("/btec")
public class LivreService {
	DAO method = new DAO();
		
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int t(Livre livre) {
		return method.saveLivre(livre);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Livre> getAllLivres() {
		 return method.getAllLivres();
	}
	
	
}
