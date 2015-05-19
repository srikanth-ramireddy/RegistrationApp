package xpadro.thymeleaf.dao;

import xpadro.thymeleaf.model.Guest;

public class HotelDaoImpl extends AbstractDao implements HotelDao {
	
		@Override
	public void saveEmployee(Guest guest) {
		// TODO Auto-generated method stub
		persist(guest);
	}

}
