package daos;

import java.util.List;

import jakarta.persistence.EntityManager;
import servlets.Mobiliario;
import utils.JpaUtil;

public class MobiliarioDAO  {
	
	private EntityManager em = JpaUtil.getEM();
	
	
// método listar desde bbdd
	
	public List<Mobiliario> get () {
		
		List<Mobiliario> muebles = em.createQuery("from Mobiliario").getResultList();
		return muebles;
	}
	
// método listar por PK desde bbdd
	
	public Mobiliario getByPk (long id) {
		 Mobiliario mueble=em.find(Mobiliario.class, id);
		 return mueble;
	}
	
// método insertar en bbdd	
	
	public void insert (Mobiliario mueble) {
		System.out.println("Comenzando la carga de muebles en la bbdd");
		this.em.getTransaction().begin();
		try{
			em.persist(mueble);
			this.em.getTransaction().commit();
		}catch (Exception e) {
			System.out.println("Error al insertar mueble " + e.getMessage());
			this.em.getTransaction().rollback();
		}
	
	}
	
	
	

}
