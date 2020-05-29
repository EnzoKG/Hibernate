package hibernate;

import javax.persistence.*;

public class CadastroController {

	EntityManagerFactory emf;
	EntityManager em;
	
	public CadastroController()
	{
		emf = Persistence.createEntityManagerFactory("cadastro");
		em = emf.createEntityManager();
	}
	
	public void save(Cadastro _cadastro)
	{
		try {
			em.getTransaction().begin();
			em.merge(_cadastro);
			em.getTransaction().commit();
			emf.close();
		} catch(Exception sqle) {
			System.out.println("Error... "+sqle.getMessage());
		}
	}
	
	public void remove(Cadastro _cadastro)
	{
		try {
			em.getTransaction().begin();
			Query q = em.createNamedQuery("DELETE cadastro FROM cadastro WHERE nome = "+_cadastro.getNome());
			q.executeUpdate();
			em.getTransaction().commit();
			emf.close();
		} catch(Exception e) {
			System.out.println("Error... "+e.getMessage());
		}
	}
	
}
