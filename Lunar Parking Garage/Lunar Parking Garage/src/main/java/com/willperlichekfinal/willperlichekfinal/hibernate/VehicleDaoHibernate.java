package com.willperlichekfinal.willperlichekfinal.hibernate;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;

import com.willperlichekfinal.willperlichekfinal.daos.VehicleDao;
import com.willperlichekfinal.willperlichekfinal.entities.Vehicle;

/**
 * VehicleDaoHibernate
 * 
 * Connects to database and persists Vehicle class for create, update, and
 * reading Vehicles
 * 
 * @author wperlichek
 *
 */
@Component
@Transactional
public class VehicleDaoHibernate implements VehicleDao {

	/*
	 * Define EntityManager and set it to Vehicle class to connect to the
	 * database
	 */
	@PersistenceContext
	private EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	/* CREATE */
	public void addVehicle(Vehicle vehicle) {
		em.persist(vehicle);
	};

	/* UPDATE */
	public void updateVehicleById(Vehicle vehicle) {
		em.merge(vehicle);
	};

	/* READ */
	public Vehicle getVehicleById(Integer vehicle_identificationNumber) {
		return null;
		// return em.createQuery("SELECT e FROM Vehicle e WHERE
		// e.vehicle_identificationNumber = :id", Vehicle.class)
		// .setParameter("id", vehicle_identificationNumber).getSingleResult();
	};

	/* READ */
	public List<Vehicle> getAllVehicles() {
		return em.createQuery("SELECT e FROM Vehicle e", Vehicle.class).getResultList();
	}
}
