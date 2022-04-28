package Bajaj.finiserv.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/bajaj")
public class BajajController {
	
	@PostMapping("/all")
	public String getStudent( ) {
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
 		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
 		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
 		Session session = sessionFactory.openSession();
 		Transaction transaction = session.beginTransaction();

 		Query query = session.createQuery("from Bajaj");

 		

 		transaction.commit();
 		

 		session.close();

 	

        return null;
		
	}
	
}
