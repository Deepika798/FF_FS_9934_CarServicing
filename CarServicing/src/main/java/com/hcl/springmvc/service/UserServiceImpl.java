/**
 * 
 */
package com.hcl.springmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.springmvc.model.BillDetails;
import com.hcl.springmvc.model.DeliveryBoy;
import com.hcl.springmvc.model.Login;
import com.hcl.springmvc.model.ServiceCenter;
import com.hcl.springmvc.model.ServicesProvided;
import com.hcl.springmvc.model.User;
import com.hcl.springmvc.repository.UserDAOImpl;

/**
 * @author lingad2
 *
 */
@Service
public class UserServiceImpl implements UserService {

	UserDAOImpl userDAO = new UserDAOImpl();

	@Override
	public boolean register(User usr) {
		// UserDAOImpl userDAO = new UserDAOImpl();
		return userDAO.register(usr);
		// TODO Auto-generated method stub
	}

	@Override
	public boolean login(Login login) {
		// TODO Auto-generated method stub

		return userDAO.login(login);
	}

	@Override
	public boolean servicecenter(ServiceCenter sc) {
		UserDAOImpl userDAO = new UserDAOImpl();
		return userDAO.servicecenter(sc);
		
	}
	@Override
	public boolean servicesprovided(ServicesProvided sp) {
		UserDAOImpl userDAO = new UserDAOImpl();
		return userDAO.servicesprovided(sp);
		
	}
	@Override
	public boolean billdetails(BillDetails bd) {
		UserDAOImpl userDAO = new UserDAOImpl();
		return userDAO.billdetails(bd);
		
	}
	@Override
	public boolean deliveryboy(DeliveryBoy db) {
		UserDAOImpl userDAO = new UserDAOImpl();
		return userDAO.deliveryboy(db);
		
	}


}
