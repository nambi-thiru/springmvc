package springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmvc.dto.User;
@Repository
public class UserDao {
	
	EntityManager em = Persistence.createEntityManagerFactory("nnn").createEntityManager();
	
	EntityTransaction et = Persistence.createEntityManagerFactory("nnn").createEntityManager().getTransaction();
//	@Autowired
//	EntityManager em;
//	
//	@Autowired
//	EntityTransaction et;
	
	public User saveUser(User u) {
		et.begin();
		em.persist(u);
		et.commit();
		return u;
	}
	
	public User findUser(int userId) {
		User exisUser = em.find(User.class, userId);
		if(exisUser != null)
			return exisUser;
		else
			return null;
	}
	
	public User deleteById(int id) {
		User exisUser = em.find(User.class, id);
		if(exisUser != null) {
			et.begin();
			em.remove(exisUser);
			et.commit();
			return exisUser;
		}
		else
			return null;
	}
	
	public User updateUser(User u, int id) {
		User exisUser = em.find(User.class, id);
		if(exisUser != null) {
			u.setUserId(id);
			et.begin();
			em.merge(u);
			et.commit();
			return u;
		}
		else
			return null;
	}
	
	public User findByMail(String userMail) { 
		Query query = em.createQuery("select u from User u where u.userMail = ?1");  
		query.setParameter(1, userMail); 
		return (User) query.getSingleResult();
	}
	
//	public List<User> getAll(){
//		Query query = em.createQuery("select u from User u ");   
//		return query.getResultList();
//	}

}
