import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import utils.JpaUtil;

public class testDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernateOracle");
    	EntityManager em = JpaUtil.getEM();

	}

}
