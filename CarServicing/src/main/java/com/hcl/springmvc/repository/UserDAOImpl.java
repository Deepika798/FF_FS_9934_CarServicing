/**
 * 
 */
package com.hcl.springmvc.repository;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.hcl.springmvc.model.BillDetails;
import com.hcl.springmvc.model.DeliveryBoy;
import com.hcl.springmvc.model.Login;
import com.hcl.springmvc.model.ServiceCenter;
import com.hcl.springmvc.model.ServicesProvided;
import com.hcl.springmvc.model.User;
import com.hcl.springmvc.util.HibernateUtil;

/**
 * @author lingad2
 *
 */
@Repository
public class UserDAOImpl implements UserDAO {

	@Override
	public boolean register(User usr) {
		// TODO Auto-generated method stub
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			session.beginTransaction(); // not required for select
			User user = new User();
			user.setFirstName(usr.getFirstName());
			user.setLastName(usr.getLastName());
			user.setId(usr.getId());
			user.setPassword(usr.getPassword());
			user.setConfirmPassword(usr.getConfirmPassword());
			user.setRoleId(usr.getRoleId());
			user.setAge(usr.getAge());
			user.setContactNumber(usr.getContactNumber());
			user.setGender(usr.getGender());
			session.save(user);
			session.getTransaction().commit();// not required for select
			// HibernateUtil.shutdown();// if exception occurs (remove this line)
			return true;
		} catch (Exception e) {
			System.out.println("Error occured during insertion " + e.getMessage());
			return false;
		}
	}

	@Override
	public boolean login(Login login) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			session.beginTransaction(); // not required for select
			String selQuery = ("select count(distinct (Id)) from user u where u.Id ='" + login.getId()
					+ "' and u.password='" + login.getPassword() + "'");
			Query query = session.createSQLQuery(selQuery);
			Integer temp = ((BigInteger) query.getResultList().get(0)).intValue();
			if (temp != 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			System.out.println("Error occured during fetching the data " + e.getMessage());
			return false;
		}

	}

	public boolean servicecenter(ServiceCenter sc) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			ServiceCenter servicecenter = new ServiceCenter();
			servicecenter.setId(sc.getId());
			servicecenter.setCenterName(sc.getCenterName());
			servicecenter.setFullAddress(sc.getFullAddress());
			servicecenter.setContactNumber(sc.getContactNumber());
			servicecenter.setStartDate(sc.getStartDate());
			servicecenter.setEndDate(sc.getEndDate());
			servicecenter.setDeliveryBoyId(sc.getDeliveryBoyId());
			servicecenter.setRating(sc.getRating());
			servicecenter.setId("S01");
			//servicecenter.setDeliveryBoyId(518878);
			session.save(servicecenter);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			System.out.println("Exception occured during inserting data:" + e.getMessage());
			return false;
		}
	}

	public boolean servicesprovided(ServicesProvided sp) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			ServicesProvided servicesprovided = new ServicesProvided();
			//servicesprovided.setId(sp.getId());
			servicesprovided.setServiceName(sp.getServiceName());
			servicesprovided.setServiceCost(sp.getServiceCost());
			servicesprovided.setServiceCenterId(sp.getServiceCenterId());
			session.save(servicesprovided);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			System.out.println("Exception occured during inserting data:" + e.getMessage());
			return false;
		}
	}

	public boolean billdetails(BillDetails bd) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			BillDetails billdetails = new BillDetails();
			billdetails.setId(bd.getId());
			billdetails.setBillAmount(bd.getBillAmount());
			billdetails.setUserId(bd.getUserId());
			billdetails.setServiceCenterId(bd.getServiceCenterId());
			session.save(billdetails);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			System.out.println("Exception occured during inserting data:" + e.getMessage());
			return false;
		}
	}
	
	public boolean deliveryboy(DeliveryBoy db) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			DeliveryBoy deliveryboy=new DeliveryBoy();
			deliveryboy.setId(db.getId());
			deliveryboy.setName(db.getName());
			deliveryboy.setPhoneNumber(db.getPhoneNumber());
			deliveryboy.setRoleId(db.getRoleId());
			session.save(deliveryboy);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			System.out.println("Exception occured during inserting data:" + e.getMessage());
			return false;
		}
	}
}
