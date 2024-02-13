package utils;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil { 
	
	public static EntityManager em;
//    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();
//    
//    // EntityManagerFactory = le decimos con qué conexión hay que trabajar.
//
//    private static EntityManagerFactory buildEntityManagerFactory(){
//        return Persistence.createEntityManagerFactory("hibernateOracle");
//        // CreateEntityManagerFactory = crea un entity con el nombre que le pasamos de la conexión de la base de datos.
//        
//    }
//
//    public static EntityManager getEntityManager() { 
//        return entityManagerFactory.createEntityManager();
//        
//    }
    
	public static EntityManager getEM () {
		
		return getEM("hibernateOracl");

	}
	
	
    
    public static EntityManager getEM (String persistenceunit) {
    	
    if (em == null) {	
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceunit);
    	em = emf.createEntityManager(); 
    }	
    	return em;
    }
}
    
    
    
    

