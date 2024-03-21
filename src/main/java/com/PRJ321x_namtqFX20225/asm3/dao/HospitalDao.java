package com.PRJ321x_namtqFX20225.asm3.dao;

import java.util.List;

import com.PRJ321x_namtqFX20225.asm3.entity.Hospital;

public interface HospitalDao {
	
	public List<Hospital> searchByName(String search);

	public List<Hospital> searchByAddress(String theSearch);

	public List<Hospital> searchHospitalBySpecialization(String theSearch);

	public List<Hospital> searchByPrice(String theSearch);

	public List<Hospital> findAll();
			
}
