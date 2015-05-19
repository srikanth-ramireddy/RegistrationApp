package xpadro.thymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xpadro.thymeleaf.dao.HotelDao;
import xpadro.thymeleaf.exception.GuestFoundException;
import xpadro.thymeleaf.model.Guest;
import xpadro.thymeleaf.model.HotelData;

@Service("hotelServiceImpl")
public class HotelServiceImpl implements HotelService {
	@Autowired
	HotelDao hoteldao;

	@Override
	public HotelData getHotelData() {
		HotelData data = new HotelData();
		data.setAddress("Catalunya Square, 225");
		data.setName("Barcelona Hotel");
		
		return data;
	}

	

	@Override
	public void insertNewGuest(Guest newGuest) {
		
		
		hoteldao.saveEmployee(newGuest);
	}
}
