package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Vaccine;
import com.example.view.ResultView;

// Service layer interface – defines the operations we support

public interface IVaccineService {
	
	public List<ResultView>  fetchByCost(Double cost);
	

   
}
