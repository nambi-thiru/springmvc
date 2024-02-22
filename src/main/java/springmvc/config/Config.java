package springmvc.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages  = {"springmvc"})
public class Config {
	
//	@Bean
//	public EntityManager getEntityManager() {
//		EntityManager em = Persistence.createEntityManagerFactory("nnn").createEntityManager();
//		return em;
//	}
//	
//	@Bean
//	public EntityTransaction getTransaction() {
//		return Persistence.createEntityManagerFactory("nnn").createEntityManager().getTransaction();
//	}
	
//	@Bean
//	public ModelAndView getModelView() {
//		return new ModelAndView();
//	}

}
