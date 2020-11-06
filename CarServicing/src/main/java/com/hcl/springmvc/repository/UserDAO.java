package com.hcl.springmvc.repository;

import java.util.List;

import com.hcl.springmvc.model.BillDetails;
import com.hcl.springmvc.model.DeliveryBoy;
import com.hcl.springmvc.model.Login;
import com.hcl.springmvc.model.ServiceCenter;
import com.hcl.springmvc.model.ServicesProvided;
import com.hcl.springmvc.model.User;

/**
 * @author lingad2
 *
 */
public interface UserDAO {
	boolean register(User usr);

	boolean login(Login login);

	boolean servicecenter(ServiceCenter sc);
	boolean servicesprovided(ServicesProvided sp);
	boolean billdetails(BillDetails bd);
	boolean deliveryboy(DeliveryBoy db);
}
