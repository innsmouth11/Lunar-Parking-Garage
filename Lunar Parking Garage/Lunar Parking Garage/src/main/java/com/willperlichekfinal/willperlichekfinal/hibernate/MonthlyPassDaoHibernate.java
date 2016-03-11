package com.willperlichekfinal.willperlichekfinal.hibernate;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;
import com.willperlichekfinal.willperlichekfinal.daos.MonthlyPassDao;
import com.willperlichekfinal.willperlichekfinal.entities.MonthlyPass;

/**
 * MonthlyPassDaoHibernate
 * 
 * Connects to database and persists MonthlyClass data for create, read, and
 * update
 * 
 * @author wperlichek
 *
 */
@Component
@Transactional
public class MonthlyPassDaoHibernate implements MonthlyPassDao {

	/*
	 * Define EntityManager and set it to MonthlyPass class to connect to the
	 * database
	 */
	@PersistenceContext
	private EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	/* CREATE */
	public void addMonthlyPass(MonthlyPass monthlyPass) {
		em.persist(monthlyPass);
	};

	/* UPDATE */
	public void updateMonthlyPassById(MonthlyPass monthlyPass) {
		em.merge(monthlyPass);
		em.flush();
	};

	/* DELETE */
	@Override
	public void deleteMonthlyPassById(Integer id) {
		MonthlyPass monthPass = em.find(MonthlyPass.class, id);
		em.remove(monthPass);
		em.flush();
	}

	/* READ */
	public MonthlyPass getMonthlyPassById(Integer monthly_pass_id) {
		return em.createQuery("SELECT e FROM MonthlyPass e WHERE e.monthly_pass_id = :id", MonthlyPass.class)
				.setParameter("id", monthly_pass_id).getSingleResult();
	};

	/* READ */
	public List<MonthlyPass> getAllMonthlyPass() {
		return em.createQuery("SELECT e FROM MonthlyPass e", MonthlyPass.class).getResultList();
	}

}
