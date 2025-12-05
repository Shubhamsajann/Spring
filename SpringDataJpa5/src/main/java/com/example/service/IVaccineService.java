package com.example.service;

import java.util.List;

import com.example.view.View;

// Service layer interface – defines the operations we support

public interface IVaccineService {
	
	public <T extends View>List<T> fetchByCostLessThan(Double cost,Class<T> cls);
	

   
}
