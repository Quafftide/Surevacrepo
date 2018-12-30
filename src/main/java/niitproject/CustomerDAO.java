package niitproject;

import java.util.ArrayList;
import java.util.List;

/*import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;*/

import javax.persistence.*;

public class CustomerDAO {
	
	/*public static void main(String []arg) {	
		
	} */
	
	public void addCustomerComplaint(Customer c )
	{
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction t = em.getTransaction();
		
		t.begin();
		
		em.persist(c);
		
		t.commit();
		
		em.close();	
		
		
		
	}
	 List<Customer> checkComplaintStatus(String email )
	{	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		t.begin();
		
		
		Query query = em.createNativeQuery("select c.cust_name c.cust_complaint c.cust_complaint from Customer  where c.cust_email =:email");
		query.setParameter("email",email);
		List<Customer> list = query.getResultList();
	
		t.commit();
		
		
		return list;
	}
	

}
	